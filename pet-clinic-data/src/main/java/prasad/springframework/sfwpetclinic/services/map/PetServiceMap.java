package prasad.springframework.sfwpetclinic.services.map;

import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Pet;
import prasad.springframework.sfwpetclinic.model.Pet;
import prasad.springframework.sfwpetclinic.services.CurdService;
import prasad.springframework.sfwpetclinic.services.PetService;
import sun.security.krb5.internal.PAEncTSEnc;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);

    }

    @Override
    public Pet finById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByid(id);

    }
}
