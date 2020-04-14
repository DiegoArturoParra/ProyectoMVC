package edu.cundi.proyectomvc.Controllers;

import edu.cundi.proyectomvc.Models.Persona;
import edu.cundi.proyectomvc.Views.ViewPersona;
import javax.swing.DefaultListModel;

/**
 *
 * @author diego parra
 * @version 1.0.0
 */
public class Main {
    public static void main(String[] args) {
             
        DefaultListModel<Persona> modelo = new DefaultListModel();
        ViewPersona vista = new ViewPersona();
        PersonaController controlador = new PersonaController(modelo,vista);
        controlador.iniciarVentana();
    }
}
