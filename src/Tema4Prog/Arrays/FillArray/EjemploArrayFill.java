package Tema4Prog.Arrays.FillArray;

import java.util.Arrays;

public class EjemploArrayFill {
    public static void main(String[] args) {
        int[] a = new int [5];
        Arrays.fill(a,7);
        System.out.println(Arrays.toString(a));
        Arrays.toString(a);

        int [][] b = new int [5][5];
        Arrays.fill(b[1],7);
        System.out.println(Arrays.toString(a));
    }
}
