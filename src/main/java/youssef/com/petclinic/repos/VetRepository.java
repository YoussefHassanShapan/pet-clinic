package youssef.com.petclinic.repos;

import org.springframework.data.repository.CrudRepository;
import youssef.com.petclinic.models.Vet;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
