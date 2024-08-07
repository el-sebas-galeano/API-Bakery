package com.api.bakery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "GASTO_EMPLEADOS")
public class GastoEmpleados extends Gasto{
    
    @ManyToOne
    @JoinColumn(name = "EMPLEADO_ID", referencedColumnName = "id")
    private Empleado empleado;

    @Column(name = "CONCEPTO")
    private String concepto;

    public GastoEmpleados() {
    }

    public GastoEmpleados(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }
}
