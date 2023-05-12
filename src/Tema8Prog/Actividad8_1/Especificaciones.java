package Tema8Prog.Actividad8_1;

import javax.persistence.Embeddable;
import java.util.Date;
@Embeddable
public class Especificaciones {

    private Integer memoria;
    private Integer discoduro;
    private String cpu;
    private Date fechaCompra;

    public Integer getMemoria() {
        return memoria;
    }

    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public Integer getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(Integer discoduro) {
        this.discoduro = discoduro;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
