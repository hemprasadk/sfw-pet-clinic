package prasad.springframework.sfwpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Owner;
import prasad.springframework.sfwpetclinic.model.Pet;
import prasad.springframework.sfwpetclinic.repository.OwnerRepository;
import prasad.springframework.sfwpetclinic.repository.PetRepository;
import prasad.springframework.sfwpetclinic.repository.PetTypeRepository;
import prasad.springframework.sfwpetclinic.services.OwnerService;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJPAService implements OwnerService {


    private OwnerRepository ownerRepository;
    private PetRepository petRepository;
    private PetTypeRepository petTypeRepository;

    public OwnerSDJPAService(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }




    @Override
    public Owner findByLastname(String lastname) {
        return ownerRepository.findByLastname(lastname);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> ownerSet = new HashSet<>();
        ownerRepository.findAll().forEach(owner -> ownerSet.add(owner));
        return ownerSet;
    }

    @Override
    public Owner finById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);

    }

    @Override
    public void delete(Owner object) {

        ownerRepository.delete(object);
    }
}
