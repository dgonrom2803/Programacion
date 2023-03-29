package Tema7Prog.EntradaySalida;


import java.io.IOException;

public class CaracteresPorTeclado {
    public static void main(String[] args) throws IOException, IOException {

        //Pedir al usuario que introduzca 3 caracteres por teclado
        System.out.print("Introduzca 3 caracteres: ");
        int c1 = System.in.read();
        int c2 = System.in.read();
        int c3 = System.in.read();
        //Imprimirlos concatenados

        //1. con write
        System.out.write(c1);
        System.out.write(c2);
        System.out.write(c3);
        System.out.flush();
        System.out.println();

        //2. con print
        System.out.print(((char)c1) + ((char)c2) + ((char)c3));

        //3. con println


    }
}
