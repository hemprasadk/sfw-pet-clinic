package prasad.springframework.sfwpetclinic.services.map;

import java.util.*;

public abstract class AbstractMapService <T, ID>{

    protected Map<ID,T> map = new HashMap<>() ;

    Set<T>  findAll(){
        return new HashSet<T>(map.values());
    }

    T findById(ID id)
    {
        return map.get(id);
    }

    T save(ID id, T object)
    {
        map.put(id,object);

        return object;
    }

    void deleteByid(ID id )
    {
        map.remove(id);
    }

    void delete(T object)
    {
        map.entrySet().removeIf(idtEntry -> idtEntry.getValue().equals(object));
    }


}
