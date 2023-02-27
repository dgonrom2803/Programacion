package Tema5Prog.Listas.Act5_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main extends TaskList {
    public static void main(String[] args) {

        //Creamos la lista, con las dos opciones: ArrayList o LinkedList
        List<String> tareas1 = new LinkedList<>();
        List<String> tareas2 = new ArrayList<>();

        //Añadimos tareas mediante el método de TaskList, según el nombre que seleccionemos será de un tipo o de otro.
        addTask(tareas1, "Tarea1");
        addTask(tareas1, "Tarea2");
        addTask(tareas1, "Tarea3");
        addTask(tareas1, "Tarea4");
        //Imprimimos para ver que se han añadido correctamente
        System.out.println("LISTA TAREAS: " + tareas1);

        //Borraremos la Tarea3 para ver si el método removeTask funciona
        removeTask(tareas1,"Tarea3");
        System.out.println("BORRAMOS TAREA3: " + tareas1);

        //Completaremos la Tarea2
        System.out.println("COMPLETAMOS TAREA2");
        completeTask(tareas1,"Tarea2");


        //Devolvemos arreglo con las tareas de la lista
        System.out.println("ARRAY DE TAREAS");
        getTasks(tareas1);


    }
}
