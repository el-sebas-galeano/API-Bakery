package com.api.bakery.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PEDIDO")
public class Pedido {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "CLIENTE_ID", referencedColumnName = "id")
    private Cliente cliente;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Pedido() {
    }

    public Pedido(Long idPedido, Cliente cliente, String descripcion) {
        this.id = idPedido;
        this.cliente = cliente;
        this.descripcion = descripcion;
    }

    public Long getIdPedido() {
        return id;
    }

    public void setIdPedido(Long idPedido) {
        this.id = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

  
}
