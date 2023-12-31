package se331.lab.rest.dao;
// 6.5
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import se331.lab.rest.entity.Organizer;
import se331.lab.rest.repository.OrganizerRepository;

@Repository
@RequiredArgsConstructor
public class OrganizerDaoImpl implements OrganizerDao {
    final OrganizerRepository organizerRepository;

    @Override
    public Page<Organizer> getOrganizer(Pageable pageRequest) {
        return organizerRepository.findAll(pageRequest);
    }

    // 6.5
    @Override
    public Optional<Organizer> findById(Long id) {
        return organizerRepository.findById(id);
    }
}