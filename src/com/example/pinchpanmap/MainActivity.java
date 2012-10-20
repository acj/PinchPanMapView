package com.example.pinchpanmap;

import android.os.Bundle;

import com.google.android.maps.MapActivity;
import com.google.android.maps.MapView;

public class MainActivity extends MapActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        MapView mapView = new MapView(this, "YOUR MAPS API KEY");
        mapView.getOverlays().add(new PinchPanOverlay());
        mapView.postInvalidate();
        mapView.setClickable(true);
        
        setContentView(mapView);
    }

	@Override
	protected boolean isRouteDisplayed() {
		return false;
	}
}
