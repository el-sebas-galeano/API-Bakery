package com.api.bakery.service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.bakery.model.Empleado;
import com.api.bakery.repository.EmpleadoRepository;

@Service
public class EmpleadoService {
    
    @Autowired
    private EmpleadoRepository empleadoRepository;

    public ArrayList<Empleado> getEmpleados(){
        return (ArrayList<Empleado>)this.empleadoRepository.findAll();
    }

    public Empleado saveEmpleado(Empleado empleado){
        return this.empleadoRepository.save(empleado);
    }

    public Optional<Empleado> getEmpleadoById(Long id){
        return this.empleadoRepository.findById(id);
    }

    public Empleado updateById(Empleado request, Long id){
        Empleado empleado = this.empleadoRepository.findById(id).get();
        empleado.setNombre(request.getNombre());
        empleado.setFechaInicio(request.getFechaInicio());
        empleado.setTelefono(request.getTelefono());
        return empleado;
    }

    public Boolean deleteEmpleado(Long id){
        try{
            this.empleadoRepository.deleteById(id);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}
