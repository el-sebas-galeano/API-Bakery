package com.api.bakery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "GASTO_EMPLEADOS")
public class GastoEmpleados extends Gasto{
    
    @OneToOne
    @JoinColumn(name = "EMPLEADO_ID", referencedColumnName = "id")
    private Empleado empleado;

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
}
