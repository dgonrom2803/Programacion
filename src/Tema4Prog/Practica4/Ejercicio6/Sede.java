package Tema4Prog.Practica4.Ejercicio6;

public class Sede {
    String localizacion;
    String departamento1;
    String departamento2;
    String departamento3;

    Sede(){}
    Sede(String localizacion, String departamento1, String departamento2, String departamento3){
        this.localizacion = localizacion;
        this.departamento1 = departamento1;
        this.departamento2 = departamento2;
        this.departamento3 = departamento3;
    }
    @Override
    public String toString() {
        return "Sede{" +
                "Localización = " + localizacion +
                ", Departamento 1 = " + departamento1 +
                ", Departamento 2 = " + departamento2 +
                ", Departamento 3 = " + departamento3 +
                '}';
    }
}
