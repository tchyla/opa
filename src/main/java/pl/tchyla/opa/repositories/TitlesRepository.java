package pl.tchyla.opa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tchyla.opa.entities.Titles;

public interface TitlesRepository extends JpaRepository<Titles, Long> {
}
