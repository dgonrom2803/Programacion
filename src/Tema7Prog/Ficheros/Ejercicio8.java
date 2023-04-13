package Tema7Prog.Ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio8 {
    public static void main(String[] args) {
        File ejercicio8 = new File("C:\\Users\\1DAW_2223_12\\Downloads\\Nueva carpeta\\ejercicio8.txt");
        try {
            ejercicio8.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try{
            FileWriter fw = new FileWriter(ejercicio8, true);
            fw.write(" a toda la clase");
            fw.close();

            FileReader fr = new FileReader(ejercicio8);
            int i;
            while((i=fr.read()) != -1){
                System.out.print((char) i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
