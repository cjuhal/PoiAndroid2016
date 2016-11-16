package ar.edu.unsam.poiapp.domain;

import java.io.Serializable;

/**
 * Created by Laboratorio on 15/11/2016.
 */

public class Punto implements Serializable {

    String x;
    String y;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }
}
