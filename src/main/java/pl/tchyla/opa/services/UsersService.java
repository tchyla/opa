package pl.tchyla.opa.services;

import org.springframework.stereotype.Service;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.entities.Users;
import pl.tchyla.opa.repositories.UsersRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }

    public Optional<Users> findById(Long id) {
        usersRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Nie znaleziono użytkownika o id " + id));
        return usersRepository.findById(id);
    }

    public void add(Users users){
        usersRepository.save(users);

    }

    public void delete(Long id){
        Users users = usersRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Nie znaleziono użytkownika o id " + id));
        usersRepository.delete(users);
    }

    public void edit(Users users){
        usersRepository.save(users);
    }
}
