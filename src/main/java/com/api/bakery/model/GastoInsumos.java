package com.api.bakery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "GASTO_INSUMOS")
public class GastoInsumos extends Gasto{
    
    @OneToOne
    @JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "id")
    private ProductoInsumos productoInsumos;

    @OneToOne
    @JoinColumn(name = "PROVEEDOR_ID", referencedColumnName = "id")
    private Proveedor proveedor;

    public GastoInsumos() {
    }

    public GastoInsumos(ProductoInsumos productoInsumos, Proveedor proveedor) {
        this.productoInsumos = productoInsumos;
        this.proveedor = proveedor;
    }

    public ProductoInsumos getProductoInsumos() {
        return productoInsumos;
    }

    public void setProductoInsumos(ProductoInsumos productoInsumos) {
        this.productoInsumos = productoInsumos;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    
}
