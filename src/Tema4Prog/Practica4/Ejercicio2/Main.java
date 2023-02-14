package Tema4Prog.Practica4.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        String texto = "Fernando Alonso será el próximo campeón del mundo";
        System.out.println("El texto: '" + texto + "' --> Contiene " + cuentaPalabras(texto) + " palabras");
    }
    public static int cuentaPalabras(String texto){
        int contador=0;
        String [] espacios = texto.split(" ");

        for (int i = 0; i < espacios.length; i++) {
            contador++;
        }
        return contador;
    }
}
