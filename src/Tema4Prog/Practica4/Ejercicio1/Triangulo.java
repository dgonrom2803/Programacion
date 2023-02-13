package Tema4Prog.Practica4.Ejercicio1;

public class Triangulo extends Geometria implements Coloreable{
    protected double base;
    protected double altura;
    protected double lado;
    private String color;


    @Override
    protected double calcularArea() {
        return  base * altura;
    }

    @Override
    protected double calcularPerimetro() {
        return 0;
    }

    @Override
    public void colorear(String color) {
        this.color = color;
    }
}
