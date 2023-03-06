package Tema6Prog.Excepciones;

import java.io.File;
import java.io.IOException;

public class FileReader {

    public static void main(String[] args) {

    }

    private void close() {
    }

    private static void leer(String filepath) throws IOException {
        FileReader filereader = new FileReader(filepath);
        System.out.println(filereader.read());
        filereader.close();

    }
}
