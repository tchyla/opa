package pl.tchyla.opa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tchyla.opa.entities.Actors;

public interface ActorsRepository extends JpaRepository<Actors, Long> {

}
