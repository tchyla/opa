package pl.tchyla.opa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.entities.Titles;
import pl.tchyla.opa.services.TitlesService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@Controller
public class TitlesController {

    private final TitlesService titlesService;

    public TitlesController(TitlesService titlesService) {
        this.titlesService = titlesService;
    }

    @GetMapping("/titles")
    public String showTitles(Model model) {
        List<Titles> titles = titlesService.getTitles();
        model.addAttribute("titles", titles);
        return "titles/showTitles";
    }

    @GetMapping("/addTitles")
    public String showAddForm(Model model) {
        model.addAttribute("titles", new Titles());
        return "titles/addTitles";
    }

    @PostMapping("/addTitles")
    public String saveTitle(@Valid Titles titles, BindingResult result){
        if(result.hasErrors()){
            return "titles/addTitles";
        }
        titlesService.add(titles);
        return "redirect:/titles";
    }

    @GetMapping("/editTitles/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model){
        model.addAttribute("titles", titlesService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "titles/editTitles";
    }

    @PostMapping("/editTitles")
    public String editTitle(@Valid Titles titles, BindingResult result){
        if(result.hasErrors()){
            return "titles/editTitles";
        }
        titlesService.edit(titles);
        return "redirect:/titles";
    }

    @GetMapping("/deleteTitles/{id}")
    public String deleteTitle(@PathVariable Long id){
        titlesService.delete(id);
        return "redirect:/titles";
    }

    @GetMapping("/showOneTitles/{id}")
    public String showTitle(@PathVariable("id") Long id, Model model){
        model.addAttribute("titles", titlesService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "titles/showOneTitles";
    }
}
