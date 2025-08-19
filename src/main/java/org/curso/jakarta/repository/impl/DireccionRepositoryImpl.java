package org.curso.jakarta.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.curso.jakarta.model.Direccion;
import org.curso.jakarta.repository.DireccionRepository;

import java.util.List;

public class DireccionRepositoryImpl implements DireccionRepository {

    @PersistenceContext(unitName = "productosJPA")
    EntityManager em;

    @Override
    public Direccion save(Direccion direccion) {
        em.persist(direccion);
        return direccion;
    }

    @Override
    public List<Direccion> getList() {
        return em.createQuery("SELECT d FROM direcciones", Direccion.class).getResultList();
    }

    @Override
    public Direccion get(int id) {
        return em.find(Direccion.class, id);
    }

    @Override
    public void delete(int id) {
        em.remove(em.getReference(Direccion.class, id));
    }
}
