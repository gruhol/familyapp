package pl.inteca.FamilyApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/dupa")
    public String hello() {
        return "Hi!";
    }
}
