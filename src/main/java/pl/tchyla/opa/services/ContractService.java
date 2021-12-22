package pl.tchyla.opa.services;

import org.springframework.stereotype.Service;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.entities.Contract;
import pl.tchyla.opa.repositories.ContractRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ContractService {

    private final ContractRepository contractRepository;

    public ContractService(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    public List<Contract> getContract() {
        return contractRepository.findAll();
    }

    public Optional<Contract> findById(Long id) {
        contractRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Nie znaleziono kontraktu o id " + id));
        return contractRepository.findById(id);
    }

    public void add(Contract contract) {
        contractRepository.save(contract);

    }

    public void delete(Long id) {
        Contract contract = contractRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Nie znaleziono kontraktu o id " + id));
        contractRepository.delete(contract);
    }

    public void edit(Contract contract) {
        contractRepository.save(contract);
    }
}
