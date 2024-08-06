package com.api.bakery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.bakery.model.Gasto;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long>{
    
}
