import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.*;

import vistas.LoginPanel;

public class Main {
    public static void main(String[] args) {

        // Ventana
        JFrame miVentana = new JFrame();
        miVentana.setTitle("Hospital-SCL");
        miVentana.setSize(1000, 800);
        miVentana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        miVentana.setLayout(new BorderLayout());

        // Panel Baner
        JPanel panelBaner = new JPanel();
        panelBaner.setPreferredSize(new Dimension(500, 800));
        panelBaner.setOpaque(true);
        panelBaner.setBackground(Color.MAGENTA);
        miVentana.add(panelBaner, BorderLayout.WEST);

        // Panel Login
        LoginPanel panelLogin = new LoginPanel();
        miVentana.add(panelLogin.getPanel(), BorderLayout.CENTER);

        miVentana.setVisible(true); // Hace visible la ventana en la pantalla

    }
}