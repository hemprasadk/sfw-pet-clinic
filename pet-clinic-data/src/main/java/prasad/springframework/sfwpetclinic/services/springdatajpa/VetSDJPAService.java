package prasad.springframework.sfwpetclinic.services.springdatajpa;

import prasad.springframework.sfwpetclinic.model.Speciality;
import prasad.springframework.sfwpetclinic.model.Vet;
import prasad.springframework.sfwpetclinic.repository.SpecialityRepository;
import prasad.springframework.sfwpetclinic.repository.VetsRepository;
import prasad.springframework.sfwpetclinic.services.SpecialityService;
import prasad.springframework.sfwpetclinic.services.VetService;

import java.util.HashSet;
import java.util.Set;

public class VetSDJPAService implements VetService {


    public VetSDJPAService(VetsRepository vetsRepository, SpecialityRepository specialityRepository) {
        this.vetsRepository = vetsRepository;
        this.specialityRepository = specialityRepository;
    }

    private final VetsRepository vetsRepository;
    private final SpecialityRepository specialityRepository;




    @Override
    public Set<Vet> findAll() {

        Set<Vet> vetSet = new HashSet<>();
        vetsRepository.findAll().forEach(vet -> vetSet.add(vet));
        return vetSet;
    }

    @Override
    public Vet finById(Long aLong) {
        return vetsRepository.findById(aLong).orElse(null);
    }

    @Override
    public Vet save(Vet object) {

        /*if(object.getSpecialities().size() > 0)
        {
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId() == null)
                {
                    Speciality savespeciality =  specialityService.save(speciality);
                    speciality.setId(savespeciality.getId());
                }
            });
        }*/
        return vetsRepository.save(object);
    }

    @Override
    public void deleteById(Long aLong) {
        vetsRepository.deleteById(aLong);

    }

    @Override
    public void delete(Vet object) {

        vetsRepository.delete(object);

    }
}
