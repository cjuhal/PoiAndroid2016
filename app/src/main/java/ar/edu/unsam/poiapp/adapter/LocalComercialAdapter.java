package ar.edu.unsam.poiapp.adapter;

import android.view.View;
import android.widget.TextView;

import ar.edu.unsam.poiapp.R;
import ar.edu.unsam.poiapp.domain.Poi;

/**
 * Created by Cristian on 15/11/2016.
 */

public class LocalComercialAdapter extends DetalleAdapter {
    public View getView(View rootView, Poi poi) {

        ((TextView) rootView.findViewById(R.id.rubroNombre)).setText("Rubro: \n" + poi.getNombreRubro() + "\n");
        ((TextView) rootView.findViewById(R.id.rubroCercania)).setText("Distancia del local: \n" + poi.getCercaniaRubro() + "km \n");
        ((TextView) rootView.findViewById(R.id.horario)).setText("Horario: \nApertura: " + poi.getHorarioInicio() + "\nClausura:" + poi.getHorarioFin() + "\n");


        return rootView;
    }
}
