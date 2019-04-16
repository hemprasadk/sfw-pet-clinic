package prasad.springframework.sfwpetclinic.services.map;

import prasad.springframework.sfwpetclinic.model.Vet;
import prasad.springframework.sfwpetclinic.services.CurdService;
import prasad.springframework.sfwpetclinic.model.Vet;
import prasad.springframework.sfwpetclinic.services.CurdService;
import prasad.springframework.sfwpetclinic.services.map.AbstractMapService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CurdService<Vet,Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);

    }

    @Override
    public Vet finById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByid(id);

    }
}
