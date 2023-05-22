package Tema9Prog;

import java.awt.*;

public class InterfazHolaMundo {
    public static void main(String[] args) {
        //Contenedor
        Frame frame = new Frame("Hola mundo!");

        frame.setBackground(Color.LIGHT_GRAY);
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);

        //Control
        Button button = new Button("Salir");
        button.setBounds(150,150,50,50);

        //Añade el control al contenedor
        frame.add(button);
    }
}
