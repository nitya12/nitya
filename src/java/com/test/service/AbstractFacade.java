/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.service;

import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author nitya
 */
public abstract class AbstractFacade<T> {

    private Class<T> entityClass;

    public AbstractFacade(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    protected abstract EntityManager getEntityManager();

    public void create(T entity) {
        //getEntityManager().persist(entity);
    }
    
    public T find(Object id) {
        return getEntityManager().find(entityClass, id);
    }

    public List<T> findAll(String[] input) {
        javax.persistence.Query q;
        q = getEntityManager().createNamedQuery("Branches.findAll");
        q.setParameter("city", '%' +input[0] + '%');
        q.setParameter("bankName", '%' +input[1] + '%');
        return q.getResultList();
    }
    
}
