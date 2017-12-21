/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaJugador;

/**
 *
 * @author USUARIO
 */
public class EventoJugador implements ActionListener{
    
    private VentanaJugador ventana;
    private GestionDato gD;

    public EventoJugador(VentanaJugador ventana) {
        this.ventana = ventana;
    }

    public VentanaJugador getVentana() {
        return ventana;
    }

    public void setVentana(VentanaJugador ventana) {
        this.ventana = ventana;
    }

    public GestionDato getgD() {
        return gD;
    }

    public void setgD(GestionDato gD) {
        this.gD = gD;
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
