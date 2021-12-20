package pl.tchyla.opa.services;

import org.springframework.stereotype.Service;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.entities.Stages;
import pl.tchyla.opa.repositories.StagesRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StagesService {

    private final StagesRepository stagesRepository;

    public StagesService(StagesRepository stagesRepository) {
        this.stagesRepository = stagesRepository;
    }

    public List<Stages> getStages() {
        return stagesRepository.findAll();
    }

    public Optional<Stages> findById(Long id) {
        stagesRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Nie znaleziono sceny o id " + id));
        return stagesRepository.findById(id);
    }

    public void add(Stages stages){
        stagesRepository.save(stages);

    }

    public void delete(Long id){
        Stages stages = stagesRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("Nie znaleziono sceny o id " + id));
        stagesRepository.delete(stages);
    }

    public void edit(Stages stages){
        stagesRepository.save(stages);
    }
}
