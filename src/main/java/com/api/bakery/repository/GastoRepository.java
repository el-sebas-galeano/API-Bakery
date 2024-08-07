package com.api.bakery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.api.bakery.model.Gasto;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long>{
 
    @Query("SELECT g FROM GastoInsumos g")
    List<Gasto> findAllInsumos();

    @Query("SELECT g FROM GastoServicios g")
    List<Gasto> findAllServicios();

    @Query("SELECT g FROM GastoEmpleados g")
    List<Gasto> findAllEmpleados();

    @Query("SELECT g FROM GastoOtros g")
    List<Gasto> findAllOtros();
}
