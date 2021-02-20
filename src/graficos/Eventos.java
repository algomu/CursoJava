package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Eventos {
    public static void main(String[] args) {
        MarcoCon mimarco = new MarcoCon();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
class MarcoCon extends JFrame {
    public MarcoCon(){
        setVisible(true);
        setBounds(700,300,600,450);
    }
}
