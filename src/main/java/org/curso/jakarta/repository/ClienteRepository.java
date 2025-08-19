package org.curso.jakarta.repository;

import org.curso.jakarta.model.Cliente;

import java.util.List;

public interface ClienteRepository {

    Cliente save(Cliente cliente);

    List<Cliente> list();

    Cliente getId(int id);

    void delete(int id);

}
