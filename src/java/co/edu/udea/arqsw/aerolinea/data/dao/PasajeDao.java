/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.data.dao;

import co.edu.udea.arqsw.aerolinea.data.dto.Pasaje;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dx
 */
@Stateless
public class PasajeDao implements PasajeDaoLocal {
    
    @PersistenceContext(unitName = "AerolineaPU")
    private EntityManager em;
    
    @Override
    public Pasaje obtener(Integer id) {
        return em.find(Pasaje.class, id);
    }
    
    @Override
    public void modificar(Pasaje pasaje) {
        em.merge(pasaje);
    }
    
    @Override
    public void registrar(Pasaje pasaje) {
        em.persist(pasaje);
    }
}
