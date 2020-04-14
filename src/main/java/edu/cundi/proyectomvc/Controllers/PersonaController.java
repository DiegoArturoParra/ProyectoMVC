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
 */
public class PersonaController implements ActionListener {

    private DefaultListModel <Persona> modelo;
    private ViewPersona vista;

    public PersonaController(DefaultListModel<Persona> modelo, ViewPersona vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciarVentana() {
        vista.setTitle("---PERSONAS---");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == vista.btnInsertar) {
            agregarDatos(vista.inputNombre.getText());
        }
    }
    
    private void agregarDatos(String nombre){
        
    }
}
