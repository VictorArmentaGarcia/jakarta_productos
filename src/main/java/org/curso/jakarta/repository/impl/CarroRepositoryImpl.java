package org.curso.jakarta.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.curso.jakarta.model.Carro;
import org.curso.jakarta.repository.CarroRepository;

import java.util.List;

public class CarroRepositoryImpl implements CarroRepository {

    @PersistenceContext(unitName = "productosJPA")
    EntityManager em;

    @Override
    @Transactional
    public Carro save(Carro carro) {
        em.persist(carro);
        return carro;
    }

    @Override
    public List<Carro> list() {
        return em.createQuery("SELECT c FROM carros", Carro.class).getResultList();
    }

    @Override
    public Carro getCarro(int id) {
        return em.find(Carro.class, id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        em.remove(em.getReference(Carro.class, id));
    }
}
