package Tema5Prog.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class EjemploArrayList {
    public static void main(String[] args) {
        //Crear ArrayList y añadir elementos
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add(null);
        System.out.println(cars);

        //Acceder a un elemento por su indice
        System.out.println(cars.get(0));

        //Cambiar BMW por Renault
        cars.set(1,"Renault");
        System.out.println(cars);

        //Eliminar Mazda
        cars.remove(3);
        System.out.println(cars);

        //Meter Opel entre Renault y Ford
        cars.add(2,"Opel");
        System.out.println(cars);

        //Vaciamos la lista y comprobamos que el tamaño es 0
        cars.removeAll(cars);
        System.out.println(cars);
        System.out.println(cars.isEmpty());
        System.out.println(cars.size());

        //Creamos un conjunto Mitsubishi y Toyota y lo añadimos a la lista
        List<String> cars2 = new ArrayList<>();
        cars2.add("Mitsubishi");
        cars2.add("Toyota");
        cars.addAll(cars2);
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        ListIterator it = cars.listIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        while (it.hasPrevious()){
            System.out.println(it.previous());
        }

    }
}
