package Tema4Prog.Arrays.OrdenacionArray;

import java.util.Arrays;

public class OrdenacionArray {
    public static void main(String[] args) {
        int [] a = {10, 3, 7, 1, 5, 8};
        Arrays.sort(a);
        Arrays.toString(a);
        System.out.println(Arrays.toString(a));
        System.out.println("La búsqueda manual es: " + buscar(a,7));
        System.out.println("La búsqueda binarySearch: " + Arrays.binarySearch(a,7));
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
