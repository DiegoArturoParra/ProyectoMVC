package edu.cundi.proyectomvc.Views;

import java.awt.*;
import javax.swing.*;

/**
 * @author diego parra
 * @version 1.0.0
 */
public class ViewPersona extends JFrame {

    private final JLabel labelNombre = new JLabel("Nombre");
    public final JTextField inputNombre = new JTextField(20);
    public JButton btnInsertar;
    private JScrollPane scroll;
    public JList listaPersona;
    public JPanel panel;

    public ViewPersona() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500, 300);
        //--- PANEL
        panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        add(panel, BorderLayout.CENTER);

        btnInsertar = new JButton("Insertar");
        btnInsertar.setPreferredSize(new Dimension(130, 30));
        listaPersona = new JList<>();
        listaPersona.setPreferredSize(new Dimension(200, 200));
        scroll = new JScrollPane();
        scroll.setViewportView(this.listaPersona);
        /**
         * graficos por grillas row y Column
         */
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = 1;
        c.weightx = 1;
        c.weighty = 1;

        c.gridx = 0;
        c.gridy = 0;
        panel.add(labelNombre, c);

        c.gridx = 1;
        c.gridy = 0;
        panel.add(inputNombre, c);

        c.gridx = 2;
        c.gridy = 0;
        panel.add(btnInsertar, c);
        GridBagConstraints p = new GridBagConstraints();
        p.gridwidth = 1;
        p.weightx = 1;
        p.weighty = 1;

        p.gridx = 1;
        p.gridy = 1;
        panel.add(listaPersona, p);
        panel.add(scroll,p);
    }

}
