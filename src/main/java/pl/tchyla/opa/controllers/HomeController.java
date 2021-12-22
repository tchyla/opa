package pl.tchyla.opa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.tchyla.opa.entities.Actors;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(){
        return "home";
    }
}
