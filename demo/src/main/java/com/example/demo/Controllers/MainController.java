package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    //@GetMapping("/greeting") - sait s vkladkoi "greeting"
    @GetMapping("/") // - glavnaya stranica
    //public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");
        return "home"; // - vizov shablona
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "О проекте");
        return "about";
    }
}
