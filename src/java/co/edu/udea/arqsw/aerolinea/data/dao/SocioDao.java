/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.data.dao;

import co.edu.udea.arqsw.aerolinea.data.dto.Socio;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author dx
 */
@Stateless
public class SocioDao implements SocioDaoLocal {

    @PersistenceContext(unitName = "AerolineaPU")
    private EntityManager em;

    @Override
    public Socio obtener(Integer cedula, String pass) {
        Socio s = em.find(Socio.class, cedula);
        if (null != s) {
            if (s.getPass().equals(pass)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public void registrar(Socio socio) {
        em.persist(socio);
    }

    @Override
    public void modificar(Socio socio) {
        em.merge(socio);
    }

    @Override
    public Socio obtener(Integer cedula) {
        return em.find(Socio.class, cedula);
    }

}
