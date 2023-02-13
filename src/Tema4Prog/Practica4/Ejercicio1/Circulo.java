package Tema4Prog.Practica4.Ejercicio1;

public class Circulo extends Geometria implements Coloreable{
    protected double radio;
    private String color;

    @Override
    public void colorear(String color) {
        this.color = color;
    }

    @Override
    protected double calcularArea() {
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    protected double calcularPerimetro() {
        return 2 * radio * Math.PI;
    }
}
