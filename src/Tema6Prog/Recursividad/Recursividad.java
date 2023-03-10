package Tema6Prog.Recursividad;

public class Recursividad {
    public static void main(String[] args) {
        cuentaAtras(10);
    }
    private static void cuentaAtras (int i){
        if(i > 0) {
            System.out.println(i);
            cuentaAtras(i-1);
        }else {
            System.out.println("¡Fin");
        }
    }

}
