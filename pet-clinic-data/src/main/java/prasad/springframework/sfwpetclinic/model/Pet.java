package prasad.springframework.sfwpetclinic.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="pets")
public class Pet extends BaseEntitiy {

    @ManyToOne
    @JoinColumn(name = "type_id")
    private PetType petType ;
    @Column(name="name")
    private String name;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Owner owner;
    @Column(name="birthDate")
    private LocalDate birthDate;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pet")
    Set<Visit> visitSet = new HashSet<>();
}

