package Tema9Prog;

import java.awt.*;

public class Ejercicio3 extends Frame {
    public static void main(String[] args) {
        new Ejercicio3();


    }

    private Ejercicio3() {

        BorderLayout borderLayout = new BorderLayout();
        Button botonArriba = new Button("Arriba");
        Button botonAbajo = new Button("Abajo");
        Button botonIzquierda = new Button("Izquierda");
        Button botonDerecha = new Button("Derecha");
        Button botonCentro = new Button("Centro");

        //setLayout
        borderLayout.addLayoutComponent(botonArriba, BorderLayout.NORTH);
        borderLayout.addLayoutComponent(botonAbajo, BorderLayout.SOUTH);
        borderLayout.addLayoutComponent(botonIzquierda, BorderLayout.WEST);
        borderLayout.addLayoutComponent(botonDerecha, BorderLayout.EAST);
        borderLayout.addLayoutComponent(botonCentro, BorderLayout.CENTER);
        setLayout(borderLayout);



        add(botonArriba);
        add(botonAbajo);
        add(botonIzquierda);
        add(botonDerecha);
        add(botonCentro);


        setSize(300,300);
        setVisible(true);
    }
}
