package prasad.springframework.sfwpetclinic.services;

import prasad.springframework.sfwpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet finById(Long id);
    Pet save(Pet pet);
    Set<Pet> finall();
}
