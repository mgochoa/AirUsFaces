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
import java.util.List;
import javax.persistence.Query;

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

    @Override
    public List<Vuelo> obtenerTodos() {
        try {
            Query q = em.createNamedQuery("Vuelo.findAll");  //se crea la consulta EQL
            return q.getResultList();
        } catch (Exception e) {
            System.out.println("Error en :" + e);
            return null;
        }
    }

}
