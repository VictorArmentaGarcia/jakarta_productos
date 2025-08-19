package org.curso.jakarta.service;

import org.curso.jakarta.model.Carro;

import java.util.List;

public interface CarroService {

    Carro save(Carro carro);

    List<Carro> getList();

    Carro getId(int id);

    void delete(int id);
}
