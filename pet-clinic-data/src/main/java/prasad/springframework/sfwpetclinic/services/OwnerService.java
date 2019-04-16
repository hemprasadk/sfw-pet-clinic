package prasad.springframework.sfwpetclinic.services;

import com.sun.xml.internal.bind.v2.model.core.ID;
import prasad.springframework.sfwpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CurdService<Owner, Long> {
    Owner findByLastname(String lastname);

}
