package Tema8Prog.POJOS;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Cochecito")
public class Coche implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "referenciaSeq")
    private Integer referencia;
    private String marca;

    @Embedded
    private Fabricante fabricante;
    private String color;

    public Coche(){}

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
