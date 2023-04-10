package Tema7Prog.ClasesdeFlujo;

import javax.imageio.stream.FileImageOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FlujoFicheroBinario {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            //Crear Stream
            fileOutputStream = new FileOutputStream("FlujoFicheroBinario.bin");
            //Escribir el Stream
            fileOutputStream.write("hola".getBytes());
            // TODO: Cerrar Stream
            fileOutputStream.close();


        } catch (FileNotFoundException e) {
            System.out.println("El fichero no existe");
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
