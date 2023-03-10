package Tema6Prog.Recursividad;

public class Iterativo {
    public static void main(String[] args) {
        cuentaAtras(10);
    }

    private static void cuentaAtras(int i){
        while(i > 0) {
            System.out.println(i);
            i = i - 1;
        }
        System.out.println("¡Fin!");
    }
}
