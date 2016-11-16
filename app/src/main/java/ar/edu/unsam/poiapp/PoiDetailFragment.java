package ar.edu.unsam.poiapp;

import android.app.Activity;
import android.support.design.widget.CollapsingToolbarLayout;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import ar.edu.unsam.poiapp.adapter.TipoAdapter;
import ar.edu.unsam.poiapp.domain.Poi;


/**
 * A fragment representing a single Poi detail screen.
 * This fragment is either contained in a {@link PoiListActivity}
 * in two-pane mode (on tablets) or a {@link PoiDetailActivity}
 * on handsets.
 */
public class PoiDetailFragment extends Fragment {

    public static final String ARG_ITEM_ID = "item_id";

    private Poi poi;
    private View rootView;

    public PoiDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (getArguments().containsKey(ARG_ITEM_ID)) {

            poi = (Poi) getArguments().get(ARG_ITEM_ID);

            Activity activity = this.getActivity();
            CollapsingToolbarLayout appBarLayout = (CollapsingToolbarLayout) activity.findViewById(R.id.toolbar_layout);
            if (appBarLayout != null) {
                appBarLayout.setTitle(poi.getNombre());
            } else {
                activity.setTitle(poi.getNombre());
            }
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        TipoAdapter tipoAdapter = new TipoAdapter();

        this.rootView = inflater.inflate(tipoAdapter.getLayoutTipo(poi), container, false);

        /** Contenido que comparten todos los pois **/
        ImageView imgPoi = (ImageView) rootView.findViewById(R.id.imgPoi);
        imgPoi.setImageResource(tipoAdapter.getImgTipo(poi));
        ((TextView) rootView.findViewById(R.id.titulo)).setText("INFORMACIÓN:");
        ((TextView) rootView.findViewById(R.id.tipo)).setText("Tipo: " + poi.getTipo() + "\n");
        ((TextView) rootView.findViewById(R.id.direccion)).setText("Dirección: \n" + poi.getDireccion() + "\n");
        ((TextView) rootView.findViewById(R.id.calificacionGeneral)).setText("Calificación General: " + poi.getCalificacion());
        ((TextView) rootView.findViewById(R.id.calificacion)).setText("Reviews: \n" + poi.getReviews());

        /** Información particular del tipo de poi**/
        tipoAdapter.getTipoView(rootView, poi);

        return rootView;
    }

}

