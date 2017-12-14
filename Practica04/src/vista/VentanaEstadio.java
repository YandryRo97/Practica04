/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionDato;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import modelo.Estadio;

/**
 *
 * @author PC-MATIC
 */
public class VentanaEstadio extends JInternalFrame {

    private List<JLabel> etiList;
    private List<JTextField> txtList;
    private JButton boton;
    private JButton boton2;
    private JPanel panelGuardar;
    private JPanel panelInicial;
    private JPanel panelVer;
    private GestionDato gestionDato;
    private Object[][] datos;
    private Object[] encabezado;
    private DefaultTableModel modeloTabla;
    private JTable tabla;
    private JScrollPane scroll;

    public VentanaEstadio(GestionDato gestionDato) {
        super("Registro Estadio", true, true, true, true);
        this.setSize(500, 300);
        this.gestionDato = gestionDato;
        this.iniciaComponente();
    }

    public void iniciaComponente() {
        this.etiList = new ArrayList<JLabel>();
        this.etiList.add(new JLabel("Ingrese el id"));
        this.etiList.add(new JLabel("Ingrese el nombre"));
        this.etiList.add(new JLabel("Ingrese la ciudad"));
        this.etiList.add(new JLabel("Ingrese la capacidad"));

        this.txtList = new ArrayList<JTextField>();
        this.txtList.add(new JTextField(10));
        this.txtList.add(new JTextField(10));
        this.txtList.add(new JTextField(10));
        this.txtList.add(new JTextField(10));
        
         this.boton = new JButton("Guardar");
        this.boton2 = new JButton("Limpiar");
       /** this.boton.addActionListener(new EventoEstadio(this));
        this.boton2.addActionListener(new EventoEstadio(this));*/
        
        this.encabezado = new Object[4];
        this.encabezado[0] = "Id";
        this.encabezado[1] = "Nombre";
        this.encabezado[2] = "Ciudad";
        this.encabezado[3] = "Capacidad";
        
        Estadio e = new Estadio();
        e.getCapacidad();
        e.getId();
        e.getCiudad();
        e.getNombre();
         
    }
}
