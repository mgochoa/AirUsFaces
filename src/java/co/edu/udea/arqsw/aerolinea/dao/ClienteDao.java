/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.dao;

import co.edu.udea.arqsw.aerolinea.dto.Cliente;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dx
 */
@Stateless
public class ClienteDao implements ClienteDaoLocal {

    @PersistenceContext(unitName = "AerolineaPU")
    private EntityManager em;

    @Override
    public Cliente obtener(Integer cedula) {
        return em.find(Cliente.class, cedula);
    }

    @Override
    public void registrar(Cliente cliente) {
        em.persist(cliente);
    }

    @Override
    public void modificar(Cliente cliente) {
        em.merge(cliente);
    }

}
