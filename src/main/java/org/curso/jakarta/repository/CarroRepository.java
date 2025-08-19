package org.curso.jakarta.repository;

import org.curso.jakarta.model.Carro;

import java.util.List;

public interface CarroRepository {

    Carro save(Carro carro);

    List<Carro> list();

    Carro getCarro(int id);

    void delete(int id);

}
