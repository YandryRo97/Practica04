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
public class Grupo implements Serializable 
{
    
    private Long id;
    private String nombre;
    private int numeroEqui;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroEqui() {
        return numeroEqui;
    }

    public void setNumeroEqui(int numeroEqui) {
        this.numeroEqui = numeroEqui;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nombre=" + nombre + ", numeroEqui=" + numeroEqui + '}';
    }
    
}
