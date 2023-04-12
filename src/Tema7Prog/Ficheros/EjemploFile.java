package Tema7Prog.Ficheros;

import Tema7Prog.ClasesdeFlujo.FileInputStream;

import java.io.*;

public class EjemploFile {
    public static void main(String[] args) {
        File miCarpeta = new File("C:\\Users\\1DAW_2223_12\\Downloads\\Nueva carpeta");
        miCarpeta.mkdir();

        //Crear un fichero
        File miFichero = new File("C:\\Users\\1DAW_2223_12\\Downloads\\Nueva carpeta\\Test.txt");
        try {
            miFichero.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //Elimina un fichero
        //miFichero.delete();
        //Elimina una carpeta tras borrar su contenido
        //miCarpeta.delete();

        //Abrir fichero en modo texto
        try {
            FileWriter fw = new FileWriter(miFichero, true);
            fw.write("Diego");
            fw.close();
            //TODO: Abrir fichero en modo binario, escrituta y añadiendo al final
            FileOutputStream fos = new FileOutputStream(miFichero,true);
            fos.write("González".getBytes());
            fos.close();

            //TODO: Abrir fichero en modo texto, lectura
            FileReader fr = new FileReader(miFichero);
            int i;
            while((i=fr.read()) != -1){
                System.out.println((char) i);
            }

            //TODO: Abrir fichero en modo binario, lectura
            FileInputStream fis = new FileInputStream(miFichero);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
