package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

public class PruebaDibujo {
    public static void main(String[] args) {
        MarcoConDibujos mimarco = new MarcoConDibujos();

    }
}

class MarcoConDibujos extends JFrame {

    public MarcoConDibujos() {

        setVisible(true);
        setTitle("Prueba de dibujo");
        setSize(400, 400);
        setLocation(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LaminaConFiguras milamina2 = new LaminaConFiguras();
        add(milamina2);
    }
}

class LaminaConFiguras extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        /*
         * g.drawString("Casita", 60, 60); 
         * g.drawRect(40, 40, 320, 280); 
         * g.drawLine(40, 180, 360, 180); 
         * g.drawArc(0, 100, 160, 50, 10, 60);
         */

         Graphics2D g2=(Graphics2D) g;
         Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,200);
         g2.draw(rectangulo);

         //Ellipse2D elipse = new Ellipse2D.Double(100,100,200,50);
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.draw(elipse);
        g2.draw(new Line2D.Double(100,100,300,300));
        g2.draw(new Line2D.Double(100,300,300,100));

        double centroX=rectangulo.getCenterX();
        double centroY=rectangulo.getCenterY();
        double radio=100;

        Ellipse2D circulo=new Ellipse2D.Double();
        circulo.setFrameFromCenter(centroX, centroY, centroX+radio, centroY+radio);
        g2.draw(circulo);
    }
}