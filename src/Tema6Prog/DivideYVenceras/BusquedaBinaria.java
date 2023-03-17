package Tema6Prog.DivideYVenceras;

import java.util.Arrays;

public class BusquedaBinaria {
    public static void main(String[] args) {
        int[] a = {-2, -1, 3, 5, 8, 10};
        int num = 3;
        int pos = dyv(a,num);
        System.out.println("El número " + num + " está en la posición: " + pos);
    }

    private static int dyv(int[] a, int num) {
        int medio = a.length/2;
        if (a[medio] == num){
            return medio;
        }else if (num < a[medio]){
           return dyv(Arrays.copyOfRange(a,0,medio),num);
        }
        return dyv(Arrays.copyOfRange(a, medio, a.length), num);
    }
}
