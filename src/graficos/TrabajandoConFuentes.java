package graficos;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import java.awt.*;
import java.awt.geom.*;

public class TrabajandoConFuentes {
    public static void main(String[] args) {

        MarcoConFuentes mimarco=new MarcoConFuentes();
        
    }
}

class MarcoConFuentes extends JFrame{

    public MarcoConFuentes(){
        
        setVisible(true);
        setSize(500,500);
        setLocation(600,200);
        setTitle("Prueba con Fuentes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LaminaConFuentes milamina = new LaminaConFuentes();
        add(milamina);
        //milamina.setBackground(new Color(255,0,255));
        milamina.setBackground(SystemColor.window);
        milamina.setForeground(new Color(200,180,60));

    }
}

class LaminaConFuentes extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d=(Graphics2D) g;

        Font mifuente=new Font("Arial",Font.BOLD,26);
        g2d.setFont(mifuente);
       // g2d.setColor(Color.ORANGE);
        g2d.drawString("Albert", 100, 100);

        g2d.setFont(new Font("Arial",Font.ITALIC,20));
        //g2d.setColor(new Color(100, 34, 159).brighter());
        g2d.drawString("Colores", 100, 200);
     
    }
}