package Tema5Prog.Conjuntos;

import Tema4Prog.Arrays.Act4_4.Persona;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();
        System.out.println(conjunto.isEmpty());
        String s1 = "s1";
        conjunto.add(s1);
        System.out.println(conjunto.isEmpty());

        conjunto.add("s2");
        conjunto.add("s3");
        conjunto.add("s4");
        conjunto.add("s5");

        System.out.println(conjunto);

        conjunto.add(null);

        System.out.println(conjunto);
        String e;
        Iterator<String> it = conjunto.iterator();
        while (it.hasNext()){
            e = it.next();
            System.out.print(e + " ");
        }

        conjunto.remove(s1);
        System.out.println(conjunto);


        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("s2");
        conjunto2.add("s3");
        conjunto2.add("s4");
        conjunto.removeAll(conjunto2);
        System.out.println(conjunto2);
        System.out.println(conjunto);
    }
}
