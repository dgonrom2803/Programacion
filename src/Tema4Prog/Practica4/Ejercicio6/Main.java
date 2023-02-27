package Tema4Prog.Practica4.Ejercicio6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sede s1 = new Sede("Madrid", "Ventas", "RR.HH.", "Producción");
        Sede s2 = new Sede("Barcelona", "Ventas", "RR.HH.", "Producción");
        Sede s3 = new Sede("Valencia", "Ventas", "RR.HH.", "Producción");
        Sede s4 = new Sede("Oviedo", "Ventas", "RR.HH.", "Producción");

        Empleado e1 = new Empleado("DGR123456","Diego","43907654S","González","Romero",2001,false,"Producción");
        Empleado e2 = new Empleado("COO123456","Carlos","53107352L","Ortuño","Oliva",2001,false,"Ventas");
        Empleado e3 = new Empleado("MPM123456","María","20507648D","Pérez","Mateos",2001,false,"RR.HH");


        Sede [] sedes ={s1,s2,s3,s4};
        System.out.println(Arrays.toString(sedes));
        Empleado[] empleados = {e1,e2,e3};
        System.out.println(Arrays.toString(empleados));


    }


}
