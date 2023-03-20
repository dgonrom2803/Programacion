package Tema5Prog.Practica5;

import java.util.LinkedList;
import java.util.List;

public class Cola {
    private List cola = new LinkedList();

    @Override
    public String toString() {
        return "Cola{" + cola + '}';
    }

    public void encolar(Object elemento){
        cola.add(elemento);
    }
}
