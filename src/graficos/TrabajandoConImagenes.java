package graficos;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;
import java.util.MissingFormatArgumentException;



public class TrabajandoConImagenes {
    public static void main(String[] args) {

        MarcoConImagen mimarco=new MarcoConImagen();
        
    }
}

class MarcoConImagen extends JFrame{

    public MarcoConImagen(){
        
        setVisible(true);
        setSize(600,600);
        setLocation(600,200);
        setTitle("Prueba con Fuentes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LaminaConImagen milamina = new LaminaConImagen();
        add(milamina);
    

    }
}

class LaminaConImagen extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Se podria llevar la imagen al constructor, ahora mismo es por defecto.
        try {
            imagen=ImageIO.read(new File("/Users/algomu/Documents/PruebasJava/CursoJava/src/graficos/peque.gif"));
        } catch (IOException e) {
            //TODO: handle exception
            System.out.println("La imagen no se encuentra.");
        }
        
        g.drawImage(imagen, 0, 0, null);
        int anchoImagen=imagen.getWidth(this);
        int altoImagen=imagen.getHeight(this);


        for (int i = 0; i < 600/anchoImagen; i++) {
            for (int j = 0; j < 600/altoImagen; j++) {
                if(i+j>0) {
                    g.copyArea(0, 0, altoImagen, anchoImagen, anchoImagen*i, altoImagen*j);
                } 
            }    
        }
    }

    private Image imagen;
}