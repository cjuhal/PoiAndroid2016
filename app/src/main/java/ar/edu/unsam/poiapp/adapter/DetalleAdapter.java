package ar.edu.unsam.poiapp.adapter;

import android.view.View;

import ar.edu.unsam.poiapp.domain.Poi;

/**
 * Created by Cristian on 15/11/2016.
 */
abstract class DetalleAdapter {

    abstract View getView(View rootView, Poi poi);

}