package prasad.springframework.sfwpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Speciality;
import prasad.springframework.sfwpetclinic.services.SpecialityService;

import java.util.Set;
@Service
@Profile({"default","map"})
public class SpecaialityServiceMap extends AbstractMapService<Speciality,Long> implements SpecialityService {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);

    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public Speciality finById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteByid(aLong);
    }
}
