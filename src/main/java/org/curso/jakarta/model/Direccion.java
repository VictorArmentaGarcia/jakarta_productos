package org.curso.jakarta.model;

import jakarta.persistence.*;

@Entity
@Table(name = "direcciones")
public class Direccion {

    public Direccion(){}

    public Direccion(int id, String calle, String colonia, String numero) {
        this.id = id;
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String calle;
    private String colonia;
    private String numero;

    @ManyToOne(optional = false)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
