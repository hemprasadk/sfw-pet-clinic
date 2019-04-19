package prasad.springframework.sfwpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Pet;
import prasad.springframework.sfwpetclinic.model.PetType;
import prasad.springframework.sfwpetclinic.repository.PetTypeRepository;
import prasad.springframework.sfwpetclinic.services.PetService;
import prasad.springframework.sfwpetclinic.services.PetTypeService;

import java.util.HashSet;
import java.util.Set;
@Service
@Profile("springdatajpa")
public class PetTypeServiceSDJPADService implements PetTypeService {

    public PetTypeServiceSDJPADService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    private final PetTypeRepository petTypeRepository;

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypeSet = new HashSet<>();
        petTypeRepository.findAll().forEach(petType -> petTypeSet.add(petType));
        return petTypeSet;
    }

    @Override
    public void delete(PetType object) {
        petTypeRepository.delete(object);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public PetType finById(Long aLong) {
        return petTypeRepository.findById(aLong).orElse(null);
    }

    @Override
    public void deleteById(Long aLong) {
        petTypeRepository.deleteById(aLong);
    }

}
