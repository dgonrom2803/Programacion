package Tema5Prog.Conjuntos.Act5_1;

import java.util.Objects;

public class Persona implements Comparable <Persona>{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {

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
        return "{ " + nombre +" "+ edad + " }";
    }
    @Override
    public int compareTo(Persona other) {
        Persona otherPersona = (Persona) other;
        return this.nombre.compareToIgnoreCase(otherPersona.nombre);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }

}
