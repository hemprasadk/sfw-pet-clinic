package prasad.springframework.sfwpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import prasad.springframework.sfwpetclinic.model.PetType;

public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}
