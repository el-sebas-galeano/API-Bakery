package com.api.bakery.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.bakery.model.Gasto;
import com.api.bakery.service.GastoService;

@RestController
@RequestMapping(value = "/gasto")
public class GastoRestController {
    
    @Autowired
    private GastoService gastoService;

    @GetMapping
    public ArrayList<Gasto> getGastos(){
        return this.gastoService.getGastos();
    }

    @PostMapping("save")
    public Gasto saveGasto(@RequestBody Gasto gasto){
        return this.gastoService.saveGasto(gasto);
    }
}
