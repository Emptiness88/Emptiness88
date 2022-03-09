package com.example.demo.Controllers;

import com.example.demo.repo.NTRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import retrofit2.http.POST;

@Controller
public class TestController {

    @Autowired
    private NTRepository ntRepository;

    @GetMapping ("/Test")
    public String Test (Model model) {
        Iterable<POST> posts = ntRepository.findAll();
        model.addAttribute("posts", posts);
        return "Test-main";
    }
}
