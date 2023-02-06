package Tema4Prog.Arrays.CompararArrays;

import java.util.Arrays;

public class Ejemplos {
    public static void main(String[] args) {
        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3};
        System.out.println(a==b);
        System.out.println(Arrays.equals(a,b));
        b = a;
        b[0] = 0;
        a[0] = 1;


    }
}
