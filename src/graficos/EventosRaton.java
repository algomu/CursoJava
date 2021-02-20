package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.*;

public class EventosRaton {
    public static void main(String[] args) {
        MarcoRaton mimarco = new MarcoRaton();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoRaton extends JFrame {
    public MarcoRaton(){
        setVisible(true);
        setBounds(700,300,600,450);
        EventosDeRaton raton = new EventosDeRaton();
        addMouseListener(raton);
    }
}

class EventosDeRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        //System.out.println("Coordenada X: "+ e.getX() + "Coordenada Y: " + e.getY());
        System.out.println(e.getClickCount());


    }

    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub

        System.out.println(e.getModifiersEx());


    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Estas sobre el marco");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }

}