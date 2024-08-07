package com.api.bakery.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "GASTO_SERVICIOS")
public class GastoServicios extends Gasto{
    
    @Column(name = "SERVICIO")
    private String servicio;

    @Column(name = "FECHA_FIN")
    private LocalDate fechaFin;

    public GastoServicios() {
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }    
}
