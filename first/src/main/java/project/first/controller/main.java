package project.first.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class main {
    @GetMapping("/")
    public String home(){
        return "./home";
    }

    @GetMapping("/member/new")
    public String join(){
        return "./member/join";
    }

    @PostMapping("/member/new")
    public String create(MemberForm form){


        return "redirect:/";
    }
}
