package com.api.bakery.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpleadoController {
    
    @GetMapping()
    public String index(){
        return "CONECTADO";
    }
}
