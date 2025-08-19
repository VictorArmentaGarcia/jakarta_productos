package org.curso.jakarta.service.impl;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.curso.jakarta.model.Categoria;
import org.curso.jakarta.repository.CategoriaRepository;
import org.curso.jakarta.service.CategoriaService;

import java.util.List;

@Transactional(Transactional.TxType.REQUIRED)
public class CategoriaServiceImpl implements CategoriaService {

    @Inject
    CategoriaRepository repo;

    @Override
    public Categoria save(Categoria categoria) {
        return repo.save(categoria);
    }

    @Override
    public List<Categoria> getList() {
        return repo.list();
    }

    @Override
    public Categoria getCategoria(int id) {
        return repo.get(id);
    }

    @Override
    public void delete(int id) {
        repo.delete(id);
    }
}
