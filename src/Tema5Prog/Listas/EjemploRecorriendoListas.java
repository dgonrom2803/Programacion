package Tema5Prog.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemploRecorriendoListas {
    public static void main(String[] args) {
        List<String> vocales = new ArrayList<>();
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

        //ITERATOR
        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(15);
        numbers.add(23);
        numbers.add(21);
        //Creamos un solo iterator posicionado al inicio del array
        ListIterator<Integer> it = numbers.listIterator();
        //Recorrido hacia delante y eliminacion de elementos
        while(it.hasNext()){
            Integer i = it.next();
            if (i<10){
                it.remove();
            }
        }
        System.out.println(numbers);

        //Recorrido hacia atrás y eliminacion de elementos
        while (it.hasPrevious()){
            Integer i = it.previous();
            if (i>20){
                it.remove();
            }
            if (i == 15){
                it.add(10);
            }
            System.out.println(numbers);
        }

    }
}
