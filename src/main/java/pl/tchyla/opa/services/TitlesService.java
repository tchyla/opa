package pl.tchyla.opa.services;

import org.springframework.stereotype.Service;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.entities.Titles;
import pl.tchyla.opa.repositories.TitlesRepository;

import java.util.List;
import java.util.Optional;

@Service
public class TitlesService {

    private final TitlesRepository titlesRepository;

    public TitlesService(TitlesRepository titlesRepository) {
        this.titlesRepository = titlesRepository;
    }

    public List<Titles> getTitles() {
        return titlesRepository.findAll();
    }

    public Optional<Titles> findById(Long id) {
        titlesRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Nie znaleziono tytułu o id " + id));
        return titlesRepository.findById(id);
    }

    public void add(Titles titles){
        titlesRepository.save(titles);

    }

    public void delete(Long id){
        Titles titles = titlesRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Nie znaleziono tytułu o id " + id));
        titlesRepository.delete(titles);
    }

    public void edit(Titles titles){
        titlesRepository.save(titles);
    }
}
