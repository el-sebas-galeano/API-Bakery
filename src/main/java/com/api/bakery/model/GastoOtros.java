package com.api.bakery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "GASTO_OTROS")
public class GastoOtros extends Gasto{
    
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public GastoOtros() {
    }

    public GastoOtros(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
