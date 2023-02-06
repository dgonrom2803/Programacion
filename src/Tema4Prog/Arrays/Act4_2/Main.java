package Tema4Prog.Arrays.Act4_2;

public class Main {
    public static void main(String[] args) {
        int[][] a = new int[10][3];
        metodo(a);
    }
    static void metodo (int[][] a){
        a = new int[11][11];
        int j= 0;
        int i= 0;
        while (j <= 10){
            i = 0;
            while (i <= 10){
                a[i][j] = i * j;
                System.out.println( i + " x "+ j + " = "  + a[i][j]);
                i++;
            }j++;
            System.out.println(" ");
        }
    }
}

