package com.api.bakery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTO_INSUMOS")
public class ProductoInsumos extends Producto{
    
    @Column(name = "CANTIDAD")
    private String cantidad;

    public ProductoInsumos() {
    }

    public ProductoInsumos(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
}
