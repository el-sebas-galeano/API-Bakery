package com.api.bakery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "INGRESO_OTROS")
public class IngresoOtros extends Ingreso {
    
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public IngresoOtros() {
    }

    public IngresoOtros(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
