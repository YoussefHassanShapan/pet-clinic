package youssef.com.petclinic.repos;


import org.springframework.data.repository.CrudRepository;
import youssef.com.petclinic.models.Owner;

import java.util.List;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}
