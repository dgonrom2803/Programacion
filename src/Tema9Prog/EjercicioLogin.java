package Tema9Prog;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class EjercicioLogin extends Frame {
Button botonCancelar;
Button botonAceptar;



    public static void main(String[] args) {
        new EjercicioLogin();
    }

        public EjercicioLogin (){
            setTitle("Login");
            setVisible(true);
            setBackground(Color.LIGHT_GRAY);
            setLayout(null);
            setSize(300,300);

            //Etiquetas
            Label l1, l2;
            l1 = new Label ("Nombre: ");
            l2 = new Label ("Password: ");

            //Campos de texto
            TextField tf1 = new TextField();
            tf1.setBounds(100,100,150,30);
            l1.setBounds(25,100,100,30);
            add(tf1);
            add(l1);

            TextField tf2 = new TextField();
            tf2.setBounds(100,150,150,30);
            l2.setBounds(25,150,100,30);
            add(tf2);
            add(l2);

            //Botones
            botonCancelar = new Button("Cancelar");
            botonCancelar.setBounds(75,200,70,30);
            add(botonCancelar);

            botonAceptar = new Button("Aceptar");
            botonAceptar.setBounds(150,200,70,30);
            add(botonAceptar);

            botonCancelar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    tf1.setText("");
                    tf2.setText("");
                }
            });

            botonAceptar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    EjercicioLogin.this.dispose();
                    Frame login = new Frame("Login");
                    login.setVisible(true);
                    login.setBackground(Color.LIGHT_GRAY);
                    login.setLayout(null);
                    login.setSize(300,300);

                    Label l3 = new Label ("¡Bienvenido!");
                    l3.setBounds(115,135,100,50);
                    login.add(l3);
                }
            });





            this.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    EjercicioLogin.this.dispose();
                }
            });
        }
}
