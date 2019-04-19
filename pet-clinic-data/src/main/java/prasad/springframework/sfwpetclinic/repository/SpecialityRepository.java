package prasad.springframework.sfwpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import prasad.springframework.sfwpetclinic.model.Speciality;

public interface SpecialityRepository extends CrudRepository<Speciality,Long> {
}
