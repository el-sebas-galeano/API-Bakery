package com.api.bakery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PRODUCTO_PASTELERIA")
public class IngresoPastelería extends Ingreso{
    
    @OneToOne
    @JoinColumn(name = "PRODUCTO_ID", referencedColumnName = "id")
    private ProductoPasteleria productoPasteleria;

    public IngresoPastelería() {
    }

    public IngresoPastelería(ProductoPasteleria productoPasteleria) {
        this.productoPasteleria = productoPasteleria;
    }

    public ProductoPasteleria getProductoPasteleria() {
        return productoPasteleria;
    }

    public void setProductoPasteleria(ProductoPasteleria productoPasteleria) {
        this.productoPasteleria = productoPasteleria;
    }

    
}
