package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class TrabajandoColores {
    public static void main(String[] args) {

        MarcoConColor mimarco=new MarcoConColor();
        
    }
}

class MarcoConColor extends JFrame{

    public MarcoConColor(){
        
        setVisible(true);
        setSize(500,500);
        setLocation(600,200);
        setTitle("Mi primer dibujo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LaminaConColor milamina = new LaminaConColor();
        add(milamina);
        //milamina.setBackground(new Color(255,0,255));
        milamina.setBackground(SystemColor.window);

    }
}

class LaminaConColor extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d=(Graphics2D) g;
        Rectangle2D rectangulo=new Rectangle2D.Double(50,50,400,400);
        g2d.setPaint(Color.RED);
        g2d.fill(rectangulo);
        g2d.setPaint(Color.BLACK);
        g2d.draw(rectangulo);

        Ellipse2D elipse=new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        //g2d.setPaint(Color.GREEN);
        g2d.setPaint(new Color (0,34,99));
        g2d.fill(elipse);
        g2d.setPaint(Color.WHITE);
        g2d.draw(elipse);

    }
}