package Tema5Prog.Conjuntos.TreeSet;

import Tema5Prog.Conjuntos.Act5_1.Persona;
import Tema5Prog.Conjuntos.ComparadorPorEdad;

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
        TreeSet<String> TreeSet2 = new TreeSet<>();
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

        TreeSet<Persona> TreeSet3 = new TreeSet<>();
        Persona antonio = new Persona("Antonio",35);
        Persona juan = new Persona("Juan",25);
        Persona paco = new Persona("Paco",18);
        TreeSet3.add(antonio);
        TreeSet3.add(juan);
        TreeSet3.add(paco);
        System.out.print("[ ");
        for(Persona g: TreeSet3)
        System.out.print(g + " ");
        System.out.println("]");


        TreeSet<Persona> TreeSet4 = new TreeSet<>(new ComparadorPorEdad());
        Persona berto = new Persona("Berto",36);
        Persona pedro = new Persona("Pedro",19);
        TreeSet4.add(berto);
        TreeSet4.add(pedro);





    }
}
