package pl.tchyla.opa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.tchyla.opa.entities.Actors;
import pl.tchyla.opa.entities.Users;
import pl.tchyla.opa.services.UsersService;

import javax.persistence.EntityNotFoundException;
import javax.validation.Valid;
import java.util.List;

@Controller
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping("/users")
    public String showUsers(Model model) {
        List<Users> users = usersService.getUsers();
        model.addAttribute("users", users);
        return "users/showUsers";
    }

    @GetMapping("/addUsers")
    public String showAddForm(Model model) {
        model.addAttribute("users", new Users());
        return "users/addUsers";
    }

    @PostMapping("/addUsers")
    public String saveUser(@Valid Users users, BindingResult result){
        if(result.hasErrors()){
            return "users/addUsers";
        }
        usersService.add(users);
        return "redirect:/users";
    }

    @GetMapping("/editUsers/{id}")
    public String showEditForm(@PathVariable("id") Long id, Model model){
        model.addAttribute("users", usersService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "users/editUsers";
    }

    @PostMapping("/editUsers")
    public String editUser(@Valid Users users, BindingResult result){
        if(result.hasErrors()){
            return "users/editUsers";
        }
        usersService.edit(users);
        return "redirect:/users";
    }

    @GetMapping("/deleteUsers/{id}")
    public String deleteUser(@PathVariable Long id){
        usersService.delete(id);
        return "redirect:/users";
    }

    @GetMapping("/showOneUsers/{id}")
    public String showUser(@PathVariable("id") Long id, Model model){
        model.addAttribute("users", usersService.findById(id).orElseThrow(EntityNotFoundException::new));
        return "users/showOneUsers";
    }
}
