package Tema5Prog.Conjuntos.Act5_1;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Creamos el conjunto
        TreeSet<Persona> personas = new TreeSet<>();
        //Creamos las personas
        Persona Carlos = new Persona("Carlos",23);
        Persona Alberto = new Persona("Alberto",25);
        Persona Paco = new Persona("Paco", 17);
        Persona Antonio = new Persona("Antonio",12);

        //Añadimos las personas al conjunto
        personas.add(Carlos);
        personas.add(Alberto);
        personas.add(Paco);
        personas.add(Antonio);

        //Imprimimos el conjunto
        System.out.println(personas);

    }
}
