/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.data.dao;

import co.edu.udea.arqsw.aerolinea.data.dto.Reserva;
import javax.ejb.Local;

/**
 *
 * @author dx
 */
@Local
public interface ReservaDaoLocal {

    Reserva obtener(Integer id);

    void registrar(Reserva reserva);

    void modificar(Reserva reserva);

}
