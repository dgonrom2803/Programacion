package Tema6Prog.Excepciones;



public class Captura {
    public static void main(String[] args) {
        System.out.println("COMIENZO PROGRAMA DIVISIÓN");
        try{
            int dividendo = 5;
            int divisor = 0;
            System.out.println("Resultado :" + dividir(dividendo, divisor));
        } catch (ArithmeticException ex){
            System.out.println("Imposible dividir por 0");
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }finally{
            System.out.println("FIN PROGRAMA DIVISIÓN");
        }
    }

    public static int dividir (int a, int b){
        int resultado;
        resultado = a/b;
        return resultado;
    }

}
