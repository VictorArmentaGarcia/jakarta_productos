package org.curso.jakarta.service.impl;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.curso.jakarta.model.Direccion;
import org.curso.jakarta.repository.DireccionRepository;
import org.curso.jakarta.service.DireccionService;

import java.util.List;

@Transactional(Transactional.TxType.REQUIRED)
public class DireccionServiceImpl implements DireccionService {

    @Inject
    DireccionRepository repo;

    @Override
    public Direccion save(Direccion direccion) {
        return repo.save(direccion);
    }

    @Override
    public List<Direccion> getList() {
        return repo.getList();
    }

    @Override
    public Direccion getDireccion(int id) {
        return repo.get(id);
    }

    @Override
    public void delete(int id) {
        repo.delete(id);
    }
}
