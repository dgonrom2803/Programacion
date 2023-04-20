package Tema6Prog.Practica6.Ejercicio2;

public class TorresHanoi {
    public static void main(String[] args) {
        int n = 3;
        hanoi(n, 'A', 'C', 'B');
    }
    public static void hanoi(int n, char origen, char destino, char auxiliar) {
        if (n == 1) {
            System.out.println("Mover disco 1 desde " + origen + " hasta " + destino);
        } else {
            hanoi(n - 1, origen, auxiliar, destino);
            System.out.println("Mover disco " + n + " desde " + origen + " hasta " + destino);
            hanoi(n - 1, auxiliar, destino, origen);
        }
    }
}

