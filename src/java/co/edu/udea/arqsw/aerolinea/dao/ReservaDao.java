/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.dao;

import co.edu.udea.arqsw.aerolinea.dto.Reserva;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dx
 */
@Stateless
public class ReservaDao implements ReservaDaoLocal {

    @PersistenceContext(unitName = "AerolineaPU")
    private EntityManager em;

    @Override
    public Reserva obtener(Integer id) {
        return em.find(Reserva.class, id);
    }

    @Override
    public void registrar(Reserva reserva) {
        em.persist(reserva);
    }

    @Override
    public void modificar(Reserva reserva) {
        em.merge(reserva);
    }
}
