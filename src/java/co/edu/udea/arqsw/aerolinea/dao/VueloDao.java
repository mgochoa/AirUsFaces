/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.dao;

import co.edu.udea.arqsw.aerolinea.dto.Vuelo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dx
 */
@Stateless
public class VueloDao implements VueloDaoLocal {

    @PersistenceContext(unitName = "AerolineaPU")
    private EntityManager em;

    @Override
    public Vuelo obtener(int id) {
        return em.find(Vuelo.class, id);
    }

    @Override
    public void registrar(Vuelo vuelo) {
        em.persist(vuelo);
    }

    @Override
    public void modificar(Vuelo vuelo) {
        em.merge(vuelo);
    }
}
