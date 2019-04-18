package prasad.springframework.sfwpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import prasad.springframework.sfwpetclinic.model.Owner;
import prasad.springframework.sfwpetclinic.model.Pet;
import prasad.springframework.sfwpetclinic.model.PetType;
import prasad.springframework.sfwpetclinic.model.Vet;
import prasad.springframework.sfwpetclinic.services.OwnerService;
import prasad.springframework.sfwpetclinic.services.PetService;
import prasad.springframework.sfwpetclinic.services.PetTypeService;
import prasad.springframework.sfwpetclinic.services.VetService;
import prasad.springframework.sfwpetclinic.services.map.OwnerServiceMap;
import prasad.springframework.sfwpetclinic.services.map.VetServiceMap;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;





    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");

        PetType saveddogPet = petTypeService.save(dog);

        PetType cat = new PetType();
        dog.setName("Cat");

        PetType savedcatPet = petTypeService.save(cat);

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


        ownerService.save(owner);
        ownerService.save(owner1);

        System.out.println(" Loaded the Owner data");

        Vet vet = new Vet();
        vet.setFirstname("Tomv");
        vet.setLastname("Cruisev");
        vetService.save(vet);
        Vet vet1 = new Vet();

        vet1.setFirstname("Tomv1");
        vet1.setLastname("Cruisev1");


        vetService.save(vet1);

        System.out.println(" Loaded the vets data");


    }
}
