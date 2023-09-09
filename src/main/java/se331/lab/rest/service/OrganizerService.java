package se331.lab.rest.service;
import org.springframework.data.domain.Page;
import se331.lab.rest.entity.Organizer;

public interface OrganizerService {
    public Integer getOrganizerSize();
    public Page<Organizer> getOrganizers(Integer pageSize, Integer page);
    public Organizer getOrganizer(Long id);
    Organizer save(Organizer organizer);
}
