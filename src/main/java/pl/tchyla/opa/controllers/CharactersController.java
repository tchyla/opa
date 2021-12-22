package pl.tchyla.opa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.entities.Characters;
import pl.tchyla.opa.services.CharactersService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@Controller
public class CharactersController {

    private final CharactersService charactersService;


    public CharactersController(CharactersService charactersService) {
        this.charactersService = charactersService;
    }

    @GetMapping("/characters")
    public String showCharacters(Model model) {
        List<Characters> characters = charactersService.getCharacters();
        model.addAttribute("characters", characters);
        return "characters/showCharacters";
    }

    @GetMapping("/addCharacters")
    public String showAddForm(Model model) {
        model.addAttribute("characters", new Characters());
        return "characters/addCharacters";
    }

    @PostMapping("/addCharacters")
    public String saveCharacter(@Valid Characters characters, BindingResult result){
        if(result.hasErrors()){
            return "characters/addCharacters";
        }
        charactersService.add(characters);
        return "redirect:/characters";
    }

    @GetMapping("/editCharacters/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model){
        model.addAttribute("characters", charactersService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "characters/editCharacters";
    }

    @PostMapping("/editCharacters")
    public String editCharacter(@Valid Characters characters, BindingResult result){
        if(result.hasErrors()){
            return "characters/editCharacters";
        }
        charactersService.edit(characters);
        return "redirect:/characters";
    }

    @GetMapping("/deleteCharacters/{id}")
    public String deleteCharacter(@PathVariable Long id){
        charactersService.delete(id);
        return "redirect:/characters";
    }

    @GetMapping("showOneCharacters/{id}")
    public String showCharacter(Model model, @PathVariable long id){
        model.addAttribute("characters", charactersService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "characters/showOneCharacters";
    }
}
