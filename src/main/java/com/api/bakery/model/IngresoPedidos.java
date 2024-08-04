package com.api.bakery.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "INGRESO_PEDIDOS")
public class IngresoPedidos extends Ingreso {
    
    @OneToOne
    @JoinColumn(name = "PEDIDO_ID", referencedColumnName = "id")
    private Pedido pedido;

    public IngresoPedidos() {
    }

    public IngresoPedidos(Pedido pedido) {
        this.pedido = pedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    

}
