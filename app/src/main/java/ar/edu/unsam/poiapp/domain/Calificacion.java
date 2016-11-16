package ar.edu.unsam.poiapp.domain;


import java.io.Serializable;
import java.util.List;

/**
 * Created by Cristian on 15/11/2016.
 */

public class Calificacion implements Serializable {
    public String promedioCalificacion;
    public List<Review> listaReview;

    public String getPromedioCalificacion() {
        return promedioCalificacion;
    }

    public void setPromedioCalificacion(String promedioCalificacion) {
        this.promedioCalificacion = promedioCalificacion;
    }

    public String getReviews() {
        String mensajes="";
        if(listaReview.size()==0) {
            mensajes = "No hay reviews por el momento.";
        }
        for (Review item : listaReview) {
            mensajes += "\n Usuario: " + item.getNombreDeUsuario() + "\n Comentario: " + item.getComentario() + "\n Puntuacion: " + item.getPuntuacion() + "\n";
        }
        return mensajes;
    }
}