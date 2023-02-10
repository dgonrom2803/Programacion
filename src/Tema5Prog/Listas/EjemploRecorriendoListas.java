package Tema5Prog.Listas;

import java.util.ArrayList;
import java.util.List;

public class EjemploRecorriendoListas {
    public static void main(String[] args) {
        ArrayList<String> vocales = new ArrayList<>();
        vocales.add("A");
        vocales.add("E");
        vocales.add("I");
        vocales.add("O");
        vocales.add("U");
        System.out.println(vocales);

        System.out.println(vocales.get(2));
        vocales.remove(2);
        System.out.println(vocales);
        System.out.println(vocales.remove("O"));
        System.out.println(vocales);
        System.out.println(vocales.set(0, "C"));
        System.out.println(vocales);
    }
}
