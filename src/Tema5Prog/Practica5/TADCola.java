package Tema5Prog.Practica5;

import java.util.LinkedList;
import java.util.List;

public class TADCola {
    public static void main(String[] args) {
        TADCola atasco = new TADCola();
        atasco.encolar(0);
        atasco.encolar(1);
        atasco.encolar(2);
        atasco.encolar(3);
        atasco.encolar(4);
        atasco.encolar(5);
        System.out.println(atasco);

        atasco.desencolar();
        System.out.println(atasco);

        System.out.println(atasco.frente());

        atasco.limpiar();
        System.out.println(atasco);

        System.out.println(atasco.esVacia());

        System.out.println(atasco.longitud());
    }
    private List cola = new LinkedList();

    public void encolar (Object elemento){
        cola.add(elemento);
    }

    public void desencolar(){
        cola.remove(0);
    }

    public int frente(){
        return (int) cola.get(0);
    }

    public List resto(){
        List<Integer> copia = new LinkedList<>(cola);
        copia.remove(0);
        return copia;
    }

    public void limpiar(){
        cola.removeAll(cola);
    }

    public boolean esVacia(){
        if (cola.isEmpty()){
            return true;
        }else return false;
    }

    public int longitud(){
        return cola.size();
    }

    @Override
    public String toString() {
        return "Cola{" + cola + '}';
    }
}
