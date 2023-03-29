package Tema7Prog.EntradaySalida;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca su nombre:");

        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre + "!");
    }
}
