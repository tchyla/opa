package pl.tchyla.opa.services;

import org.springframework.stereotype.Service;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.entities.Characters;
import pl.tchyla.opa.repositories.CharactersRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CharactersService {
    private final CharactersRepository charactersRepository;

    public CharactersService(CharactersRepository charactersRepository) {
        this.charactersRepository = charactersRepository;
    }

    public List<Characters> getCharacters() {
        return charactersRepository.findAll();
    }

    public Optional<Characters> findById(Long id) {
        charactersRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Nie znaleziono roli o id " + id));
        return charactersRepository.findById(id);
    }

    public void add(Characters characters){
        charactersRepository.save(characters);

    }

    public void delete(Long id){
        Characters characters = charactersRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Nie znaleziono roli o id " + id));
        charactersRepository.delete(characters);
    }

    public void edit(Characters characters){
        charactersRepository.save(characters);
    }
}
