package Tema4Prog.Practica4.Ejercicio1;

public class Cuadrado extends Geometria implements Coloreable{
    private Double lado;
    private String color;

    public Cuadrado(){}

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    protected double calcularArea() {
        return Math.pow(lado,2);
    }

    @Override
    protected double calcularPerimetro() {
        return lado * 4;
    }
}
