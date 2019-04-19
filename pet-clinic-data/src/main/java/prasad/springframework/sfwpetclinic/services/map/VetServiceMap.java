package prasad.springframework.sfwpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Speciality;
import prasad.springframework.sfwpetclinic.model.Vet;
import prasad.springframework.sfwpetclinic.services.CurdService;
import prasad.springframework.sfwpetclinic.model.Vet;
import prasad.springframework.sfwpetclinic.services.CurdService;
import prasad.springframework.sfwpetclinic.services.SpecialityService;
import prasad.springframework.sfwpetclinic.services.VetService;
import prasad.springframework.sfwpetclinic.services.map.AbstractMapService;

import java.util.Set;

@Service
@Profile({"default","map"})

public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

    private SpecialityService specialityService;

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

        if (object.getSpecialities().size() > 0 )
        {
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null)
                {
                   Speciality  savespeciality =  specialityService.save(speciality);
                   speciality.setId(savespeciality.getId());
                }
            });
        }

        return super.save(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteByid(id);

    }
}
