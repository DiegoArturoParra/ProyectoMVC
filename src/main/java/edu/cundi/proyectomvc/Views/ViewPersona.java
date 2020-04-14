package edu.cundi.proyectomvc.Views;

import java.awt.*;
import javax.swing.*;

/**
 * @author diego parra
 * @version 1.0.0
 */
public class ViewPersona extends JFrame {

    /**
     * label que muestra un texto en el formulario.
     */
    private final JLabel labelNombre = new JLabel("Nombre");
    /**
     * caja de texto donde se digita el nombre.
     */
    public final JTextField inputNombre = new JTextField(20);
    /**
     * boton para insertar dentro del jlist.
     */
    public JButton btnInsertar;
    /**
     * scroll para desplazar el jlist.
     */
    private JScrollPane scroll;
    /**
     * jlist imprime lo que se inserta a partir de un DefaultListModel
     */
    public JList listaPersona;
    /**
     * panel para dar diseño al formulario.
     */
    private JPanel panel;
    /**
     * Contenedor.
     */
    private Container contenedor;
    private GridBagLayout gridBag;

    public ViewPersona() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        contenedor = getContentPane();
//--- PANEL
        panel = new JPanel();
        scroll = new JScrollPane(this.panel);
        gridBag = new GridBagLayout();
        contenedor.setLayout(gridBag);
        btnInsertar = new JButton("Insertar");
        btnInsertar.setPreferredSize(new Dimension(130, 30));
        listaPersona = new JList<>();
        listaPersona.setPreferredSize(new Dimension(200, 200));

        
        
        /**
         * graficos por grillas row y Column
         */
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = 1;
        c.weightx = 1;
        c.weighty = 1;

        c.gridx = 0;
        c.gridy = 0; 
        
        
        
        gridBag.setConstraints(scroll, c);
        contenedor.setLayout(new BorderLayout());
        contenedor.add(scroll);
        c.gridx = 1;
        c.gridy = 0;
        
        
        gridBag.setConstraints(labelNombre, c);

        panel.add(inputNombre, c);

        c.gridx = 2;
        c.gridy = 0;
        panel.add(btnInsertar, c);

        c.gridx = 1;
        c.gridy = 1;
        panel.add(listaPersona, c);

    }
}
