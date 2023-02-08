package Tema5Prog.TreeSet;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio {
    public static void main(String[] args) {
        System.out.println("NUMEROS");
        Set<Integer> TreeSet = new TreeSet<>();
        TreeSet.add(23);
        TreeSet.add(13);
        TreeSet.add(4);
        System.out.println(TreeSet);
        String e;
        Iterator<Integer> it = TreeSet.iterator();
        System.out.print("[ ");
        while (it.hasNext()) {
            e = String.valueOf(it.next());
            System.out.print(e + " ");
        }
        System.out.println("]");

        System.out.println("ALUMNOS");
        Set<String> TreeSet2 = new TreeSet<>();
        TreeSet2.add("Paco");
        TreeSet2.add("Antonio");
        TreeSet2.add("Juan");
        System.out.println(TreeSet2);
        String d;
        Iterator<String> it2 = TreeSet2.iterator();
        System.out.print("[ ");
        while (it2.hasNext()) {
            d = String.valueOf(it2.next());
            System.out.print(d + " ");
        }
        System.out.println("]");
    }
}
