package pl.tchyla.opa.services;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.pojo.ActorsContract;
import pl.tchyla.opa.repositories.ActorsRepository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class ActorsService {

    private final ActorsRepository actorsRepository;


    public ActorsService(ActorsRepository actorsRepository) {
        this.actorsRepository = actorsRepository;
    }

    public List<Actors> getActors() {
        return actorsRepository.findAll();
    }

    public Optional<Actors> findById(Long id) {
        actorsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Nie znaleziono aktora o id " + id));
        return actorsRepository.findById(id);
    }

    public void add(Actors actors) {
        actorsRepository.save(actors);

    }

    public void delete(Long id) {
        Actors actors = actorsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Nie znaleziono aktora o id " + id));
        actorsRepository.delete(actors);
    }

    public void edit(Actors actors) {
        actorsRepository.save(actors);
    }

}
