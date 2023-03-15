package Tema6Prog.Act6_2;

public class Act6_2 {
    public static void main(String[] args) {
        cuentaAtras(5);
        System.out.println(sumaN(5));
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

    private static void fibonacci (int i){

    }

    private static void maxComDiv (int i) {

    }
}
