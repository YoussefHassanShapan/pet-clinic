package youssef.com.petclinic.repos;


import org.springframework.data.repository.CrudRepository;
import youssef.com.petclinic.models.Speciality;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
