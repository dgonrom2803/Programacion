package Tema6Prog.Recursividad.Factorial;

public class factorialRecursivo {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
    private static int factorial(int n) {

        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }
}
