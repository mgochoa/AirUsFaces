/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.session;

import co.edu.udea.arqsw.aerolinea.data.dto.Lugar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author felipe
 */
@Stateless
public class LugarFacade extends AbstractFacade<Lugar> {
    @PersistenceContext(unitName = "AerolineaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public LugarFacade() {
        super(Lugar.class);
    }
    
}
