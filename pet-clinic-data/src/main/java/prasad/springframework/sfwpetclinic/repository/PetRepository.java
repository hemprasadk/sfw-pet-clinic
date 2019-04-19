package prasad.springframework.sfwpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import prasad.springframework.sfwpetclinic.model.Pet;

public interface PetRepository extends CrudRepository<Pet,Long> {
}
