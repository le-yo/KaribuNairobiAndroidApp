package com.karibunairobi;



import java.io.IOException;
import java.util.List;
import java.util.Locale;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.Overlay;
import com.google.android.maps.MapView.LayoutParams;

 
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
 
public class MapsLocation extends MapActivity 
{    
    MapView mapView; 
    MapController mc;
    GeoPoint p;
 
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.maps);
 
        mapView = (MapView) findViewById(R.id.mapView);
        mapView.setTraffic(true);
       
       //display the zoom controls
       mapView.displayZoomControls(true);

       mapView.setBuiltInZoomControls(true);
       mc = mapView.getController();
       
       
       mc.setZoom(17); 
       //parse static geoppoints
        //String coordinates[] = {"1.019089", "35.002305"};
        //convert to double
       Bundle bundle = getIntent().getExtras();
		final String lat1 = bundle.getString("lat");
		final String lat2 = bundle.getString("longi");
       
        double lat = Double.parseDouble(lat1);
        double lng = Double.parseDouble(lat2);
           //convert to geo points
        p = new GeoPoint(
            (int) (lat * 1E6), 
            (int) (lng * 1E6));
        //add the geo points to the controller
        mc.animateTo(p);
       
        
        //---Add a location marker---
        MapOverlay mapOverlay = new MapOverlay();
        List<Overlay> listOfOverlays = mapView.getOverlays();
        listOfOverlays.clear();
        listOfOverlays.add(mapOverlay);
        
        //mapView.invalidate();
    }
 
    
    class MapOverlay extends com.google.android.maps.Overlay
    {
        @Override
        public boolean draw(Canvas canvas, MapView mapView, 
        boolean shadow, long when) 
        {
            super.draw(canvas, mapView, shadow);                   
 
            //---translate the GeoPoint to screen pixels---
            Point screenPts = new Point();
            mapView.getProjection().toPixels(p, screenPts);
 
            //---add the marker---
            Bitmap bmp = BitmapFactory.decodeResource(
                getResources(), android.R.drawable.star_on);            
            canvas.drawBitmap(bmp, screenPts.x, screenPts.y-50, null);         
            return true;
        }
               
    }
     
    
    
    @Override
    protected boolean isRouteDisplayed() {
        // TODO Auto-generated method stub
        return false;
    }
}
