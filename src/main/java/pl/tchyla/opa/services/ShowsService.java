package pl.tchyla.opa.services;

import org.springframework.stereotype.Service;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.entities.Shows;
import pl.tchyla.opa.repositories.ShowsRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ShowsService {

    private final ShowsRepository showsRepository;

    public ShowsService(ShowsRepository showsRepository) {
        this.showsRepository = showsRepository;
    }

    public List<Shows> getShows() {
        return showsRepository.findAll();
    }

    public Optional<Shows> findById(Long id) {
        showsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Nie znaleziono spektaklu o id " + id));
        return showsRepository.findById(id);
    }

    public void add(Shows shows){
        showsRepository.save(shows);

    }

    public void delete(Long id){
        Shows shows = showsRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Nie znaleziono spektaklu o id " + id));
        showsRepository.delete(shows);
    }

    public void edit(Shows shows){
        showsRepository.save(shows);
    }
}
