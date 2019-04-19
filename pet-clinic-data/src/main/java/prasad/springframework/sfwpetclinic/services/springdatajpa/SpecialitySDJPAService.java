package prasad.springframework.sfwpetclinic.services.springdatajpa;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import prasad.springframework.sfwpetclinic.model.Speciality;
import prasad.springframework.sfwpetclinic.repository.SpecialityRepository;
import prasad.springframework.sfwpetclinic.services.SpecialityService;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class SpecialitySDJPAService implements SpecialityService {

    public SpecialitySDJPAService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    private final SpecialityRepository specialityRepository;


    @Override
    public Set<Speciality> findAll() {
        Set<Speciality> specialitySet = new HashSet<>();
        specialityRepository.findAll().forEach(speciality -> specialitySet.add(speciality));
        return specialitySet;
    }

    @Override
    public Speciality finById(Long aLong) {
        return specialityRepository.findById(aLong).orElse(null);
    }

    @Override
    public Speciality save(Speciality object) {
        return specialityRepository.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        specialityRepository.deleteById(aLong);
    }

    @Override
    public void delete(Speciality object) {
        specialityRepository.delete(object);
    }
}
