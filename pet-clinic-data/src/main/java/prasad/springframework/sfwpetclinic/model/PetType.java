package prasad.springframework.sfwpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "types")
public class PetType extends BaseEntitiy {

    @Column(name = "name")
    private String name;

}
