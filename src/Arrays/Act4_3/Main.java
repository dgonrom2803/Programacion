package Arrays.Act4_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //1-Crea un array con 10 números aleatorios
        int[] a = {6, 4, 2, 7, 15, 12, 14, 33, 43, 23};
        //2-Imprime el array anterior empezando por la última posición
        System.out.println(Arrays.toString(a));
        //3-Ordena el array utilizando la clase de utilidades Arrays
        Arrays.sort(a);
        Arrays.toString(a);
        System.out.println(Arrays.toString(a));

        //4-Busca un número recibido como parámetro dentro del array. Por dos métodos diferentes:
        System.out.println("La búsqueda manual es: " + buscar(a,7));
        System.out.println("La búsqueda binarySearch: " + Arrays.binarySearch(a,7));

        //5-Compara dos arrays recibidos por parámetros devolviendo si son iguales o no.
        int [] b = {1, 2, 3};
        int [] c = {1, 2, 3};
        System.out.println(b==c);
        System.out.println(Arrays.equals(b,c));
        c = b;
        c[0] = 0;
        b[0] = 1;
    }

    private static int buscar(int[] a, int x) {
        for (int i = 0; i< a.length; i++) {
            if (x == a[i]){
                return i;
            }
        }
        return -1;
    }

}
