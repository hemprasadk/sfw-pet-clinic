package prasad.springframework.sfwpetclinic.services;

import prasad.springframework.sfwpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet finById(Long id);
    Vet save(Vet vet);
    Set<Vet> finall();
}
