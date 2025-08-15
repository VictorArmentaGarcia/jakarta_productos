package org.curso.jakarta.repository;

import org.curso.jakarta.model.Producto;

import java.util.List;

public interface ProductoRepository {

    Producto save(Producto prod);

    Object getProductos();

    Producto getByID(int id);

    boolean deleteById(int id);

}
