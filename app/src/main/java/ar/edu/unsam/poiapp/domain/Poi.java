package ar.edu.unsam.poiapp.domain;

import java.io.Serializable;
import java.util.List;

/**
 * Created by JD on 07/11/2016.
 */

public class Poi implements Serializable {

    Long id;
    String nombre;
    String direccion;
    String tipo;
    Calificacion calificacion;
    Horario horario;
    Rubro rubro;
    List<Punto> recorrido;


    public Poi(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getCalificacion() {
        return calificacion.getPromedioCalificacion();
    }

    public String getNombreRubro() {
        return rubro.getNombre();
    }

    public String getCercaniaRubro() {
        return rubro.getCercania();
    }

    public String getRecorrido(){
        return String.valueOf(recorrido.size());
    }

    public String getHorarioInicio() {
        return horario.getInicio();
    }

    public String getHorarioFin() {
        return horario.getFin();
    }

    public String getReviews() {
        return calificacion.getReviews();
    }

    public void setCalificacion(Calificacion calificacion) {
        this.calificacion = calificacion;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        if (direccion == "") {
            return "No tiene dirección";
        }
        return direccion;
    }

    public String getServicios(){ return "No se encontraron servicios.";}

    public String getTipo() {
        return tipo;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setRubro(Rubro rubro) {
        this.rubro = rubro;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }


    public String toString() {
        return nombre;
    }
}
