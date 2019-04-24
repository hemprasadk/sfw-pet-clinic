package prasad.springframework.sfwpetclinic.model;

import com.sun.tracing.dtrace.ArgsAttributes;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "owners")
public class Owner extends  Person {

    public Owner(Long id, String firstname, String lastname, String address, String city, String telephone, Set<Pet> pet) {
        super(id, firstname, lastname);
        this.address = address;
        this.city = city;
        Telephone = telephone;
        this.pet = pet;
    }

    @Column(name="address")
    private String address;
    @Column(name="city")
    private String city;
    @Column(name="telephone")
    private String Telephone;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pet =new HashSet<>();
   }
