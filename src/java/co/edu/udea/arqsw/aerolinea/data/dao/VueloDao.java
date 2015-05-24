/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.data.dao;

import co.edu.udea.arqsw.aerolinea.data.dto.Lugar;
import co.edu.udea.arqsw.aerolinea.data.dto.Vuelo;
import java.util.Date;
import java.util.List;
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

    @Override
    public List<Vuelo> obtener(Date fechai, Date fechaf, Lugar origen, Lugar destino) {
        return em.createQuery("SELECT v FROM Vuelo v WHERE v.horaSalida >= :" + fechai + " AND v.horaSalida <= :" + fechaf + "AND v.origen = :" + origen + "AND v.destino = :" + destino).getResultList();
    }

}
