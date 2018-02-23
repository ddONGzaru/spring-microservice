package io.manasobi;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Optional;

@Lazy
@RepositoryRestResource
public interface CustomerRepo extends JpaRepository<Customer,Long> {

    Optional<Customer> findByName(@Param("name") String name);
}
