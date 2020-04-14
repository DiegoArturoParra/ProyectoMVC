package edu.cundi.proyectomvc.Controllers;

import edu.cundi.proyectomvc.Views.*;
import edu.cundi.proyectomvc.Models.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;

/**
 *
 * @author diego parra
 * @version 1.0.0
 * Clase Controlador
 */
public class PersonaController implements ActionListener {

    /**
     * variable que guarda una lista por default de objeto Persona.
     */
    private DefaultListModel<Persona> modelo;
    /**
     * se instancia la vista.
     */
    private ViewPersona vista;

    /**
     *
     * @param modelo parametro de la instancia del modelo Persona
     * @param vista parametro de la instancia de la vista
     */
    public PersonaController(DefaultListModel<Persona> modelo, ViewPersona vista) {
        this.modelo = modelo;
        this.vista = vista;
        this.vista.btnInsertar.addActionListener(this);
    }

    /**
     * Metodo que hace visible el formulario.
     */
    public void iniciarVentana() {
        vista.setTitle("---PERSONAS---");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    /**
     *
     * @param e evento del boton
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnInsertar) {
            agregarDatos(vista.inputNombre.getText());
        }
    }

    /**
     *
     * @param nombre Metodo que agrega datos, y lo muestra en la vista.
     */
    private void agregarDatos(String nombre) {
        modelo.addElement(new Persona(nombre));
        vista.listaPersona.setModel(modelo);
    }
}
