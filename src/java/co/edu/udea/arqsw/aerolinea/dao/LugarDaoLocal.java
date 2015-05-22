/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.dao;

import co.edu.udea.arqsw.aerolinea.dto.Lugar;
import javax.ejb.Local;

/**
 *
 * @author dx
 */
@Local
public interface LugarDaoLocal {

    Lugar obtener(Integer id);
    
}
