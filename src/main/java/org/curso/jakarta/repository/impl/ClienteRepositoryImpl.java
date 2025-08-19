package org.curso.jakarta.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.curso.jakarta.model.Cliente;
import org.curso.jakarta.repository.ClienteRepository;

import java.util.List;

public class ClienteRepositoryImpl implements ClienteRepository {

    @PersistenceContext(unitName = "productosJPA")
    EntityManager em;

    @Override
    @Transactional
    public Cliente save(Cliente cliente) {
        em.persist(cliente);
        return cliente;
    }

    @Override
    public List<Cliente> list() {
        return em.createQuery("SELECT c FROM clientes", Cliente.class).getResultList();
    }

    @Override
    public Cliente getId(int id) {
        return em.find(Cliente.class, id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        em.remove(em.getReference(Cliente.class, id));
    }
}
