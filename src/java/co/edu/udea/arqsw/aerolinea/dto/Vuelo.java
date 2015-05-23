/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.arqsw.aerolinea.dto;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;

/**
 *
 * @author dx
 */
@Entity
@NamedQueries({
    @NamedQuery(name = "Vuelo.findAll", query = "SELECT v FROM Vuelo v"),
    @NamedQuery(name = "Vuelo.findById", query = "SELECT v FROM Vuelo v WHERE v.id = :id"),
    @NamedQuery(name = "Vuelo.buscarPorHora", query = "SELECT v FROM Vuelo v WHERE v.horaSalida = :horaSalida"),
    @NamedQuery(name = "Vuelo.buscarPorOrigen", query = "SELECT v FROM Vuelo v WHERE v.origen = :origen"),
    @NamedQuery(name = "Vuelo.buscarPorDestino", query = "SELECT v FROM Vuelo v WHERE v.destino = :destino")})
public class Vuelo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "aeropuerto")
    private String aeropuerto;

    @Column(name = "hora")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date horaSalida;

    @JoinColumn(name = "origen")
    @ManyToOne
    private Lugar origen;

    @JoinColumn(name = "destino")
    @ManyToOne
    private Lugar destino;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vuelo)) {
            return false;
        }
        Vuelo other = (Vuelo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.udea.arqsw.aerolinea.dto.Vuelo[ id=" + id + " ]";
    }

    /**
     * @return the aeropuerto
     */
    public String getAeropuerto() {
        return aeropuerto;
    }

    /**
     * @param aeropuerto the aeropuerto to set
     */
    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }

    /**
     * @return the horaSalida
     */
    public Date getHoraSalida() {
        return horaSalida;
    }

    /**
     * @param horaSalida the horaSalida to set
     */
    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    /**
     * @return the origen
     */
    public Lugar getOrigen() {
        return origen;
    }

    /**
     * @param origen the origen to set
     */
    public void setOrigen(Lugar origen) {
        this.origen = origen;
    }

    /**
     * @return the destino
     */
    public Lugar getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(Lugar destino) {
        this.destino = destino;
    }

}