package org.curso.jakarta.repository;

import org.curso.jakarta.model.Categoria;

import java.util.List;

public interface CategoriaRepository {

    Categoria save(Categoria categoria);

    List<Categoria> list();

    Categoria get(int id);

    void delete(int id);
}
