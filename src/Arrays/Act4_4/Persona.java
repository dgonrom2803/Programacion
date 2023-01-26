package Arrays.Act4_4;

public class Persona {
    public String nombre;
    public int edad;

    public Persona(){

    }

    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String toString (){
        String resultado = nombre + ", " + edad + " años";
        return resultado;
    }
}
