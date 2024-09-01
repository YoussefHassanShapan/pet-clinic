package youssef.com.petclinic.repos;


import org.springframework.data.repository.CrudRepository;
import youssef.com.petclinic.models.PetType;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
