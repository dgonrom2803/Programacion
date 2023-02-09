package Tema5Prog.Conjuntos.TreeSet;

import java.util.Objects;

public class Persona implements Comparable{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        return "Persona ordenada{" + nombre + edad + "}";
    }
    @Override
    public int compareTo(Object other) {
        Persona otherPersona = (Persona) other;
        //return this.nombre.compareTo(otherPersona.nombre);
        if (this.edad == otherPersona.edad){
            return 0;
        }
        if(this.edad > otherPersona.edad){
            return 1;
        }
        else
            return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }
}
