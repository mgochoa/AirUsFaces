/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.data.dao;

import co.edu.udea.arqsw.aerolinea.data.dto.Cliente;
import javax.ejb.Local;

/**
 *
 * @author dx
 */
@Local
public interface ClienteDaoLocal {

    Cliente obtener(Integer cedula);

    void registrar(Cliente cliente);

    void modificar(Cliente cliente);

}
