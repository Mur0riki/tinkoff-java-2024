package edu.java.data.dao;

import edu.java.data.exceptions.DoubleChatRegistrationException;
import edu.java.data.exceptions.NoSuchChatException;
import edu.java.data.exceptions.NoSuchLinkException;
import edu.java.data.postgres.entities.Chat;
import edu.java.data.postgres.entities.ChatLink;
import edu.java.data.postgres.entities.Link;
import edu.java.data.postgres.repositories.ChatLinksRepository;
import edu.java.data.postgres.repositories.ChatRepository;
import java.net.URI;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ChatDAO implements ChatDataAccessObject {
    private final ChatRepository chatRepository;
    private final ChatLinksRepository chatLinksRepository;
    private final LinkDAO linkDao;

    public ChatDAO(
        @Qualifier("jdbcClientChatRepository") ChatRepository chatRepository,
        @Qualifier("jdbcClientChatLinksRepository") ChatLinksRepository chatLinksRepository,
        LinkDAO linkDao
    ) {
        this.chatRepository = chatRepository;
        this.chatLinksRepository = chatLinksRepository;
        this.linkDao = linkDao;
    }

    public Optional<Chat> findById(long id) {
        return chatRepository.findById(id);
    }

    public Set<Link> getTrackedLinksByChatId(long id) {
        Chat chat = chatRepository.findById(id)
            .orElseThrow(() -> new NoSuchChatException(id));
        long chatId = chat.getId();

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

    public Link associateUrlByChatId(String url, long chatId) {
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

    public Link dissociateUrlByChatId(String url, long chatId) {
        if (chatRepository.findById(chatId).isEmpty()) {
            throw new NoSuchChatException(chatId);
        }

        Link link = linkDao.findByUrl(url)
            .orElseThrow(() -> new NoSuchLinkException(URI.create(url)));

        chatLinksRepository.removeByChatIdAndLinkId(chatId, link.getId());
        return link;
    }

    public Chat registerChatWithId(long apiId) {
        Optional<Chat> oldChat = chatRepository.findById(apiId);
        if (oldChat.isPresent()) {
            throw new DoubleChatRegistrationException(apiId);
        }
        Chat newChat = new Chat(apiId);
        chatRepository.save(newChat);
        return newChat;
    }

    public void deleteChatWithId(long chatId) {
        if (chatRepository.findById(chatId).isEmpty()) {
            throw new NoSuchChatException(chatId);
        }
        chatRepository.removeById(chatId);
    }
}
