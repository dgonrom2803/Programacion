package Tema7Prog.EntradaySalida;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduzca su nombre: ");
        int nombre = System.in.read();

        System.out.println("Hola: " + (char)nombre);
        }
    }

