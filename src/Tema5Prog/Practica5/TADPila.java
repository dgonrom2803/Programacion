package Tema5Prog.Practica5;
import java.util.LinkedList;
import java.util.List;

public class TADPila {
    public static void main(String[] args) {
        TADPila torre = new TADPila();
        torre.apilar(6);
        torre.apilar(14);
        torre.apilar(19);
        torre.apilar(4);
        torre.apilar(33);
        System.out.println(torre);
        System.out.println(torre.longitud());

        torre.apilar(46);
        System.out.println(torre);

        torre.desapilar();
        System.out.println(torre);

        torre.cima();

        torre.limpiar();

        System.out.println(torre.esVacia());

        System.out.println(torre.longitud());

    }

    private List torre = new LinkedList();
    public void apilar (Object elemento){
        torre.add(elemento);
    }

    public void desapilar(){
        torre.remove(torre.size() - 1);
    }

    public void cima(){
        System.out.println(torre.get(torre.size() - 1));
    }

    public void limpiar(){
        torre.clear();
    }

    public boolean esVacia(){
        if (torre.isEmpty()){
            return true;
        }else return false;
    }

    public int longitud(){
        return torre.size();
    }

    @Override
    public String toString() {
        return "Pila{" +
                "torre=" + torre +
                '}';
    }
}
