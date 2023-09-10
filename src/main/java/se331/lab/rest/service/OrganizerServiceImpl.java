package se331.lab.rest.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import se331.lab.rest.dao.OrganizerDao;
import se331.lab.rest.entity.Organizer;

@Service
public class OrganizerServiceImpl implements OrganizerService {
    @Autowired
    OrganizerDao organizeDao;


    @Override
    public Integer getOrganizerSize() {
        return organizeDao.getOrganizerSize();
    }

    @Override
    public Page<Organizer> getOrganizers(Integer pageSize, Integer page) {
        return organizeDao.getOrganizers(pageSize, page);
    }

    @Override
    public Organizer getOrganizer(Long id) {
        return organizeDao.getOrganizer(id);
    }

    @Override
    public Organizer save(Organizer organizer) {
        return organizeDao.save(organizer);
    }
}
