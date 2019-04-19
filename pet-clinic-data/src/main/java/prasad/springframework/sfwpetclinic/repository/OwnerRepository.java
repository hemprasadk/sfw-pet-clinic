package prasad.springframework.sfwpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import prasad.springframework.sfwpetclinic.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner,Long> {

    Owner findByLastname(String lastname);
}
