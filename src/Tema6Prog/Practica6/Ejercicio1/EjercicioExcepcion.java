package Tema6Prog.Practica6.Ejercicio1;

import java.io.IOException;

public class EjercicioExcepcion {

    public void lanzaExcepcion() throws IOException {
        // Lanzar una excepción de tipo IOException
        throw new IOException("Se produjo un error al introducir los datos");
    }

    public void capturaExcepcion() {
        try {
            // Llamar al método que puede lanzar una excepción
            lanzaExcepcion();
        } catch (IOException e) {
            // Capturar la excepción y mostrar un mensaje personalizado
            System.out.println("Se ha capturado la excepción: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase y llamar al método que captura excepciones
        EjercicioExcepcion ejemplo = new EjercicioExcepcion();
        ejemplo.capturaExcepcion();
    }
}


