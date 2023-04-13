package Tema7Prog.Ficheros;

import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) throws IOException {
    //1. Crea un nuevo fichero eliminando el que ya existia en su caso.
        File fichero = new File("C:\\Users\\1DAW_2223_12\\Downloads\\Nueva carpeta\\miFichero.txt");
        if (fichero.exists()) {
            fichero.delete();
        }
        try{
            fichero.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //2. Abre un flujo  de acceso aleatorio al fichero e introduce la cadena "defg".
        RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
        raf.writeBytes("defg");
        raf.seek(0);
        System.out.println(raf.readLine());

        //4. Añade al principio la cadena "abc" y al final la cadena "hij".
        raf.writeBytes("hij");
        raf.seek(0);
        System.out.println(raf.readLine());
        raf.seek(0);
        String temp = raf.readLine();
        raf.seek(0);
        raf.writeBytes("abc");
        raf.write(temp.getBytes());
        raf.seek(0);
        System.out.println(raf.readLine());

        //5. Sustituye las vocales por "*"
    }
}
