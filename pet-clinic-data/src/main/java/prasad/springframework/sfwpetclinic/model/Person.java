package prasad.springframework.sfwpetclinic.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class Person extends BaseEntitiy{

    @Builder
    public Person(Long id, String firstname, String lastname) {
        super(id);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Column(name="firstname")
    private String firstname;
    @Column(name="lastname")
    private String lastname;



}
