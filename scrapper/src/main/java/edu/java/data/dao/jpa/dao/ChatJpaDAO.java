package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dao.jpa.entities.AssociationJpa;
import edu.java.data.dao.jpa.entities.ChatJpaEntity;
import edu.java.data.dao.jpa.entities.utils.mappers.ChatJpaMapper;
import edu.java.data.dao.jpa.entities.utils.mappers.LinkJpaMapper;
import edu.java.data.dao.jpa.repositories.AssociationJpaRepository;
import edu.java.data.dao.jpa.repositories.ChatJpaRepository;
import edu.java.data.dto.Chat;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.DoubleChatRegistrationException;
import edu.java.data.exceptions.NoSuchChatException;
import java.net.URI;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class ChatJpaDAO implements ChatDataAccessObject {

    private final ChatJpaRepository chatRepository;
    private final AssociationJpaRepository associationRepository;
    private final LinkJpaDAO linkDao;

    private final ChatJpaMapper chatJpaMapper;
    private final LinkJpaMapper linkJpaMapper;

    @Override
    public Optional<Chat> findById(long id) {
        var jpaChat = chatRepository.findById(id);
        return chatJpaMapper.toOptionalDto(jpaChat);
    }

    @Override
    public Set<Link> getTrackedLinksByChatId(long chatId) {
        var jpaChat = findJpaByIdOrThrowException(chatId);

        return jpaChat
            .getAssociations().stream()
            .map(pair -> linkJpaMapper.toDto(pair.getLink()))
            .collect(Collectors.toSet());
    }

    @Override
    public Link associateUrlByChatId(URI url, long chatId) {
        var chat = findJpaByIdOrThrowException(chatId);
        var link = linkDao.saveJpaOrFindByUrl(url);

        var newAssociation = new AssociationJpa(chat, link);
        associationRepository.save(newAssociation);

        return linkJpaMapper.toDto(link);
    }

    @Override
    public Link dissociateUrlByChatId(URI url, long chatId) {
        var chat = findJpaByIdOrThrowException(chatId);
        var link = linkDao.findJpaByUrlOrThrowException(url);

        associationRepository.removeByChatAndLink(chat, link);

        return linkJpaMapper.toDto(link);
    }

    @Override
    public Chat registerChatWithId(long id) {
        if (chatRepository.existsById(id)) {
            throw new DoubleChatRegistrationException(id);
        }
        var chat = new ChatJpaEntity(id);
        chat = chatRepository.save(chat);
        return chatJpaMapper.toDto(chat);
    }

    @Override
    public void deleteChatWithId(long id) {
        var deletedChats = chatRepository.removeById(id);
        if (deletedChats == 0) {
            throw new NoSuchChatException(id);
        }
    }

    ChatJpaEntity findJpaByIdOrThrowException(long id) {
        return chatRepository.findById(id)
            .orElseThrow(() -> new NoSuchChatException(id));
    }
}
