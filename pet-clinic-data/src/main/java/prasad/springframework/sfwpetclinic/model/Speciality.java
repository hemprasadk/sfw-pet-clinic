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
@Table(name="speciality")
public class Speciality extends BaseEntitiy{

    @Column(name = "description")
    private String description;

}
