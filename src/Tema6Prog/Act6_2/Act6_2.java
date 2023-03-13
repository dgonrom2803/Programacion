package Tema6Prog.Act6_2;

public class Act6_2 {
    public static void main(String[] args) {
        cuentaAtras(5);
    }
    private static void cuentaAtras (int i){
        if(i > 0) {
            System.out.println(i);
            cuentaAtras(i-1);
        }else {
            System.out.println("¡Fin");
        }
    }

    private static void sumaN (int i){

    }

    private static void fibonacci (int i){

    }

    private static void maxComDiv (int i) {

    }
}
