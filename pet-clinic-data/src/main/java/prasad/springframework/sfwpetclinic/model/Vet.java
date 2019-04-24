package prasad.springframework.sfwpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Vets")
public class Vet extends Person {

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "vets_specialities",joinColumns = @JoinColumn(name="vets_id"),inverseJoinColumns = @JoinColumn(name="speciality_id"))
    private Set<Speciality> specialities = new HashSet<>();

}
