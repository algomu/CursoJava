package graficos;

import java.awt.*;
import java.awt.Toolkit;
import javax.swing.*;

public class CreandoMarcoCentral {
    public static void main(String[] args) {
        MarcoCentrado miMarco=new MarcoCentrado();
    }
}

class MarcoCentrado extends JFrame {

    public MarcoCentrado(){ 

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla=miPantalla.getScreenSize();
        int alturaPantalla=tamanoPantalla.height;
        int anchoPantalla=tamanoPantalla.width;

        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Mi marco centrado");
        
        Image miIcono=miPantalla.getImage("src/graficos/icono.png");
        setIconImage(miIcono);
    }
}