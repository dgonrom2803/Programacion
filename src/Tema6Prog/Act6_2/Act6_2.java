package Tema6Prog.Act6_2;

public class Act6_2 {
    public static void main(String[] args) {
        cuentaAtras(5);
        System.out.println("La suma de números naturales da: " + sumaN(5));
        System.out.println(fibonacci(6));
        System.out.println("El máximo común divisor de a y b es: " + maxComDiv(6,4));
    }
    private static void cuentaAtras (int i){
        if(i > 0) {
            System.out.println(i);
            cuentaAtras(i-1);
        }else {
            System.out.println("¡Fin");
        }
    }

    private static int sumaN (int i){
        if (i == 1) {
            return 1;
        } else {
            return i + sumaN(i-1);
        }

    }

    private static int fibonacci (int i){
        if (i == 0) {
            return 0;
        } else if (i == 1) {
            return 1;
        } else {
            return fibonacci(i-2) + fibonacci(i-1);
        }
    }

    private static int maxComDiv (int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
}
