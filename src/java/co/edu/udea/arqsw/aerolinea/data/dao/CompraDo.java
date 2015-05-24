/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.data.dao;

import co.edu.udea.arqsw.aerolinea.data.dto.Compra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dx
 */
@Stateless
public class CompraDo implements CompraDoLocal {

    @PersistenceContext(unitName = "AerolineaPU")
    private EntityManager em;

    @Override
    public Compra obtener(int id) {
        return em.find(Compra.class, id);
    }

    @Override
    public void registrar(Compra compra) {
        em.persist(compra);
    }

    @Override
    public void modificar(Compra compra) {
        em.merge(compra);
    }
}
