package pl.tchyla.opa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.tchyla.opa.entities.Stages;
import pl.tchyla.opa.services.StagesService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@Controller
public class StagesController {

    private final StagesService stagesService;

    public StagesController(StagesService stagesService) {
        this.stagesService = stagesService;
    }

    @GetMapping("/stages")
    public String showStages(Model model) {
        List<Stages> stages = stagesService.getStages();
        model.addAttribute("stages", stages);
        return "stages/showStages";
    }

    @GetMapping("/addStages")
    public String showAddForm(Model model) {
        model.addAttribute("stages", new Stages());
        return "stages/addStages";
    }

    @PostMapping("/addStages")
    public String saveStage(@Valid Stages stages, BindingResult result){
        if(result.hasErrors()){
            return "stages/addStages";
        }
        stagesService.add(stages);
        return "redirect:/stages";
    }

    @GetMapping("/editStages/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model){
        model.addAttribute("stages", stagesService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "stages/editStages";
    }

    @PostMapping("/editStages")
    public String editStage(@Valid Stages stages, BindingResult result){
        if(result.hasErrors()){
            return "stages/editStages";
        }
        stagesService.edit(stages);
        return "redirect:/stages";
    }

    @GetMapping("/deleteStages/{id}")
    public String deleteStage(@PathVariable Long id){
        stagesService.delete(id);
        return "redirect:/stages";
    }

    @GetMapping("/showOneStages/{id}")
    public String showStage(@PathVariable("id") Long id, Model model){
        model.addAttribute("stages", stagesService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "stages/showOneStages";
    }
}

