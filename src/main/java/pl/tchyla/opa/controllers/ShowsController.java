package pl.tchyla.opa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.entities.Shows;
import pl.tchyla.opa.services.ShowsService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@Controller
public class ShowsController {

    private final ShowsService showsService;

    public ShowsController(ShowsService showsService) {
        this.showsService = showsService;
    }

    @GetMapping("/shows")
    public String showShows(Model model) {
        List<Shows> shows = showsService.getShows();
        model.addAttribute("shows", shows);
        return "shows/showShows";
    }

    @GetMapping("/addShows")
    public String showAddForm(Model model) {
        model.addAttribute("shows", new Shows());
        return "shows/addShows";
    }

    @PostMapping("/addShows")
    public String saveShow(@Valid Shows shows, BindingResult result){
        if(result.hasErrors()){
            return "shows/addShows";
        }
        showsService.add(shows);
        return "redirect:/shows/showShows";
    }

    @GetMapping("/editShows/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model){
        model.addAttribute("shows", showsService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "shows/editShows";
    }

    @PostMapping("/editShows")
    public String editShow(@Valid Shows shows, BindingResult result){
        if(result.hasErrors()){
            return "shows/editShows";
        }
        showsService.edit(shows);
        return "redirect:/shows/showShows";
    }

    @GetMapping("/deleteShows/{id}")
    public String deleteShow(@PathVariable Long id){
        showsService.delete(id);
        return "redirect:/shows/showShows";
    }

    @GetMapping("/showShows/{id}")
    public String showShow(@PathVariable("id") Long id, Model model){
        model.addAttribute("shows", showsService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "shows/showOneShows";
    }
}

