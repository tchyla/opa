package pl.tchyla.opa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tchyla.opa.entities.Contract;

public interface ContractRepository extends JpaRepository<Contract, Long> {
}
