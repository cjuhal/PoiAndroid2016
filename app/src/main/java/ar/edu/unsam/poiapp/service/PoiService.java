package ar.edu.unsam.poiapp.service;

import java.util.List;

import ar.edu.unsam.poiapp.domain.Detalle;
import ar.edu.unsam.poiapp.domain.Poi;
import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by JD on 13/11/2016.
 */

public interface PoiService {

    @GET("/buscador")
    Call<List<Poi>> getPois();

    @GET("/detallesPoi/ID=:{id}")
    public Call<List<Detalle>> getDetalle(@Path("id") String id);


}

