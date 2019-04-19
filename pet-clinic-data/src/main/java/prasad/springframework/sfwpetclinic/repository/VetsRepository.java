package prasad.springframework.sfwpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import prasad.springframework.sfwpetclinic.model.Vet;

public interface VetsRepository extends CrudRepository<Vet,Long> {
}
