package com.api.bakery.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLEADO")
public class Empleado {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "TELEFONO")
    private String telefono;

    @Column(name = "FECHA_INICIO")
    private LocalDate fechaInicio;

    public Empleado() {
    }

    public Empleado(long idEmpleado, String nombre, String telefono, LocalDate fechaInicio) {
        this.id = idEmpleado;
        this.nombre = nombre;
        this.telefono = telefono;
        this.fechaInicio = fechaInicio;
    }

    public long getIdEmpleado() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.id = idEmpleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
}
