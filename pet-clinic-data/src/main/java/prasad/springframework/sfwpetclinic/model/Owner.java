package prasad.springframework.sfwpetclinic.model;

import java.util.Set;

public class Owner extends  Person {
    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    private Set<Pet> pet;
}
