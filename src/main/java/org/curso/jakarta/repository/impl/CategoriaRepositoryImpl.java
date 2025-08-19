package org.curso.jakarta.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.curso.jakarta.model.Categoria;
import org.curso.jakarta.repository.CategoriaRepository;

import java.util.List;

public class CategoriaRepositoryImpl implements CategoriaRepository {

    @PersistenceContext(unitName = "productosJPA")
    EntityManager em;

    @Override
    @Transactional
    public Categoria save(Categoria categoria) {
        em.persist(categoria);
        return categoria;
    }

    @Override
    public List<Categoria> list() {
        return em.createQuery("SELECT c FROM categorias", Categoria.class).getResultList();
    }

    @Override
    public Categoria get(int id) {
        return em.find(Categoria.class, id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        em.remove(em.getReference(Categoria.class, id));
    }
}
