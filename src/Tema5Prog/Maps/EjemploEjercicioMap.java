package Tema5Prog.Maps;

import java.util.*;

import static java.util.Collections.*;

public class EjemploEjercicioMap {
    public static void main(String[] args) {
    //ArrayList
        List<Integer> l1 = new ArrayList<>();
        l1.add(0, 2);
        l1.add(1,6);
        l1.add(2,4);
        l1.add(3,11);
        l1.add(4,5);


    //HashSet
        Set<Integer> l2 = new HashSet<>();
        l2.add(4);
        l2.add(12);
        l2.add(2);
        l2.add(7);
        l2.add(3);

        //Imprimimos las colecciones
        System.out.println("COLECCIONES");
        System.out.println(l1);
        System.out.println(l2);

        //Desordenamos las colecciones y pasamos l2 a lista
        LinkedList<Integer> ll2 = new LinkedList<>(l2);
        System.out.println("COLECCIONES DESORDENADAS");
        Collections.shuffle(l1);
        Collections.shuffle(ll2);
        System.out.println(l1);
        System.out.println(ll2);

        //Ordenamos las colecciones
        System.out.println("COLECCIONES ORDENADAS");
        sort(l1);
        sort(ll2);
        System.out.println(l1);
        System.out.println(l2);

        //Damos la vuelta a las colecciones
        System.out.println("COLECCIONES INVERSAS");
        Collections.reverse(l1);
        System.out.println(l1);
        Collections.reverse(ll2);
        System.out.println(ll2);

        //Realizamos búsqueda de un elemento
        System.out.println("BÚSQUEDA DE UN ELEMENTO");
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println(Collections.binarySearch(l1,11));
        Collections.sort(ll2);
        System.out.println(ll2);
        System.out.println(Collections.binarySearch(ll2,4));

        //Creamos un array a partir de la lista
        System.out.println("ARRAY");
        Integer[] a = (Integer[]) l1.toArray();
        Integer [] b = (Integer[]) l2.toArray();



    }
}
