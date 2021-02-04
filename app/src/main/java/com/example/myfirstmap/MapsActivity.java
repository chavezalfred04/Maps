package com.example.myfirstmap;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    //private MarkerOptions place1, place2;
    //private Polyline currentPolyline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        //place1 = new MarkerOptions().position(new LatLng(15.98093, 120.56054)).title("Location 1- Urdaneta City University");
        //place2 = new MarkerOptions().position(new LatLng(15.972756, 120.580820)).title("Location 2- Home");
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        //Log.d("mylog", "Added Markers");
        mMap.addMarker(new MarkerOptions().position(new LatLng(15.98093, 120.56054)).title("Urdaneta City University"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(15.972756, 120.580820)).title("Location 1- Mary Kane's House"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(15.965313, 120.535391)).title("Location 2- Abygail's House"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(15.992174, 120.537569)).title("Location 3- Ma Crister's House"));

        mMap.addMarker(new MarkerOptions().position(new LatLng(15.974769357394289, 120.58108803535114)).title("Mary Kane's Secondary School"));
        mMap.addMarker(new MarkerOptions().position(new LatLng(15.9787, 120.5632)).title("Abygail & Ma Crister's Secondary School"));

        mMap.addPolyline(new
                PolylineOptions()
                .add(new LatLng(15.98093, 120.56054),
                        new LatLng(15.981763, 120.560160),
                        new LatLng(15.980625, 120.562338),
                        new LatLng(15.979635, 120.564132),
                        new LatLng(15.978897, 120.565603),
                        //new LatLng(15.979510, 120.566824),
                        new LatLng(15.979238, 120.571011),
                        new LatLng(15.975822, 120.570708),
                        new LatLng(15.975786, 120.573559),
                        new LatLng(15.976405, 120.578736),
                        new LatLng(15.976631, 120.582126),
                        new LatLng(15.976059, 120.582156),
                        new LatLng(15.975427, 120.582035),
                        new LatLng(15.975224, 120.581086),
                        new LatLng(15.975149, 120.580412),
                        new LatLng(15.974257, 120.580536),
                        new LatLng(15.974076, 120.580697),
                        new LatLng(15.972727, 120.580627),
                        new LatLng(15.972756, 120.580820))
                        //new LatLng()
                .width(15)
                .color(Color.RED));

        mMap.addPolyline(new
                PolylineOptions()
                .add(new LatLng(15.965313, 120.535391),
                        new LatLng(15.968376922568615, 120.53464316235782),
                        new LatLng(15.968655423313342, 120.53325914258683),
                        new LatLng(15.971729220614383, 120.53438567030742),
                        new LatLng(15.974534793124324, 120.53524397718593),
                        new LatLng(15.975927250139556, 120.53613447052695),
                        new LatLng(15.979444450319408, 120.53753994810455),
                        new LatLng(15.974988632070845, 120.54584406772123),
                        new LatLng(15.974864857925766, 120.54683112058119),
                        new LatLng(15.974606994868058, 120.5547060865441),
                        new LatLng(15.980331476450257, 120.55497430747),
                        new LatLng(15.982322113614318, 120.55517815534326),
                        new LatLng(15.984054880097785, 120.55559657992517),
                        new LatLng(15.984003309883441, 120.55647634443079),
                        new LatLng(15.98179093517146, 120.56015901736662),
                        new LatLng(15.98093, 120.56054))
                .width(15)
                .color(Color.BLUE));

        mMap.addPolyline(new
                PolylineOptions()
                .add(new LatLng(15.992174, 120.537569),
                        new LatLng(15.993473608323896, 120.53726884916486),
                        new LatLng(15.993989285470567, 120.53957554884765),
                        new LatLng(15.995195964767467, 120.54033729617908),
                        new LatLng(15.990606419274677, 120.54381343895105),
                        new LatLng(15.989069671473812, 120.54638835965977),
                        new LatLng(15.986698776678713, 120.54977464830316),
                        new LatLng(15.984553472891701, 120.55573988080452),
                        new LatLng(15.981809925757359, 120.56014943270677),
                        new LatLng(15.98093, 120.56054))
                .width(15)
                .color(Color.YELLOW));
    }
}