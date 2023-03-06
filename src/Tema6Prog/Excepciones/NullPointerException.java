package Tema6Prog.Excepciones;

public class NullPointerException {
    public static void main(String[] args) {
        Integer a = null;
        a.equals("null");
    }

    private static void ejemplo (){
        String s = null;
        s.equals("null");
    }
}
