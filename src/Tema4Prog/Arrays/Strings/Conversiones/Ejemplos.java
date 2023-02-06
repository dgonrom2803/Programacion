package Tema4Prog.Arrays.Strings.Conversiones;

public class Ejemplos {
    public static void main(String[] args) {

        int n = Integer.parseInt("1");
        System.out.println(n+1);
        boolean b = Boolean.parseBoolean("true");
        System.out.println(b);
        Long.parseLong("234234234");
        Double.parseDouble("1.1");
        Float.parseFloat("");

        Integer integer = Integer.valueOf("1");
        integer = Integer.valueOf(11);
        Double ddd = Double.valueOf("1.22222");
        String s = 1 + "";
        s = String.valueOf(1);
        System.out.println(s);
        integer.toString();
    }
}
