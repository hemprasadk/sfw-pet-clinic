package prasad.springframework.sfwpetclinic.services.map;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Owner;
import prasad.springframework.sfwpetclinic.model.Pet;
import prasad.springframework.sfwpetclinic.model.PetType;
import prasad.springframework.sfwpetclinic.services.CurdService;
import prasad.springframework.sfwpetclinic.services.OwnerService;
import prasad.springframework.sfwpetclinic.services.PetService;
import prasad.springframework.sfwpetclinic.services.PetTypeService;

import java.util.Set;

@Service
@Profile({"default","map"})
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    private PetTypeService petTypeService;
    private PetService petService;

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

        if (object != null)
        {
            if (object.getPet() != null )
            {
                object.getPet().forEach(pet -> {if(pet.getPetType() != null)
                {
                    if (pet.getPetType().getId() == null)
                    {
                        pet.setPetType(petTypeService.save(pet.getPetType()));
                    }
                }
                else
                {
                    throw new RuntimeException("PetType is equired");

                }
                if (pet.getId() == null)
                {
                    Pet savepet = petService.save(pet);
                    pet.setId(savepet.getId());
                }
                });
            }
            return super.save(object);
        }
        else {
            return null;
        }

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
