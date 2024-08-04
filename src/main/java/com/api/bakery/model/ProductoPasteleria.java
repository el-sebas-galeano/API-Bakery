package com.api.bakery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTO_PASTELERIA")
public class ProductoPasteleria extends Producto {
    
    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "PESO")
    private String peso;

    @Column(name = "CANTIDAD_PERSONAS")
    private int cantidadPersonas;

    public ProductoPasteleria() {
    }

    public ProductoPasteleria(String descripcion, String peso, int cantidadPersonas) {
        this.descripcion = descripcion;
        this.peso = peso;
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    
}
