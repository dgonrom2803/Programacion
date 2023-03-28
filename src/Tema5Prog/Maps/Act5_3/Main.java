package Tema5Prog.Maps.Act5_3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Integer[] numeros = { 23,5,12,32,14,33,14,14};
        cuentaNumeros(numeros);
    }

    public static void cuentaNumeros (Integer[] numeros){
        Map<Integer, Integer> contador = new TreeMap<>();
        for (Integer clave:numeros) {
            if (contador.containsKey(clave)){
                contador.put(clave,contador.get(clave) + 1);
            }else contador.put(clave, 1);

        }
        Iterator<Integer> it = contador.keySet().iterator();
        while(it.hasNext()){
            Integer key = it.next();
            System.out.print(key);
            System.out.print(" = ");
            System.out.print(contador.get(key));
            System.out.println("");
        }
    }
}