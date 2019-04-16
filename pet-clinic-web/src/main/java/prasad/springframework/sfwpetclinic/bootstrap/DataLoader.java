package prasad.springframework.sfwpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import prasad.springframework.sfwpetclinic.model.Owner;
import prasad.springframework.sfwpetclinic.model.Vet;
import prasad.springframework.sfwpetclinic.services.OwnerService;
import prasad.springframework.sfwpetclinic.services.VetService;
import prasad.springframework.sfwpetclinic.services.map.OwnerServiceMap;
import prasad.springframework.sfwpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }




    @Override
    public void run(String... args) throws Exception {

        Owner owner = new Owner();
        owner.setFirstname("Tom");
        owner.setLastname("Cruise");


        Owner owner1 = new Owner();
        owner1.setFirstname("Tom1");
        owner1.setLastname("Cruise1");

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
