package org.curso.jakarta.repository;

import org.curso.jakarta.model.Direccion;

import java.util.List;

public interface DireccionRepository {

    Direccion save(Direccion direccion);

    List<Direccion> getList();

    Direccion get(int id);

    void delete(int id);

}
