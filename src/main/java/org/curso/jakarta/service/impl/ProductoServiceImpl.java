package org.curso.jakarta.service.impl;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.curso.jakarta.model.Producto;
import org.curso.jakarta.repository.ProductoRepository;
import org.curso.jakarta.service.ProductoService;

@Transactional(Transactional.TxType.REQUIRED)
public class ProductoServiceImpl implements ProductoService {

    @Inject
    ProductoRepository productoRepo;

    @Override
    public Producto save(Producto producto) {
        return productoRepo.save(producto);
    }

    @Override
    public Object getProductos() {
        return productoRepo.getProductos();
    }

    @Override
    public Producto getProductoByID(int id) {
        return productoRepo.getByID(id);
    }

    @Override
    public void deleteById(int id) {
        productoRepo.deleteById(id);
    }
}
