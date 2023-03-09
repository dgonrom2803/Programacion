package Tema6Prog.Excepciones;

import java.io.FileReader;
import java.io.IOException;

public class EjercicioExcepcionesFileNotFound {
    public static void main(String[] args) {
        try {
            leerFichero("hola.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void leerFichero(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        System.out.println(fileReader.read());
        fileReader.close();
    }
}
