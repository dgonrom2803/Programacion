package Tema8Prog;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.sql.Date;

public class HolaMundoDB {

    private Date fecha1;

    @Temporal(TemporalType.DATE)
    private java.util.Date fecha2;

    enum TipoFruta {PERA, MANZANA}

    @Enumerated(EnumType.ORDINAL)
    private TipoFruta tipoFruta;


}
