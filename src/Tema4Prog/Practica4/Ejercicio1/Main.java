package Tema4Prog.Practica4.Ejercicio1;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Geometria [] shapes = new Geometria[6];
        shapes[0] = new Cuadrado(2d, "Azul");
        shapes[1] = new Cuadrado(4d, "Rojo");
        shapes[2] = new Circulo(2d,"Azul");
        shapes[3] = new Circulo(4d, "Rojo");
        shapes[4] = new Triangulo(2d,2d, "Azul");
        shapes[5] = new Triangulo(4d,4d, "Rojo");

        System.out.println(Arrays.toString(shapes));
        double totalAreas = 0;
        double totalPerimetro = 0;

        for (int i = 0; i < shapes.length; i++) {
            totalAreas += shapes[i].calcularArea();
            totalPerimetro += shapes[i].calcularPerimetro();
        }

        System.out.println(totalAreas);
        System.out.println(totalPerimetro);
    }
}
