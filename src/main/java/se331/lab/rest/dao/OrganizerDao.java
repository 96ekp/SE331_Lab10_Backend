package se331.lab.rest.dao;

import org.springframework.data.domain.Pageable;
// 6.5
import java.util.Optional;

import org.springframework.data.domain.Page;

import se331.lab.rest.entity.Organizer;

public interface OrganizerDao {
    Page<Organizer> getOrganizer(Pageable pageRequest);
//6.5
    Optional<Organizer> findById(Long id);
}