package org.curso.jakarta.service;

import org.curso.jakarta.model.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente save(Cliente cliente);

    List<Cliente> getList();

    Cliente getCliente(int id);

    void delete(int id);

}
