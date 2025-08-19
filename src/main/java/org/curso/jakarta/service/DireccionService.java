package org.curso.jakarta.service;

import org.curso.jakarta.model.Direccion;

import java.util.List;

public interface DireccionService {

    Direccion save(Direccion direccion);

    List<Direccion> getList();

    Direccion getDireccion(int id);

    void delete(int id);

}
