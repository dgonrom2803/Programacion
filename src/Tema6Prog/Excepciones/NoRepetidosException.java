package Tema6Prog.Excepciones;

import java.io.IOError;
import java.util.ArrayList;
import java.util.List;

public class NoRepetidosException extends Throwable {
    public NoRepetidosException(String s) {
    }

    public static void main(String[] args) throws NoRepetidosException {
        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);

        Integer nuevoNumero = 6;
        addNumero(lista, nuevoNumero);
    }
    static void addNumero(List <Integer> lista, Integer nuevoNumero) throws NoRepetidosException {
        if (lista.contains(nuevoNumero)) {
            throw new NoRepetidosException("La lista ya contiene el número");
        } else {
            lista.add(nuevoNumero);
            System.out.println("Nuevo número añadido");
        }
    }
}
