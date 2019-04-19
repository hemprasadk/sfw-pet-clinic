package prasad.springframework.sfwpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Visit;
import prasad.springframework.sfwpetclinic.services.VisitService;

import java.util.Set;

@Service
@Profile({"default","map"})

public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit object) {
        return super.save(object);
    }

    @Override
    public Visit finById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
            super.deleteByid(aLong);
    }
}
