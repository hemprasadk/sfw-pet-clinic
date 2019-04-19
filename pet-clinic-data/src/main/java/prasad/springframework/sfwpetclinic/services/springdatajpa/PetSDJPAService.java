package prasad.springframework.sfwpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Pet;
import prasad.springframework.sfwpetclinic.repository.PetRepository;
import prasad.springframework.sfwpetclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetSDJPAService implements PetService {

    public PetSDJPAService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    private final PetRepository petRepository;

    @Override
    public Set<Pet> findAll() {

        Set<Pet> petSet = new HashSet<>();
        petRepository.findAll().forEach(pet -> petSet.add(pet));
        return petSet;
    }

    @Override
    public Pet finById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void deleteById(Long aLong) {

        petRepository.deleteById(aLong);

    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }
}
