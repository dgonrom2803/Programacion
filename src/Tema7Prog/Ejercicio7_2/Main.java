package Tema7Prog.Ejercicio7_2;
import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException{
        //1. Crea un fichero llamado alumnos.txt dentro de una nueva carpeta con nombre 1DAW, controlando que si ya existe
        // no haga nada. La carpeta debe estar en la raíz de tu usuario.
        File archivo = new File("C:\\Users\\1DAW_2223_12\\alumnos.txt");

        //2. Introduce los nombres de los alumnos de la clase, un alumno por línea del fichero. Utiliza un buffer para
        // realizar esta operación
        FileWriter escritura = new FileWriter(archivo);
        BufferedWriter buffer = new BufferedWriter(escritura);
        buffer.write("Juan Manuel Herrera \n");
        buffer.write("Juan María \n");
        buffer.write("Adrián \n");
        buffer.write("Víctor \n");
        buffer.write("Antonio \n");
        buffer.write("Daniel \n");
        buffer.write("Diego \n");
        buffer.write("David \n");
        buffer.write("Jorge \n");
        buffer.write("Julián \n");
        buffer.write("Johnnatan \n");
        buffer.write("Jossie \n");
        buffer.write("Juan Manuel Saborido \n");
        buffer.write("Pablo \n");
        buffer.write("Ricardo \n");
        buffer.close();

        //3. Copia (lee y escribe) el contenido del anterior fichero a uno nuevo con nombre prog.txt

        //4. Renombra el fichero a prog_codificado.txt
        File archivoRenombrado = new File("C:\\Users\\1DAW_2223_12\\prog_codificado.txt");
        archivo.renameTo(archivoRenombrado);

        //5. En este último fichero, añade al final un alumno nuevo

        //6. Sustituye el segundo y tercer carácter del nombre de cada alumno por una X


    }
}
