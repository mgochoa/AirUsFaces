/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.data.dao;

import co.edu.udea.arqsw.aerolinea.data.dto.Lugar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dx
 */
@Stateless
public class LugarDao implements LugarDaoLocal {

    @PersistenceContext(unitName = "AerolineaPU")
    private EntityManager em;

    @Override
    public Lugar obtener(Integer id) {
        return em.find(Lugar.class, id);
    }

}
