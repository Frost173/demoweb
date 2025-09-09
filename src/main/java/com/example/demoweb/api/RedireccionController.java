package com.example.demoweb.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class RedireccionController {
    @GetMapping("/")
    public String inicio(){
        return "index";
    }

    @GetMapping("/nosotros")
    public String nosotros(){
        return "nosotros";
    }

    @GetMapping("/sesion")
    public String sesion(){
        return "sesion";
    }
}
