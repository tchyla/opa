package pl.tchyla.opa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.tchyla.opa.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
