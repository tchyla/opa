package pl.tchyla.opa.controllers;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.entities.Contract;
import pl.tchyla.opa.services.ContractService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

public class ContractController {

    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    @GetMapping("/contract")
    public String showContract(Model model) {
        List<Contract> contract = contractService.getContract();
        model.addAttribute("contract", contract);
        return "contract/showContract";
    }

    @GetMapping("/addContract")
    public String showAddForm(Model model) {
        model.addAttribute("contract", new Contract());
        return "contract/addContract";
    }

    @PostMapping("/addContract")
    public String saveContract(@Valid Contract contract, BindingResult result) {
        if (result.hasErrors()) {
            return "contract/addContract";
        }
        contractService.add(contract);
        return "redirect:/contract";
    }

    @GetMapping("/editContract/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("contract", contractService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "contract/editContract";
    }

    @PostMapping("/editContract")
    public String editContract(@Valid Contract contract, BindingResult result) {
        if (result.hasErrors()) {
            return "contract/editContract";
        }
        contractService.edit(contract);
        return "redirect:/contract";
    }

    @GetMapping("/deleteContract/{id}")
    public String deleteContract(@PathVariable Long id) {
        contractService.delete(id);
        return "redirect:/contract";
    }

    @GetMapping("/showOneContract/{id}")
    public String showContract(@PathVariable("id") Long id, Model model) {
        model.addAttribute("contract", contractService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "contract/showOneContract";
    }
}
