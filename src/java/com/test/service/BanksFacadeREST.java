/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.service;

import com.test.Banks;
import com.test.Branches;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author nitya
 */
@Stateless
@Path("com.test.banks")
public class BanksFacadeREST extends AbstractFacade<Banks> {

    @PersistenceContext(unitName = "TestApp1PU")
    private EntityManager em;

    public BanksFacadeREST() {
        super(Banks.class);
    }

    @POST
    @Override
    @Consumes(MediaType.APPLICATION_XML)
    public void create(Banks entity) {
//        super.create(entity);
    }


    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
