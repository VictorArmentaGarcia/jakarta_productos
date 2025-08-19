package org.curso.jakarta.service;

import org.curso.jakarta.model.Categoria;

import java.util.List;

public interface CategoriaService {

    Categoria save(Categoria categoria);

    List<Categoria> getList();

    Categoria getCategoria(int id);

    void delete(int id);

}
