package graficos;

import javax.swing.*;
import java.awt.event.*;

public class TrabajandoConVentanasShort {
    public static void main(String[] args) {

        MarcoVentana mimarco=new MarcoVentana();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setTitle("Primer Marco");

        MarcoVentana mimarco2=new MarcoVentana();
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mimarco2.setTitle("Segundo Marco");
    }
}

class MarcoVentana extends JFrame{

    public MarcoVentana(){
        
        setVisible(true);
        setBounds(700,300,500,300);
        //setTitle("Respondiendo");

       /* M_Ventana oyenteVentana=new M_Ventana();
        addWindowListener(oyenteVentana);*/
        addWindowListener(new M_Ventana);
    }
}

class M_Ventana extends WindowAdapter {

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Minimizando ventana.");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        // TODO Auto-generated method stub
        System.out.println("Activando ventana.");
    }
    
}