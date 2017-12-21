/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.VentanaGrupo;

/**
 *
 * @author USUARIO
 */
public class EventoGrupo  implements ActionListener{
    
    private VentanaGrupo ventanaGrupo;
    private GestionDato gD;

    public EventoGrupo(VentanaGrupo ventanaGrupo) {
        this.ventanaGrupo = ventanaGrupo;
    }

    public VentanaGrupo getVentanaGrupo() {
        return ventanaGrupo;
    }

    public void setVentanaGrupo(VentanaGrupo ventanaGrupo) {
        this.ventanaGrupo = ventanaGrupo;
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
