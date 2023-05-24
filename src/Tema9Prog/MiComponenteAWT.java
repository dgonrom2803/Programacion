package Tema9Prog;

import java.awt.*;
import java.awt.event.*;

public class MiComponenteAWT extends Frame{
    Button botonSalir;

    public static void main(String[] args) {
        new MiComponenteAWT();
    }
    MiComponenteAWT (){
        setTitle("Mi componente");
        setVisible(true);
        setLayout(null);
        setBounds(200,200,400,400);

        botonSalir = new Button("Salir");
        botonSalir.setBounds(50,50,50,50);
        add(botonSalir);

        //Con clase aparte
        //botonSalir.addActionListener(new MiListener(this));

        //Simplificado
        botonSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ((Frame)botonSalir.getParent()).dispose();
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                MiComponenteAWT.this.dispose();
            }
        });
    }
}
