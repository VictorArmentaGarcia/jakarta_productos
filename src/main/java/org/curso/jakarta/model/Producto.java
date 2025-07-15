package org.curso.jakarta.model;

public class Producto {

    public Producto() {
    }

    public Producto(int cantidad, String descripcion, String nombre, int id) {
        this.cantidad = cantidad;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.id = id;
    }

    private int id;
    private String nombre;
    private String descripcion;
    private int cantidad;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
