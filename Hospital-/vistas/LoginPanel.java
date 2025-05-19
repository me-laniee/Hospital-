package vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPanel {

    public JPanel panelLogin;

    public LoginPanel(){
        panelLogin = new JPanel();
        panelLogin.setSize(500, 800);
        panelLogin.setOpaque(true);
        panelLogin.setBackground(Color.PINK);
        panelLogin.setLayout(new GridBagLayout());

        // administrador de diseño
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10,80, 10, 80);
        gbc.fill= GridBagConstraints.HORIZONTAL;
        //gbc.weightx= 1.0;

        // titulo
        JLabel titulo = new JLabel("Login");
        titulo.setPreferredSize(new Dimension(1000,50));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panelLogin.add(titulo, gbc);

        // entrada correo
        JTextField entradaCorreo =new JTextField();
        gbc.gridx = 1;
        gbc.gridy = 1;
        panelLogin.add(entradaCorreo, gbc);

        // entrada contraseña
        JPasswordField entradContrasenna =  new JPasswordField();
        entradContrasenna.setSize(new Dimension(100,50));
        gbc.gridx = 1;
        gbc.gridy = 2;
        panelLogin.add(entradContrasenna, gbc);


        // boton
        JButton btnIngresar= new JButton("INGRESAR");
        btnIngresar.setSize(new Dimension (50,50));
        gbc.gridx = 1;
        gbc.gridy = 3;
        panelLogin.add(btnIngresar, gbc);
    }

    public JPanel getPanel(){
        return panelLogin;
    }
}

