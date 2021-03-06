package prasad.springframework.sfwpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import prasad.springframework.sfwpetclinic.model.*;
import prasad.springframework.sfwpetclinic.services.*;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService, VisitService visitService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService =specialityService;
        this.visitService = visitService;
    }

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private  final SpecialityService specialityService;
    private final VisitService visitService;





    @Override
    public void run(String... args) throws Exception {

        int count = petTypeService.findAll().size();

        if (count == 0) {
            loadData();
        }

    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("Dog");

        PetType saveddogPet = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");

        PetType savedcatPet = petTypeService.save(cat);

        Speciality radioloigy = new Speciality();
        radioloigy.setDescription("Radiology");
        Speciality savedRadiology  = specialityService.save(radioloigy);

        Speciality denistiery = new Speciality();
        denistiery.setDescription("denistiery");
        Speciality savedDenistiery  = specialityService.save(denistiery);


        Speciality surgury = new Speciality();
        surgury.setDescription("surgury");
        Speciality savedSurgury  = specialityService.save(surgury);


        Owner owner = new Owner();
        owner.setFirstname("Tom");
        owner.setLastname("Cruise");
        owner.setAddress("10th Street ");
        owner.setCity("Ajax");
        owner.setTelephone("154-258-3695");


        Pet mike = new Pet();
        mike.setPetType(saveddogPet);
        mike.setBirthDate(LocalDate.now());
        mike.setName("oooliver");
        mike.setOwner(owner);
        owner.getPet().add(mike);


        Owner owner1 = new Owner();
        owner1.setFirstname("Tom1");
        owner1.setLastname("Cruise1");
        owner1.setAddress("10th Street ");
        owner1.setCity("Pickering");
        owner1.setTelephone("154-258-3695");

        Pet tommy = new Pet();
        tommy.setPetType(savedcatPet);
        tommy.setBirthDate(LocalDate.now());
        tommy.setName("tommy");
        tommy.setOwner(owner1);
        owner1.getPet().add(tommy);

        Visit catvisit = new Visit();
        catvisit.setDate(LocalDate.now());
        catvisit.setDescription("Sneez Cat");
        catvisit.setPet(tommy);

        ownerService.save(owner);
        ownerService.save(owner1);
        visitService.save(catvisit);
        System.out.println(" Loaded the Owner data");

        Vet vet = new Vet();
        vet.setFirstname("Tomv");
        vet.setLastname("Cruisev");
        vet.getSpecialities().add(radioloigy);
        vet.getSpecialities().add(denistiery);


        Vet vet1 = new Vet();

        vet1.setFirstname("Tomv1");
        vet1.setLastname("Cruisev1");
        vet1.getSpecialities().add(surgury);

        vetService.save(vet);
        vetService.save(vet1);

        System.out.println(" Loaded the vets data");
    }
}
