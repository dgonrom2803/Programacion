package Tema8Prog.EjPOJO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Artista implements Serializable {
    private String nombreArtistico;
    private static Boolean confirmacion;

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public static Boolean getConfirmacion() {
        return confirmacion;
    }

    public static void setConfirmacion(Boolean confirmacion) {
        Artista.confirmacion = confirmacion;
    }

    public Artista(){}
    public Artista(String nombreArtistico, Boolean confirmacion){}

    public static void listaArtistas (List artistas, Artista a ){
        List<Artista> Artistas = new ArrayList<>();

        if (confirmacion == true) {
            Artistas.add(a);
        }
    }


}
