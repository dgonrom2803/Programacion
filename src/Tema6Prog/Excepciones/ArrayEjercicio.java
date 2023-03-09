package Tema6Prog.Excepciones;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class ArrayEjercicio {

    //Meter un número en una lista
        public static void main(String[] args) {
                List<Integer> lista = new ArrayList<>();
                lista.add(1);
                lista.add(2);
                lista.add(3);
                lista.add(4);
                lista.add(5);
                lista.add(6);
                lista.add(7);

                Integer nuevoNumero = 6;
                try {
                    añadirNumero(lista, nuevoNumero);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
            static void añadirNumero(List <Integer> lista, Integer nuevoNumero) throws IOException {
                if (lista.contains(nuevoNumero)) {
                    throw new IOException("La lista ya contiene el número");
                } else {
                    lista.add(nuevoNumero);
                    System.out.println("Nuevo número añadido");
                }
            }
        }
