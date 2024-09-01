package youssef.com.petclinic.repos;


import org.springframework.data.repository.CrudRepository;
import youssef.com.petclinic.models.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
