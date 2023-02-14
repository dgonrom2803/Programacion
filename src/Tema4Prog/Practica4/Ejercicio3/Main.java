package Tema4Prog.Practica4.Ejercicio3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Construye un programa que genere 100 números aleatorios mediante el uso de la función Math.random
        int[] arrayNumAleatorios = new int[100];
        numerosAleatorios(arrayNumAleatorios);
        // y que posteriormente ofrezca al usuario la posibilidad de:
        //Conocer el mayor de los números.
        numeroMayor(arrayNumAleatorios);
        //Conocer el menor de los números.
        numeroMenor(arrayNumAleatorios);
        //Obtener la suma de todos los números.
        sumaNumeros(arrayNumAleatorios);
        //Obtener la media de los números.
        mediaNumeros(arrayNumAleatorios);
        //Sustituir el valor de un elemento por otro número dado.
    }
    static void numerosAleatorios(int[] arrayNumAleatorios){
        for (int i = 0; i < arrayNumAleatorios.length; i++) {
            arrayNumAleatorios[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(arrayNumAleatorios));
    }
    static int numeroMayor(int[] arrayNumAleatorios){
        int mayor = 0;
        for (int i = 0; i < arrayNumAleatorios.length; i++) {
            if (arrayNumAleatorios[i] > mayor){
                mayor = arrayNumAleatorios[i];
            }
        }
        System.out.println("El mayor es: " + mayor);
        return mayor;
    }
    static int numeroMenor(int[] arrayNumAleatorios){
        int menor = 0;
        for (int i = 0; i < arrayNumAleatorios.length; i++) {
            if (arrayNumAleatorios[i] < menor){
                menor = arrayNumAleatorios[i];
            }
        }
        System.out.println("El menor es: " + menor);
        return menor;
    }
    static int sumaNumeros (int[] arrayNumAleatorios){
        int suma = 0;
        for (int i = 0; i < arrayNumAleatorios.length; i++) {
            suma += arrayNumAleatorios[i];
        }
        System.out.println("La suma de los números da: " + suma);
        return suma;
    }
    static int mediaNumeros (int[] arrayNumAleatorios) {
        int suma = 0;
        for (int i = 0; i < arrayNumAleatorios.length; i++) {
            suma += arrayNumAleatorios[i];
        }
        int media = (suma / 100);
        System.out.println("La media de los números es: " + media);
        return media;
    }
}
