package com.example.RebatesAdmin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RebatesAdminController {

    @GetMapping
    public String welcome(){
        return "Welcome!";
    }
}
