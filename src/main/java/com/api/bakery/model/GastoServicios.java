package com.api.bakery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "GASTO_SERVICIOS")
public class GastoServicios extends Gasto{
    
    @Column(name = "SERVICIO")
    private String servicio;

    @Column(name = "MES")
    private String mes;

    public GastoServicios() {
    }

    public GastoServicios(String servicio, String mes) {
        this.servicio = servicio;
        this.mes = mes;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    
}
