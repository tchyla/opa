package pl.tchyla.opa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.pojo.ActorsContract;
import pl.tchyla.opa.services.ActorsService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class ActorsController {

    private final ActorsService actorsService;

    public ActorsController(ActorsService actorsService) {
        this.actorsService = actorsService;
    }

    @GetMapping("/actors")
    public String showActors(Model model) {
        List<Actors> actors = actorsService.getActors();
        model.addAttribute("actors", actors);
        return "actors/showActors";
    }

    @GetMapping("/addActors")
    public String showAddForm(Model model) {
        model.addAttribute("actors", new Actors());
        return "actors/addActors";
    }

    @PostMapping("/addActors")
    public String saveActor(@Valid Actors actors, BindingResult result) {
        if (result.hasErrors()) {
            return "actors/addActors";
        }
        actorsService.add(actors);
        return "redirect:/actors";
    }

    @GetMapping("/editActors/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model) {
        model.addAttribute("actors", actorsService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "actors/editActors";
    }

    @PostMapping("/editActors")
    public String editActor(@Valid Actors actors, BindingResult result) {
        if (result.hasErrors()) {
            return "actors/editActors";
        }
        actorsService.edit(actors);
        return "redirect:/actors";
    }

    @GetMapping("/deleteActors/{id}")
    public String deleteActor(@PathVariable Long id) {
        actorsService.delete(id);
        return "redirect:/actors";
    }

    @GetMapping("/showOneActors/{id}")
    public String showActor(@PathVariable("id") Long id, Model model) {
        model.addAttribute("actors", actorsService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "actors/showOneActors";
    }

    @ModelAttribute("contracts")
    public Collection<ActorsContract> contracts() {
        List<ActorsContract> contracts = new ArrayList<ActorsContract>();
        contracts.add(new ActorsContract(1, "Aktor etatowy"));
        contracts.add(new ActorsContract(2, "Aktor nieetatowy"));
        return contracts;
    }
}
