package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class PruebaTemporizador {
    public static void main(String[] args) {

        // Puedo crear oyente como nuevo objeto DameLaHora o como interfaz
        //DameLaHora oyente = new DameLaHora();
        ActionListener oyente =new DameLaHora();
        Timer miTemporizador = new Timer(5000, oyente);
        miTemporizador.start();
        JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener.");
        System.exit(0);

    }
}

class DameLaHora implements ActionListener {

    public void actionPerformed(ActionEvent e) {

        Date ahora = new Date();
        System.out.println("Te pongo la hora cada 5 segundos: " + ahora);

    }
}