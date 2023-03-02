package Tema5Prog.Listas.Act5_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main extends TaskList {
    public static void main(String[] args) {

        //Creamos la lista, con las dos opciones: ArrayList o LinkedList
        TaskList<String> tareas = new LinkedList<>();
        List<String> tareas2 = new ArrayList<>();


        //Añadimos tareas mediante el método de TaskList, según el nombre que seleccionemos será de un tipo o de otro.
        addTask(tareas, "Tarea1");
        addTask(tareas, "Tarea2");
        addTask(tareas, "Tarea3");
        addTask(tareas, "Tarea4");
        //Imprimimos para ver que se han añadido correctamente
        System.out.println("LISTA TAREAS: " + tareas);

        //Borraremos la Tarea3 para ver si el método removeTask funciona
        removeTask(tareas,"Tarea3");
        System.out.println("BORRAMOS TAREA3: " + tareas);

        //Completaremos la Tarea2
        System.out.println("COMPLETAMOS TAREA2");
        completeTask(tareas,"Tarea2");


        //Devolvemos arreglo con las tareas de la lista
        System.out.println("ARRAY DE TAREAS");
        getTasks(tareas);


    }
}
