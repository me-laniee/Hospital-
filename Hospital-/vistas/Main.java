import javax.swing.*;

public class Main extends JFrame {

    //opciones de JFrame

    //Mètodo constructor
    public Main(){
        setTitle("Hospital SCL");
        setSize(700,500);
        setLocationRelativeTo(null);

        //texto
        JLabel texto=new JLabel();
        texto.setText("Hola mundo, me llamo MILINI");
        this.add(texto);

        setVisible(true);

    }

    public static void main(String[] args) {
        Main miVentana= new Main();
        new Main();
    }
}
