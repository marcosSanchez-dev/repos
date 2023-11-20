package Graficas;

import javax.swing.JFrame;

public class Ventana extends JFrame{
    public Ventana(){
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("hola munddo");
        this.setSize(500, 500);
        // setLocation(100, 200);
        // setBounds(100, 200, 500, 500);
        setLocationRelativeTo(null);
    }
}
