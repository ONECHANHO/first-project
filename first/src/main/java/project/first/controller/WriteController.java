package project.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WriteController {



    @PostMapping
    public String submit(){
        return "redirect:/";
    }
}
