package prasad.springframework.sfwpetclinic.services.map;

import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Pet;
import prasad.springframework.sfwpetclinic.model.PetType;
import prasad.springframework.sfwpetclinic.services.PetTypeService;

import java.util.Set;

@Service
public class PetTypeServiceSMap extends AbstractMapService<PetType, Long>  implements PetTypeService {


    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(PetType object) {
        super.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return super.save(object);
    }

    @Override
    public PetType finById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public void deleteById(Long aLong) {
            super.deleteByid(aLong);
    }
}
