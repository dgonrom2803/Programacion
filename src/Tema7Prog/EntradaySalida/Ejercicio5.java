package Tema7Prog.EntradaySalida;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        String usuario = "usuario";
        String contrasena = "contrasena";
        int intentos = 3;

        Scanner scanner = new Scanner(System.in);

        while (intentos > 0){
            System.out.print("Introduzca su nombre de usuario: ");
            String pruebaUsuario = scanner.nextLine();

            System.out.print("Introduzca su contraseña: ");
            String pruebaContrasena = scanner.nextLine();
        }
    }


}
