package ExamenTema4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Ejercicio 1
        String[] nombresProfesores = new String[5];
        nombresProfesores[0] = "Fran";
        nombresProfesores[1] = "Juan";
        nombresProfesores[2] = "Juan";
        nombresProfesores[3] = "Ana";
        nombresProfesores[4] = "Martin";

        imprimeArray(nombresProfesores);
        imprimeArrayAbajo(nombresProfesores);
        busquedaArray(nombresProfesores,"Luis");
        ordenInverso(nombresProfesores);
        comparaArrays(nombresProfesores);
        String [] nombresProfesores2 = introduceNombre(nombresProfesores, "Ramón", 3);
        System.out.println(Arrays.toString(nombresProfesores2));

        imprimeTabla();



    }
    //Ejercicio 2
    public static void imprimeArray(String[] a){
        System.out.println(Arrays.toString(a));
    }
    //Ejercicio 3
    public static void imprimeArrayAbajo(String[] a){
        System.out.println("Profesores de 1º DAW:");
        for (int i = 0; i < a.length; i++) {
            System.out.println("- " + a[i]);
        }
    }
    //Ejercicio 4
    private static boolean busquedaArray (String[] a, String b) {
        for (int i = 0; i< a.length; i++) {
            if (b == a[i]){
                System.out.println("True");
                return true;
            }
        }
        System.out.println("False");
        return false;
    }

    //Ejercicio 5

    private static void ordenInverso (String[]a){
        Arrays.sort(a);
        String [] b = a.clone();
        b[4]= a[0];
        b[3]= a[1];
        b[2]= a[2];
        b[1]= a[3];
        b[0]= a[4];
        System.out.println(Arrays.toString(b));
    }

    //Ejercicio 6
    public static boolean comparaArrays (String [] a){
        ordenInverso(a);
       String [] copiaNombresProfesores = a.clone();
        for (int i = 0; i < copiaNombresProfesores.length; i++) {
            boolean b = a == copiaNombresProfesores;
            System.out.println("Iguales");
            return true;

        }
        System.out.println("Distintos");
        return false;
    }

    //Ejercicio 7
    public static String[] introduceNombre (String[] a, String b, int pos){
        String[] out = new String [a.length +1];

        for (int i=0; i<=pos;i++){
            out[i] = a[i];
            out[i + 1] = a[i + 1];

        }
        out[pos] = b;
        out[pos + 1] = a[pos];
        out[pos + 2] = a[pos + 1 ];

        return out;
    }

    //Ejercicio 10
    public static void imprimeTabla(){
        String[][] strings = new String[5][5];
        strings[0][0] = "Fran";
        strings[0][1] = "Juan";
        strings[0][2] = "Juan";
        strings[0][3] = "Ana";
        strings[0][4] = "Martin";
        strings[1][0] = "Fran";
        strings[1][1] = "Juan";
        strings[1][2] = "Juan";
        strings[1][3] = "Javi";
        strings[1][4] = "Angela";
        System.out.println(Arrays.toString(strings));
    }
}





