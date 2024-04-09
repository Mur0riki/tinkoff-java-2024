package edu.java.data.dao.jdbc.dao;

import edu.java.data.dao.interfaces.ChatDataAccessObject;
import edu.java.data.dao.jdbc.repositories.ChatJdbcRepository;
import edu.java.data.dao.jdbc.repositories.ChatLinksJdbcRepository;
import edu.java.data.dto.Chat;
import edu.java.data.dto.ChatLink;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.DoubleChatRegistrationException;
import edu.java.data.exceptions.NoSuchChatException;
import edu.java.data.exceptions.NoSuchLinkException;
import java.net.URI;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class ChatJdbcDAO implements ChatDataAccessObject {

    private final ChatJdbcRepository chatRepository;
    private final ChatLinksJdbcRepository chatLinksRepository;
    private final LinkJdbcDAO linkDao;

    @Override
    public Optional<Chat> findById(long id) {
        return chatRepository.findById(id);
    }

    @Override
    public Set<Link> getTrackedLinksByChatId(long chatId) {
        if (chatRepository.findById(chatId).isEmpty()) {
            throw new NoSuchChatException(chatId);
        }

        return buildSetOfLinks(chatId);
    }

    private Set<Link> buildSetOfLinks(long chatId) {
        return chatLinksRepository.findByChatId(chatId)
            .stream()
            .map(chatLinkCouple -> {
                long linkId = chatLinkCouple.getLinkId();
                return linkDao.findById(linkId).orElseThrow(() -> new NoSuchLinkException(linkId));
            }).collect(Collectors.toSet());
    }

    @Override
    public Link associateUrlByChatId(URI url, long chatId) {
        if (chatRepository.findById(chatId).isEmpty()) {
            throw new NoSuchChatException(chatId);
        }

        Link link = linkDao.saveOrFindByUrl(url);

        assignLinkToChat(link.getId(), chatId);
        return link;
    }

    private void assignLinkToChat(long linkId, long chatId) {
        ChatLink chatLinkCouple = new ChatLink(chatId, linkId);
        chatLinksRepository.save(chatLinkCouple);
    }

    @Override
    public Link dissociateUrlByChatId(URI url, long chatId) {
        if (chatRepository.findById(chatId).isEmpty()) {
            throw new NoSuchChatException(chatId);
        }

        Link link = linkDao.findByUrl(url)
            .orElseThrow(() -> new NoSuchLinkException(url));

        chatLinksRepository.removeByChatIdAndLinkId(chatId, link.getId());
        return link;
    }

    @Override
    public Chat registerChatWithId(long id) {
        Optional<Chat> oldChat = chatRepository.findById(id);
        if (oldChat.isPresent()) {
            throw new DoubleChatRegistrationException(id);
        }
        Chat newChat = new Chat(id);
        chatRepository.save(newChat);
        return newChat;
    }

    @Override
    public void deleteChatWithId(long id) {
        if (chatRepository.findById(id).isEmpty()) {
            throw new NoSuchChatException(id);
        }
        chatRepository.removeById(id);
    }
}
