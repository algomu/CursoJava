package graficos;

import javax.swing.*;
import java.awt.*;


public class FocoEvento {
    public static void main(String[] args) {
        MarcoFoco mimarco = new MarcoFoco();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoFoco extends JFrame {

    public MarcoFoco() {
        setVisible(true);
        setBounds(700,300,600,450);
        add(new LaminaFoco());
    }
}

class LaminaFoco extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        setLayout(null);
        cuadro1= new JTextField();
        cuadro2= new JTextField();
        cuadro1.setBounds(120, 10, 150, 20);
        cuadro2.setBounds(120, 50, 150, 20);
        add(cuadro1);
        add(cuadro2);
    }

    JTextField cuadro1;
    JTextField cuadro2;
}