package Tema4Prog.Practica4.Ejercicio1;

public class Triangulo extends Geometria implements Coloreable{
    protected double base;
    protected double altura;
    protected double lado;
    private String color;

    public Triangulo(double base, double altura, String color){

    }


    @Override
    protected double calcularArea() {

        return  (base * altura)/2;
    }

    @Override
    protected double calcularPerimetro() {

        return base * 3;
    }

    @Override
    public void colorear(String color) {
        this.color=color;
    }
}
