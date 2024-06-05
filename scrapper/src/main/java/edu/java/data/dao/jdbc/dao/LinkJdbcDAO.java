package edu.java.data.dao.jdbc.dao;

import edu.java.data.dao.initialStateScreeners.UniversalInitialStateScreener;
import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dao.jdbc.repositories.ChatLinksJdbcRepository;
import edu.java.data.dao.jdbc.repositories.LinkJdbcRepository;
import edu.java.data.dto.ChatLink;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.NoSuchLinkException;
import java.net.URI;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class LinkJdbcDAO implements LinkDataAccessObject {

    private final LinkJdbcRepository linkRepository;
    private final ChatLinksJdbcRepository chatLinksRepository;
    private final UniversalInitialStateScreener initialStateScreener;

    @Override
    public Optional<Link> findByUrl(URI url) {
        return linkRepository.findByUrl(url);
    }

    @Override
    public Optional<Link> findById(long id) {
        return linkRepository.findById(id);
    }

    @Override
    public Link saveOrFindByUrl(URI url) {
        return linkRepository.findByUrl(url)
            .orElseGet(() -> {
                Link newLink = new Link(url);
                newLink = linkRepository.save(newLink);
                initialStateScreener.saveInitialState(newLink);
                return newLink;
            });
    }

    @Override
    public Set<Link> findByLastCheckedAtBefore(LocalDateTime borderDateTime) {
        return linkRepository.findByLastCheckedAtBefore(borderDateTime);
    }

    @Override
    public Set<Long> findAssociatedChatsIdsByLinkId(long id) {
        return chatLinksRepository
            .findByLinkId(id)
            .stream()
            .map(ChatLink::getChatId)
            .collect(Collectors.toSet());
    }

    @Override
    public void updateLastCheckedAtById(LocalDateTime lastChecked, long id) {
        Link link = findLinkByIdOrThrowException(id);
        link.setLastCheckedAt(lastChecked);
        linkRepository.update(link);
    }

    private Link findLinkByIdOrThrowException(long id) {
        return linkRepository.findById(id)
            .orElseThrow(() -> new NoSuchLinkException(id));
    }

}
