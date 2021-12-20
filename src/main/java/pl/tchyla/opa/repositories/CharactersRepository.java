package pl.tchyla.opa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tchyla.opa.entities.Characters;

public interface CharactersRepository extends JpaRepository<Characters, Long> {
}
