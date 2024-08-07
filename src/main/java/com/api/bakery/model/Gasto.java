package com.api.bakery.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@JsonTypeInfo(
  use = JsonTypeInfo.Id.NAME,
  include = JsonTypeInfo.As.PROPERTY,
  property = "type")
@JsonSubTypes({
  @JsonSubTypes.Type(value = GastoInsumos.class, name = "gastoInsumos"),
  @JsonSubTypes.Type(value = GastoEmpleados.class, name = "gastoEmpleados"),
  @JsonSubTypes.Type(value = GastoServicios.class, name = "gastoServicios"),
  @JsonSubTypes.Type(value = GastoOtros.class, name = "gastoOtros")
})
public abstract class Gasto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FECHA")
    private LocalDateTime fecha;

    @Column(name = "MONTO")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
