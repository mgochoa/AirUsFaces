/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.dao;

import co.edu.udea.arqsw.aerolinea.dto.Vuelo;
import javax.ejb.Local;

/**
 *
 * @author dx
 */
@Local
public interface VueloDaoLocal {

    Vuelo obtener(int id);

    void registrar(Vuelo vuelo);

    void modificar(Vuelo vuelo);

}
