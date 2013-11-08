package com.karibunairobi;

import java.util.List;

import android.graphics.drawable.Drawable;
import android.os.Bundle;

import com.google.android.maps.GeoPoint;
import com.google.android.maps.MapActivity;
import com.google.android.maps.MapController;
import com.google.android.maps.MapView;
import com.google.android.maps.OverlayItem;
import com.karibunairobi.R;


public class ParishDirection extends MapActivity {

	private MapView mapView;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.parishdirection);

		Bundle bundle = getIntent().getExtras();
		final String setParish = bundle.getString("selectedparish");

		mapView = (MapView) findViewById(R.id.map_view);
		mapView.setBuiltInZoomControls(true);

		if (setParish.equals("Our Lady Queen of Peace")) {
			float latitude = (float) -1.31136;
			float longitude = (float) 36.83465;
			String where = "Our Lady Queen of Peace";

			showMap(latitude, longitude, where);
		}
		if (setParish.equals("Mbagathi Study Centre")) {
			float latitude = (float) -1.30864;
			float longitude = (float) 36.81298;
			String where = "Mbagathi Study Centre";

			showMap(latitude, longitude, where);
		}
		if (setParish.equals("Holy Family Basilica")) {
			float latitude = (float) -1.28694;
			float longitude = (float) 36.82056;
			String where = "Holy Family Basilica";

			showMap(latitude, longitude, where);

		}
		if (setParish.equals("Queen of Apostles Seminary")) {
			float latitude = (float) -1.22866;
			float longitude = (float) 36.88441;

			String where = "Queen of Apostles Seminary";
			showMap(latitude, longitude, where);
		}
		if (setParish.equals("Guadalupe Catholic Church")) {
			float latitude = (float) -1.30112;
			float longitude = (float) 36.77905;

			String where = "Guadalupe Catholic Church";
			showMap(latitude, longitude, where);
		}
		if (setParish.equals("Assumption")) {
			float latitude = (float) -1.28186;
			float longitude = (float) 36.88848;

			String where = "Assumption";
			showMap(latitude, longitude, where);
		}
		if (setParish.equals("St. Teresa of Avila")) {
			float latitude = (float) -1.29207;
			float longitude = (float) 36.82195;

			String where = "St. Teresa of Avila";
			showMap(latitude, longitude, where);
		}
		if (setParish.equals("St. Peter's Claver")) {
			float latitude = (float) -1.29207;
			float longitude = (float) 36.82195;

			String where = "St. Peter's Claver";
			showMap(latitude, longitude, where);
		}
		if (setParish.equals("Don Bosco")) {
			float latitude = (float) -1.30254;
			float longitude = (float) 36.82074;

			String where = "Don Bosco";
			showMap(latitude, longitude, where);
		}
		if (setParish.equals("St. Austins Catholic")) {
			float latitude = (float) -1.26439;
			float longitude = (float) 36.77817;

			String where = "St. Austins Catholic";
			showMap(latitude, longitude, where);
		}
		if (setParish.equals("St. Paul's Chapel")) {
			float latitude = (float) -1.28149;
			float longitude = (float) 36.81432;

			String where = "St. Paul's Chapel";
			showMap(latitude, longitude, where);
		}

	}

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}

	public void showMap(float lat, float longi, String where) {
		List mapOverlays = mapView.getOverlays();
		Drawable drawable = this.getResources().getDrawable(R.drawable.pin101);
		ParishItemizedOverlay itemizedOverlay = new ParishItemizedOverlay(
				drawable, this);
		GeoPoint point = new GeoPoint((int) (lat * 1E6), (int) (longi * 1E6));
		OverlayItem overlayitem = new OverlayItem(point, "Info", where);

		itemizedOverlay.addOverlay(overlayitem);
		mapOverlays.add(itemizedOverlay);

		MapController mapController = mapView.getController();

		mapController.animateTo(point);
		mapController.setZoom(15);
	}

}
