package ar.edu.unsam.poiapp.domain;

import java.io.Serializable;

/**
 * Created by Laboratorio on 15/11/2016.
 */

public class Rubro implements Serializable {
    String nombre;
    String cercania;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCercania() {
        return cercania;
    }

    public void setCercania(String cercania) {
        this.cercania = cercania;
    }
}
