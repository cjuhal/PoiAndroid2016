package ar.edu.unsam.poiapp.domain;

import java.io.Serializable;

/**
 * Created by Cristian on 15/11/2016.
 */

public class Review implements Serializable{

    public String comentario;
    public String nombreDeUsuario;
    public String puntuacion;

    public String getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(String puntuacion) {
        this.puntuacion = puntuacion;
    }


    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getNombreDeUsuario() {
        return nombreDeUsuario;
    }

    public void setNombreDeUsuario(String nombreDeUsuario) {
        this.nombreDeUsuario = nombreDeUsuario;
    }
}
