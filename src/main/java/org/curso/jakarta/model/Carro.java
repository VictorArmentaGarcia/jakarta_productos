package org.curso.jakarta.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "carros")
public class Carro {

    public Carro(){}

    public Carro(int id, Date fechaCreacion) {
        this.id = id;
        this.fechaCreacion = fechaCreacion;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date fechaCreacion;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

}
