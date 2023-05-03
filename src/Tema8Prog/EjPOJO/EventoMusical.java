package Tema8Prog.EjPOJO;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class EventoMusical implements Serializable {
    @Id
    @GeneratedValue (strategy = GenerationType.SEQUENCE, generator = "sequencia10")
    @SequenceGenerator()
    private Integer id;
    private String nombre;
    private Date fecha;
    private BigDecimal recaudacion;

    @Transient
    private Integer control;



    private enum generoMusical  {POP, ROCK, CLASICA, ELECTRONICA, HIPHOP}


    public EventoMusical (){}

    public EventoMusical(String nombre, Date fecha, BigDecimal recaudacion) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.recaudacion = recaudacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public BigDecimal getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigDecimal recaudacion) {
        this.recaudacion = recaudacion;
    }
}
