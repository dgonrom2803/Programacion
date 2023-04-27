package Tema8Prog.EjPOJO;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

public class EventoMusical implements Serializable {
    private String nombre;
    private Date fecha;
    private BigInteger recaudacion;

    public EventoMusical (){}

    public EventoMusical(String nombre, Date fecha, BigInteger recaudacion) {
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

    public BigInteger getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(BigInteger recaudacion) {
        this.recaudacion = recaudacion;
    }
}
