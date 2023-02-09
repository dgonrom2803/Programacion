package Tema5Prog.Conjuntos.LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ejercicio {
    public static void main(String[] args) {
        System.out.println("LINKEDHASHSET");
        Set<String> strings = new LinkedHashSet<>();
        strings.add("Julian");
        strings.add("David");
        strings.add("Pablo");
        strings.add("Victor");
        System.out.println(strings);

        strings.add("Pablo");
        strings.add(null);
        System.out.println(strings);

        System.out.println("HASHSET");
        Set<String> strings2 = new HashSet<>();
        strings2.add("Julian");
        strings2.add("David");
        strings2.add("Pablo");
        strings2.add("Victor");
        System.out.println(strings2);

        strings2.add("Pablo");
        strings2.add(null);
        System.out.println(strings2);
    }
}
