package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Estadio;
import vista.VentanaEstadio;

/**
 *
 * @author Alex Reinoso
 */
public class EventoEstadio implements ActionListener {

    private VentanaEstadio ventanaEstadio;

    public EventoEstadio(VentanaEstadio ventanaEstadio) {
        this.ventanaEstadio = ventanaEstadio;
    }

    public VentanaEstadio getVentanaEstadio() {
        return ventanaEstadio;
    }

    public void setVentanaEstadio(VentanaEstadio ventanaEstadio) {
        this.ventanaEstadio = ventanaEstadio;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        try {
            if (ae.getSource().equals(this.ventanaEstadio.getBoton())) {
                Long id = Long.parseLong(this.ventanaEstadio.getTxtList().get(0).getText());
                String nombre = this.ventanaEstadio.getTxtList().get(1).getText();
                String ciudad = this.ventanaEstadio.getTxtList().get(2).getText();
                Long capacidad = Long.parseLong(this.ventanaEstadio.getTxtList().get(3).getText());

                for (Estadio es : this.ventanaEstadio.getGestionDato().getEstadioList()) {
                    if (nombre.equals(es.getNombre())) {
                        throw new ExcepcionDatoRepetido("Nombre repetido");
                    }
                }
                Estadio e = new Estadio(id, nombre, ciudad, capacidad);
                ventanaEstadio.getGestionDato().getEstadioList().add(e);
                JOptionPane.showMessageDialog(this.ventanaEstadio, "Guardado");
                //AQUI VA EL METODO PERSIST PAIS DE GESTION DATO QUE ANIADE LOS DATOS A LA TABLA DE LA BASE DE DATOS
                //this.ventanaPais.getGestionDato().persistirPais(pa);
                //AQUI VA EL METODO LEER PAIS DE GESTION DATO QUE ANIADE LOS DATOS A LA TABLA DE LA BASE DE DATOS
                //this.ventanaPais.getGestionDato().leerPais();
            }

            Object[][] datosEstadio = this.ventanaEstadio.cargaDatosTabla(this.ventanaEstadio.getGestionDato().getEstadioList().size(), 4);
            this.ventanaEstadio.setDatos(datosEstadio);
            this.ventanaEstadio.getModeloTabla().setDataVector(this.ventanaEstadio.getDatos(), this.ventanaEstadio.getEncabezado());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this.ventanaEstadio, "Mal ingreso de datos");

        } catch (ExcepcionDatoRepetido ex) {
            JOptionPane.showMessageDialog(this.ventanaEstadio, "Cargo repetido");
        }

    }

}
