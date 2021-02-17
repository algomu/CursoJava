package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TrabajandoConBotones {
    public static void main(String[] args) {

        MarcoConBoton mimarco=new MarcoConBoton();
        
    }
}

class MarcoConBoton extends JFrame{

    public MarcoConBoton(){
        
        setVisible(true);
        setBounds(700,300,500,300);
        setTitle("Botones y Eventos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LaminaConBoton milamina = new LaminaConBoton();
        add(milamina);
        //milamina.setBackground(new Color(255,0,255));
        milamina.setBackground(SystemColor.window);

    }
}

class LaminaConBoton extends JPanel {
      
        JButton botonAzul = new JButton("Azul");
        JButton botonAmarillo= new JButton("Amarillo");
        JButton botonRojo = new JButton("Rojo");

        public LaminaConBoton(){
            add(botonAzul);
            add(botonAmarillo);
            add(botonRojo);

            ColorFondo amarillo=new ColorFondo(Color.YELLOW);
            ColorFondo azul = new ColorFondo(Color.BLUE);
            ColorFondo rojo = new ColorFondo(Color.RED);

            botonAzul.addActionListener(azul);
            botonAmarillo.addActionListener(amarillo);
            botonRojo.addActionListener(rojo);
        }

        private class ColorFondo implements ActionListener {

            private Color colorDeFondo;
        
            public ColorFondo(Color c){
                colorDeFondo=c;
            }
        
            public void actionPerformed(ActionEvent e){
        
                setBackground(colorDeFondo);
            }
        }
}