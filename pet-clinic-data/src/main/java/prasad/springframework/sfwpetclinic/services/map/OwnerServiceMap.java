package prasad.springframework.sfwpetclinic.services.map;

import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Owner;
import prasad.springframework.sfwpetclinic.services.CurdService;
import prasad.springframework.sfwpetclinic.services.OwnerService;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);

    }

    @Override
    public Owner finById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByid(id);

    }

    @Override
    public Owner findByLastname(String lastname) {
        return null;
    }
}
