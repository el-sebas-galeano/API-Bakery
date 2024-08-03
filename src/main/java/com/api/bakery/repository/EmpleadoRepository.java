package com.api.bakery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.bakery.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Long>{
    
}
