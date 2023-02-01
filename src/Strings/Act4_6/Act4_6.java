package Strings.Act4_6;

import java.util.Arrays;

public class Act4_6 {
    public static void main(String[] args) {
        //Declaraciones
        String s = "Hola";
        char [] chars = {'H','o','l','a'};
        String s1 = new String(chars);
        String s2 = new String("Hola");
        String s3 = s1 + " Diego";

        //Resultados
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        imprimeLongitudCadena("Hola Diego");
        buscaCaracter("hola",3);
        System.out.println("El caracter seleccionado aparece " +cuentaOcurrenciasDeUnCaracter(s,'l') + " veces");


    }
    //Métodos
    public static void imprimeLongitudCadena(String s){
        System.out.println("La longitud de la cadena es: " + s.length());
    }
    //Busca caracter en posicion empezando en 1
    public static void buscaCaracter (String s, int i){
        if (i <= s.length() && i>=0) {
            System.out.println("El caracter en la posición " + i + " es: " + s.charAt(i - 1));
        } else {
            System.out.println("No se encuentra la posición");
        }
    }

    // Cuenta ocurrencias de un caracter
    // (ejemplo: m("Frana",'a')-->2
    public static int cuentaOcurrenciasDeUnCaracter (String s, char b){
        int cont = 0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i)==b){
                cont++;
            }
        }
        return cont;
    }

    // Imprime cadenas en orden alfabetico, sin tener en cuenta minus|mayus
    // m({"Corto", "Bajo", "alto"})--> alto bajo corto
    public static void imprimeCadenasEnOrdenAlfabetico (String [] cadenaArray){
        Arrays.sort(cadenaArray);
        for (int i = 0; i < cadenaArray.length; i++) {
            System.out.println(cadenaArray[i] + " ");
        }
    }



    // Un método que dado un pequeño texto devuelva un array de cadenas codificando el texto, de modo que
    // cada vez que aparezca el carácter punto (.) se corte esa frase y se meta en una posicion del array
    // y que todas las vocales se sustituyan por el número graficamente más parecido
    // (ejemplo: o -->0; i-->1; A-->4...)
}
