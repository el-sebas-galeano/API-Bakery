package com.api.bakery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTO_COMERCIAL")
public class ProductoComercial extends Producto {
    
    @Column(name = "CANTIDAD")
    private int cantidad;

    @Column(name = "PRECIO_UNIDAD")
    private int precioUnidad;

    public ProductoComercial() {
    }

    public ProductoComercial(int cantidad, int precioUnidad) {
        this.cantidad = cantidad;
        this.precioUnidad = precioUnidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioUnidad() {
        return precioUnidad;
    }

    public void setPrecioUnidad(int precioUnidad) {
        this.precioUnidad = precioUnidad;
    }

}
