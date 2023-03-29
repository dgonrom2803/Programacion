package Tema7Prog.EntradaySalida;

import java.util.Scanner;

public class CaracteresScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Pedir al usuario que introduzca 3 caracteres por teclado
        System.out.print("Introduzca el primer caracter: ");
        char c1 = input.next().charAt(0);

        System.out.print("Introduzca el segundo caracter: ");
        char c2 = input.next().charAt(0);

        System.out.print("Introduzca el tercer caracter: ");
        char c3 = input.next().charAt(0);

        // Imprimirlos concatenados
        System.out.write(c1);
        System.out.write(c2);
        System.out.write(c3);
        System.out.println();

        System.out.print(c1);
        System.out.print(c2);
        System.out.print(c3);
        System.out.println();

        System.out.println("" + c1 + c2 + c3);
    }
}
