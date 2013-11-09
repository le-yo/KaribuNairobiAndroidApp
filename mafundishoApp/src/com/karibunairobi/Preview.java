package com.karibunairobi;



import com.karibunairobi.R;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Preview  extends DashBoardActivity  {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.preview);
		
		Button btDescription=(Button)findViewById(R.id.btncall);
		 Button btnmap =(Button)findViewById(R.id.btnmap);
       Button btnContact=(Button)findViewById(R.id.btnwebsite);
       
       //decode mode
       
       
       btDescription.setText("View Description");
  	 btnmap.setText("Check out map");
  	 btnContact.setText("View Contacts");
	}
	public void clickdescription(View v){
		Intent viewdescription = new Intent(Preview.this,Description.class);
		startActivity(viewdescription);
	}
	
	public void viewmap(View v){
		Intent viewmap = new Intent(Preview.this,MapsLocation.class);
		//String longi = 1;
		//String lat = 34;
		Bundle bundle = getIntent().getExtras();
		
		
		//Bundle bundle = new Bundle();
		//bundle.putString("lat", lat1);
		//bundle.putString("longi", lat2);
		
		viewmap.putExtras(bundle);
		startActivity(viewmap);   
		
		}
	
	public void clickwebsite(View v){
		Intent viewdescription = new Intent(Preview.this,Contact.class);
		startActivity(viewdescription);
		
		Bundle bundle = getIntent().getExtras();
		final String uri = bundle.getString("uri");
		Intent gowebsite = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
		startActivity(gowebsite);
	}


}