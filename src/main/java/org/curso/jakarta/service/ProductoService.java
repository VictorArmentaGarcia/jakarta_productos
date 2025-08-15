package org.curso.jakarta.service;

import org.curso.jakarta.model.Producto;

public interface ProductoService {

    Producto save(Producto producto);

    Object getProductos();

    Producto getProductoByID(int id);

    void deleteById(int id);

}
