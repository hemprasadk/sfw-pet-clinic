package prasad.springframework.sfwpetclinic.services.map;

import prasad.springframework.sfwpetclinic.model.BaseEntitiy;

import java.util.*;

public abstract class AbstractMapService <T extends BaseEntitiy, ID extends Long>{

    protected Map<Long ,T> map = new HashMap<>() ;

    Set<T>  findAll(){
        return new HashSet<T>(map.values());
    }

    T findById(ID id)
    {
        return map.get(id);
    }

    T save(T object)
    {
        if(object != null)
        {
            if (object.getId() == null)
            {
                object.setId(getNextId());
            }
        }
        map.put(object.getId(),object);

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

    private Long getNextId()
    {
        Long nextid = null;
        try {
            nextid = Collections.max(map.keySet())+1;
        } catch (NoSuchElementException e) {
            nextid = 1L;
        }

        return nextid;
    }


}
