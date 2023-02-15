package Tema4Prog.Practica4.Ejercicio5;

public class Main {
    public static void main(String[] args) {
        String texto = "Escribe el código de un programa que dado el contenido de un texto y una determinada palabra, realice búsquedas de la palabra dentro de él. La secuencia de ejecución será: crear un texto, crear una palabra, invocar al método con estos parámetros, buscar número de ocurrencias de la palabra en texto, obtener la salida del método y mostrar por pantalla el número de apariciones de la palabra.";
        String palabra = "el";
        System.out.println("Escriba un texto: " + texto);
        System.out.println("Escriba la palabra en el buscador: " + palabra);
        int numero= busquedaPalabra(texto, palabra);
        System.out.println("La palabra '" + palabra + "' aparece " + numero + " veces en el texto.");
        }
        private static int busquedaPalabra(String texto, String palabra) {
            int count = 0;
            String[] ejercicio = texto.split(" |,|\\.|;");
            for (int i = 0; i < ejercicio.length; i++) {
                if (ejercicio[i].equalsIgnoreCase( palabra)) {
                    count++;
                }
            }
            return count;
        }
}


