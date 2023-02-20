package Tema5Prog.Conjuntos;

import Tema5Prog.Conjuntos.TreeSet.Persona;

import java.util.Comparator;

public class ComparadorPorEdad implements Comparator<Persona> {

    public int compare(Persona o1, Persona o2) {
        return o1.compareTo(o2);
    }
}
