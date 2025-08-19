package org.curso.jakarta.service.impl;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.curso.jakarta.model.Carro;
import org.curso.jakarta.repository.CarroRepository;
import org.curso.jakarta.service.CarroService;

import java.util.List;

@Transactional(Transactional.TxType.REQUIRED)
public class CarroServiceImpl implements CarroService {

    @Inject
    CarroRepository repo;

    @Override
    public Carro save(Carro carro) {
        return repo.save(carro);
    }

    @Override
    public List<Carro> getList() {
        return repo.list();
    }

    @Override
    public Carro getId(int id) {
        return repo.getCarro(id);
    }

    @Override
    public void delete(int id) {
         repo.delete(id);
    }
}
