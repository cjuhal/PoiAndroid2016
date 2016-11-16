package ar.edu.unsam.poiapp.domain;

import java.io.Serializable;

/**
 * Created by CJuhal on 15/11/2016.
 */

public class Horario implements Serializable {
    String inicio;
    String fin;

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }
}
