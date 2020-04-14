package edu.cundi.proyectomvc.Controllers;

import edu.cundi.proyectomvc.Models.Persona;
import edu.cundi.proyectomvc.Views.ViewPersona;
import javax.swing.DefaultListModel;

/**
 *
 * @author diego parra
 * @version 1.0.0
 * Clase que corre el programa instanciando el controlador con sus parametros que al igual son instancias de una clase.
 */
public class Main {
    public static void main(String[] args) {
             
        DefaultListModel<Persona> modelo = new DefaultListModel();
        ViewPersona vista = new ViewPersona();
        PersonaController controlador = new PersonaController(modelo,vista);
        controlador.iniciarVentana();
    }
}
