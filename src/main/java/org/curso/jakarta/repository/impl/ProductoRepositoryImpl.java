package org.curso.jakarta.repository.impl;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;
import org.curso.jakarta.model.Producto;
import org.curso.jakarta.repository.ProductoRepository;

import java.util.List;

public class ProductoRepositoryImpl implements ProductoRepository {

    @PersistenceContext(unitName = "productosJPA")
    EntityManager em;

    @Override
    @Transactional
    public Producto save(Producto prod) {
        em.persist(prod);
        return prod;
    }

    @Override
    @Transactional
    public Object getProductos() {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Producto> cq = cb.createQuery(Producto.class);
        Root<Producto> product = cq.from(Producto.class);
        cq.select(product);
        TypedQuery<Producto> q = em.createQuery(cq);
        List<Producto> allProductos = q.getResultList();

        return allProductos;

    }

    @Override
    @Transactional
    public Producto getByID(int id) {
        return  em.find(Producto.class, id);
    }

    @Override
    @Transactional
    public boolean deleteById(int id) {

        em.remove(em.getReference(Producto.class, id));
        return true;
    }
}
