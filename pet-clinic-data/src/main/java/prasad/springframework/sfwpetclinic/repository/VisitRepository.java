package prasad.springframework.sfwpetclinic.repository;

import org.springframework.data.repository.CrudRepository;
import prasad.springframework.sfwpetclinic.model.Visit;

public interface VisitRepository extends CrudRepository<Visit,Long> {
}
