package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class BonjourApp {

    public static void main(String[] args) {
        SpringApplication.run(BonjourApp.class, args);
    }
}

@Controller
class BonjourController {

    @GetMapping("/")
    public String bonjour(Model model) {
        model.addAttribute("message", "Bonjour");
        return "bonjour";
    }
}
