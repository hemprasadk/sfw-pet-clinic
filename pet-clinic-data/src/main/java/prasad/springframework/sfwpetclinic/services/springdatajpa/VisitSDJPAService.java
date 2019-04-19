package prasad.springframework.sfwpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Visit;
import prasad.springframework.sfwpetclinic.repository.VisitRepository;
import prasad.springframework.sfwpetclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJPAService implements VisitService {

    public VisitSDJPAService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    private final VisitRepository visitRepository;

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visitSet = new HashSet<>();
        visitRepository.findAll().forEach(visit -> visitSet.add(visit));
        return null;
    }

    @Override
    public Visit finById(Long aLong) {

        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void deleteById(Long aLong) {

        visitRepository.deleteById(aLong);

    }

    @Override
    public void delete(Visit object) {

        visitRepository.delete(object);

    }
}
