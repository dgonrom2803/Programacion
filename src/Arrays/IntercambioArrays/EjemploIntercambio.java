package Arrays.IntercambioArrays;

import java.util.Arrays;

public class EjemploIntercambio {
    public static void main(String[] args) {
        int [] a = {7, -2, 5, 8, 6};
        int [] b = {0,0,0,0,0};
        int aux;

        aux = a[a.length-1];
        b[0] = aux;
        for (int i =0; i< a.length -1; i++){
            aux = a[i];
            b[i+1]= a[i];
        }

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}
