package Tema9Prog;

import java.awt.*;

public class Login {
    public static void main(String[] args) {
        //Contenedor
        Frame frame = new Frame("Login");

        frame.setBackground(Color.LIGHT_GRAY);
        frame.setLayout(null);
        frame.setSize(300, 300);
        frame.setVisible(true);

        //Etiquetas
        Label l1, l2;
        l1 = new Label ("Nombre: ");
        l2 = new Label ("Password: ");

        //Campos de texto
        TextField tf1 = new TextField();
        tf1.setBounds(100,100,150,30);
        l1.setBounds(25,100,100,30);

        TextField tf2 = new TextField();
        tf2.setBounds(100,150,150,30);
        l2.setBounds(25,150,100,30);

        //Botones
        Button button1 = new Button("Cancelar");
        button1.setBounds(75,200,70,30);
        Button button2 = new Button("Acceder");
        button2.setBounds(150,200,70,30);

        //Añadimos al container
        frame.add(tf1);
        frame.add(tf2);
        frame.add(button1);
        frame.add(button2);
        frame.add(l1);
        frame.add(l2);
    }
}
