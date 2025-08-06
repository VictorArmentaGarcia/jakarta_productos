package org.curso.jakarta.service.impl;

import org.curso.jakarta.model.Producto;
import org.curso.jakarta.service.ProductoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ProductoServiceImpl implements ProductoService {

    private static List<Producto> listProductos = new ArrayList<Producto>();

    @Override
    public Producto save(Producto producto) {
        listProductos.add(producto);
        return producto;
    }

    @Override
    public List<Producto> getProductos() {
        return listProductos;
    }

    @Override
    public Producto getProductoByID(int id) {
        return listProductos.stream().filter(p-> p.getId() == id).findAny().orElse(null);
    }

    @Override
    public void deleteById(int id) {
        listProductos.removeIf(p -> p.getId() == id);
    }
}
