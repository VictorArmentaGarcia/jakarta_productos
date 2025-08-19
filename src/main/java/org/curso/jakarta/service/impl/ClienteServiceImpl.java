package org.curso.jakarta.service.impl;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.curso.jakarta.model.Cliente;
import org.curso.jakarta.repository.ClienteRepository;
import org.curso.jakarta.service.ClienteService;

import java.util.List;

@Transactional(Transactional.TxType.REQUIRED)
public class ClienteServiceImpl implements ClienteService {

    @Inject
    ClienteRepository repo;

    @Override
    public Cliente save(Cliente cliente) {
        return repo.save(cliente);
    }

    @Override
    public List<Cliente> getList() {
        return repo.list();
    }

    @Override
    public Cliente getCliente(int id) {
        return repo.getId(id);
    }

    @Override
    public void delete(int id) {
        repo.delete(id);
    }
}
