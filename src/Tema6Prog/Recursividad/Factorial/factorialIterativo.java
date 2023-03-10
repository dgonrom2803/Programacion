package Tema6Prog.Recursividad.Factorial;

public class factorialIterativo {
    public static void main(String[] args) {
    factorial(6);
    }

    private static void factorial(int n){
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado = resultado * i;

        }

        System.out.println(resultado);
    }
}
