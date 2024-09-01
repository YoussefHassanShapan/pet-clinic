package youssef.com.petclinic.repos;


import org.springframework.data.repository.CrudRepository;
import youssef.com.petclinic.models.Visit;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
