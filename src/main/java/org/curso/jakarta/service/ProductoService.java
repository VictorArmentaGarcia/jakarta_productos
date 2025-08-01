package org.curso.jakarta.service;

import org.curso.jakarta.model.Producto;

import java.util.List;

public interface ProductoService {

    Producto save(Producto producto);

    List<Producto> getProductos();

    Producto getProductoByID(int id);

    void deleteById(int id);

}
