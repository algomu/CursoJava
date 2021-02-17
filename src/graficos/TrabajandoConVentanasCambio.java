package graficos;

import javax.swing.*;

import java.awt.Frame;
import java.awt.event.*;

public class TrabajandoConVentanasCambio {
    public static void main(String[] args) {

        MarcoVentana2 mimarco=new MarcoVentana2();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setTitle("Primer Marco");
    }
}

class MarcoVentana2 extends JFrame{

    public MarcoVentana2(){
        
        setVisible(true);
        setBounds(700,300,500,300);
        addWindowStateListener(new M_Ventana2());
    }
}

class M_Ventana2 implements WindowStateListener {

    @Override
    public void windowStateChanged(WindowEvent e) {
        System.out.println("El estado anterior era: " + e.getOldState() + ", el estado actual es: " + e.getNewState());
        if (e.getNewState()==Frame.MAXIMIZED_BOTH) {
            System.out.println("Ventana a tamaño completo.");
        }
    }

}