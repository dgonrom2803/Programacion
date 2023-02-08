package Tema4Prog.Strings.Patrones;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^Pa![a-zA-Z]*");
        Matcher m = p.matcher("Pata");
        System.out.println(m.matches());


        System.out.println(Arrays.toString("Hola me llamo Diego".split(" ")));
        System.out.println("Pa".matches("^Pa"));
    }
}
