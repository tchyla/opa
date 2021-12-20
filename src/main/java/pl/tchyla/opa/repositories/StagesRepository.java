package pl.tchyla.opa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tchyla.opa.entities.Stages;

public interface StagesRepository extends JpaRepository<Stages, Long> {
}
