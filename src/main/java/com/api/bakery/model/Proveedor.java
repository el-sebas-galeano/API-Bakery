package com.api.bakery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROVEEDOR")
public class Proveedor {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "EMPRESA")
    private String empresa;

    @Column(name = "FECHA_INICIO")
    private String fechaInicio;

    public Proveedor() {
    }

    public Proveedor(Long idProveedor, String nombre, String empresa, String fechaInicio) {
        this.id = idProveedor;
        this.nombre = nombre;
        this.empresa = empresa;
        this.fechaInicio = fechaInicio;
    }

    public Long getIdProveedor() {
        return id;
    }

    public void setIdProveedor(Long idProveedor) {
        this.id = idProveedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    
}
