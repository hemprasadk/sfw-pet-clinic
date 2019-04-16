package prasad.springframework.sfwpetclinic.services;



import java.util.Set;

public interface CurdService<T, ID> {

    Set<T> findAll();
    T finById(ID id);
    T save(T object);
    void deleteById(ID id);
    void delete(T object);

}
