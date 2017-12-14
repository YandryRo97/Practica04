/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author PC-MATIC
 */
public class Torneo implements Serializable 
{
    
    private Long id;
    private String fechaIns;
    private Estadio estadio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFechaIns() {
        return fechaIns;
    }

    public void setFechaIns(String fechaIns) {
        this.fechaIns = fechaIns;
    }

    public Estadio getEstadio() {
        return estadio;
    }

    public void setEstadio(Estadio estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "Torneo{" + "id=" + id + ", fechaIns=" + fechaIns + ", estadio=" + estadio + '}';
    }
}
