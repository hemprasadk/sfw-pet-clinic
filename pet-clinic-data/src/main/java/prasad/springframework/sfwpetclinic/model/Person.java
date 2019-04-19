package prasad.springframework.sfwpetclinic.model;

import javax.persistence.*;

@MappedSuperclass
public class Person extends BaseEntitiy{

    @Column(name="firstname")
    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name="lastname")
    private String lastname;



}
