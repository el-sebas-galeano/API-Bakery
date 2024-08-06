package com.api.bakery.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.bakery.model.Empleado;
import com.api.bakery.service.EmpleadoService;


@RestController
@RequestMapping(value = "/empleado")
public class EmpleadoRestController {
    
    @Autowired
    private EmpleadoService empleadoService;

    @GetMapping
    public ArrayList<Empleado> getEmpleados(){
        return this.empleadoService.getEmpleados();
    }

    @PostMapping("/save")
    public Empleado saveEmpleado(@RequestBody Empleado empleado){
        return this.empleadoService.saveEmpleado(empleado);
    }

    @GetMapping(path = "/{id}")
    public Optional<Empleado> getEmpleadoById(@PathVariable Long id){
        return this.empleadoService.getEmpleadoById(id);
    }

    @PutMapping(path = "/update/{id}")
    public Empleado updateEmpleadoById(@RequestBody Empleado empleado, @PathVariable Long id){
        return this.empleadoService.updateById(empleado, id);
    }

    @DeleteMapping(path = "/delete/{id}")
    public Boolean deleteEmpleadoById(@PathVariable Long id){
        return this.empleadoService.deleteEmpleado(id);
    }
}
