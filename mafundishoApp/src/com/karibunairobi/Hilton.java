package com.karibunairobi;



import com.karibunairobi.R;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Hilton  extends DashBoardActivity  {
	public TextView description;
    public Button viewmap;
    public Bundle latData,longData;
    public double lat,longi;
    ProgressDialog dialog;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.preview);
		
		Button btDescription=(Button)findViewById(R.id.btncall);
		 Button btnmap =(Button)findViewById(R.id.btnmap);
       Button btnContact=(Button)findViewById(R.id.btnwebsite);
       
       btDescription.setText("View Hilton's Description");
  	 btnmap.setText("Check out map");
  	 btnContact.setText("Visit Hilton's Website");
	}
	public void clickdescription(View v){
		Intent viewdescription = new Intent(Hilton.this,Description.class);
		startActivity(viewdescription);
	}
	
	public void viewmap(View v){
		Intent viewmap = new Intent(Hilton.this,MapsLocation.class);
		//String longi = 1;
		//String lat = 34;
		Bundle bundle = new Bundle();
		bundle.putString("lat", "1");
		bundle.putString("longi", "34");
		
		viewmap.putExtras(bundle);
		startActivity(viewmap);   
		
		}
	
	public void clickwebsite(View v){
		Intent gowebsite = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www3.hilton.com/en/hotels/kenya/hilton-nairobi-NBOHITW/about/index.html"));
		startActivity(gowebsite);
	}


}