package Tema4Prog.Practica4.Ejercicio6;

public class Empleado {
    String codigoEmpleado;
    String nombre;
    String DNI;
    String primerApellido;
    String segundoApellido;
    Integer annoNacimiento;
    Boolean reduccionJornada;
    String departamento;

    Empleado(){}

    Empleado(String codigoEmpleado, String nombre, String DNI, String primerApellido, String segundoApellido, Integer annoNacimiento, Boolean reduccionJornada, String departamento){
        this.codigoEmpleado = codigoEmpleado;
        this.nombre = nombre;
        this.DNI = DNI;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.annoNacimiento = annoNacimiento;
        this.reduccionJornada = reduccionJornada;
        this.departamento = departamento;
    }
    @Override
    public String toString() {
        return "Empleado{" +
                "Codigo del empleado = " + codigoEmpleado +
                ", DNI = " + DNI +
                ", nombre = " + nombre +
                ", Primer Apellido = " + primerApellido +
                ", Segundo Apellido = " + segundoApellido +
                ", Año de Nacimiento = " + annoNacimiento +
                ", Reducción de jornada = " + reduccionJornada +
                ", Departamento = " + departamento +
                '}';
    }
}
