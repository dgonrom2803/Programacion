package Tema5Prog.Listas.Act5_2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class TaskList {
    private List<String> tareas;

    public TaskList(String type) {
        tareas = new ArrayList<>();
    }

    static void addTask(List list, String task){
        list.add(task);
    }

    static void removeTask(List list, String task){
        list.remove(task);
    }

    static void completeTask(List list, String task){
        System.out.println(task + ": Completado");
        removeTask(list,task);
        System.out.println(list);

    }
    static void getTasks(List list){
        Object[] arreglo = list.toArray();
        System.out.println(arreglo);
        System.out.println(Arrays.toString(arreglo));
    }
}
