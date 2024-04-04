package edu.java.data.dao.jpa.dao;

import edu.java.data.dao.initialStateScreeners.UniversalInitialStateScreener;
import edu.java.data.dao.interfaces.LinkDataAccessObject;
import edu.java.data.dao.jpa.entities.LinkJpaEntity;
import edu.java.data.dao.jpa.entities.utils.mappers.LinkJpaMapper;
import edu.java.data.dao.jpa.repositories.LinkJpaRepository;
import edu.java.data.dto.Link;
import edu.java.data.exceptions.NoSuchLinkException;
import java.net.URI;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional
public class LinkJpaDAO implements LinkDataAccessObject {

    private final LinkJpaRepository linkRepository;
    private final UniversalInitialStateScreener initialStateScreener;

    private final LinkJpaMapper linkJpaMapper;

    @Override
    public Optional<Link> findByUrl(URI url) {
        var jpaLink = findJpaByUrl(url);
        return linkJpaMapper.toOptionalDto(jpaLink);
    }

    Optional<LinkJpaEntity> findJpaByUrl(URI url) {
        return linkRepository.findByUrl(url);
    }

    @Override
    public Optional<Link> findById(long id) {
        var jpaLink = findJpaById(id);
        return linkJpaMapper.toOptionalDto(jpaLink);
    }

    Optional<LinkJpaEntity> findJpaById(long id) {
        return Optional.of(linkRepository.getReferenceById(id));
    }

    @Override
    public Link saveOrFindByUrl(URI url) {
        var jpaLink = saveJpaOrFindByUrl(url);
        return linkJpaMapper.toDto(jpaLink);
    }

    LinkJpaEntity saveJpaOrFindByUrl(URI url) {
        return linkRepository.findByUrl(url)
            .orElseGet(() -> {
                var newLink = new LinkJpaEntity(url);
                newLink = linkRepository.saveAndFlush(newLink);
                initialStateScreener.saveInitialState(linkJpaMapper.toDto(newLink));
                return newLink;
            });
    }

    @Override
    public Set<Link> findByLastCheckedAtBefore(LocalDateTime borderDateTime) {
        return linkRepository.findByLastCheckedAtBefore(toInstant(borderDateTime)).stream()
            .map(linkJpaMapper::toDto)
            .collect(Collectors.toSet());
    }

    @Override
    public Set<Long> findAssociatedChatsIdsByLinkId(long id) {
        var jpaLink = findJpaByIdOrThrowException(id);

        return jpaLink
            .getAssociations().stream()
            .map(pair -> pair.getChat().getId())
            .collect(Collectors.toSet());
    }

    @Override
    public void updateLastCheckedAtById(LocalDateTime lastChecked, long id) {
        var link = findJpaByIdOrThrowException(id);
        link.setLastCheckedAt(toInstant(lastChecked));
    }

    private Instant toInstant(LocalDateTime localDateTime) {
        return localDateTime.atOffset(ZoneOffset.UTC).toInstant();
    }

    LinkJpaEntity findJpaByIdOrThrowException(long id) {
        return Optional.of(linkRepository.getReferenceById(id))
            .orElseThrow(() -> new NoSuchLinkException(id));
    }

    LinkJpaEntity findJpaByUrlOrThrowException(URI url) {
        return linkRepository.findByUrl(url)
            .orElseThrow(() -> new NoSuchLinkException(url));
    }
}
