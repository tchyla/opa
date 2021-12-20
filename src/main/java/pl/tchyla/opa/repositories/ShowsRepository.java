package pl.tchyla.opa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tchyla.opa.entities.Shows;

public interface ShowsRepository extends JpaRepository<Shows, Long> {
}
