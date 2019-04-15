package prasad.springframework.sfwpetclinic.model;

public class Person {

    private String Firstname;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    private String Lastname;
}
