package Tema5Prog.Maps;

import Tema5Prog.Conjuntos.Act5_1.Persona;

import java.util.*;

public class EjemploMap {
    public static void main(String[] args) {
//        Map m = new HashMap();
//        m.put(1,"A");
//        m.put(1,100);
//        m.put(1, new Persona());

        //HashMap diccionario de las 5 primeras letras.
        HashMap<Integer, String> diccionario = new HashMap();
        diccionario.put(1,"A");
        diccionario.put(2,"B");
        diccionario.put(3,"C");
        diccionario.put(4,"D");
        diccionario.put(5,"E");

//        //Imprime posicion 3
//       System.out.println(diccionario.get(3));
//
//        //Reemplaza D por F
//        System.out.println(diccionario);
//        diccionario.replace(4, "F");
//        System.out.println(diccionario);
//
//        //Elimina elemento 4
//        System.out.println("El elemento eliminado es: " + diccionario.remove(4));
//        System.out.println(diccionario);
//
//        //Contains
//        if(!diccionario.containsValue("F")){
//            System.out.println("La letra: F no está en el map");
//        } else {
//            System.out.println("La letra: F si está en el map");
//        }
//
//        if(!diccionario.containsKey(5)){
//            System.out.println("La clave 5 no está en el map");
//        } else {
//            System.out.println("La clave 5 si está en el map");
//        }
//
//        //Iterando sobre el conjunto de valores
//
//        Iterator it = diccionario.values().iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//        //Iterando con claves
//        it = diccionario.keySet().iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//        //Borra todos los elementos
//        System.out.println(diccionario);
//        System.out.println(diccionario.isEmpty());
//        System.out.println(diccionario.size());
//        diccionario.clear();
//        System.out.println(diccionario);
//        System.out.println(diccionario.isEmpty());

//        //Añadimos clave null, letra Z
//        diccionario.put(null,"Z");
//        diccionario.put(null,null);
//        diccionario.put(null,"X");
//        diccionario.put(9,"X");
//        System.out.println(diccionario);



        //LinkedHashMap
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.putAll(diccionario);
        System.out.println(lhm.values());


        //5 --> "suficiente"
        //6 --> "Bien"
        //7 --> "Notable bajo"
        //...

        TreeMap<Integer, String> notas = new TreeMap<>();
        notas.put(0,"Suspenso");
        notas.put(1,"Suspenso");
        notas.put(2,"Suspenso");
        notas.put(3,"Suspenso");
        notas.put(4,"Suspenso");
        notas.put(5,"Suficiente");
        notas.put(6,"Bien");
        notas.put(7,"Notable bajo");
        notas.put(8,"Notable alto");
        notas.put(9,"Sobresaliente bajo");
        notas.put(10,"Sobresaliente alto");
        System.out.println(notas.values());


    }
}
