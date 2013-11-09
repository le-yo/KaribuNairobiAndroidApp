package com.karibunairobi;



import com.karibunairobi.R;

import android.R.integer;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Preview  extends DashBoardActivity  {

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.preview);
		Bundle bundle3 = getIntent().getExtras();
		   
		final Integer bg = bundle3.getInt("background");
		final Integer position = bundle3.getInt("position");
		final Integer pos = bundle3.getInt("pos");
		//setContentView(R.layout.my_layout); // add this code
	    LinearLayout ln = (LinearLayout) this.findViewById(R.id.linlay);
	    if(pos == 2){
	    if (position < 6) {
	    	ln.setBackgroundDrawable(getResources().getDrawable(R.drawable.uchumibg));
		}
	    if ((position > 5)&&(position<11)) {
	    	ln.setBackgroundDrawable(getResources().getDrawable(R.drawable.nakumattbg));
		}
	    if ((position > 10)&&(position<16)) {
	    	ln.setBackgroundDrawable(getResources().getDrawable(R.drawable.tuskybg));
		}
	    }
	    if(pos != 2){
	    ln.setBackgroundDrawable(getResources().getDrawable(bg));
		}
		  
		
		//linearlayout.setBackgroundResource(R.drawable.FILENAME);
        
		
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
        Bundle bundle3 = getIntent().getExtras();
        
//        final String pos = bundle.getString("pos");
//		final Integer position = bundle.getInt("position");
//		final Integer bg = bundle.getInt("bg");
//		Bundle bundle3 = new Bundle();
//        bundle3.putString("pos", pos);
//		bundle3.putInt("position", position);
//		bundle3.putInt("background",bg);
		
		viewdescription.putExtras(bundle3);
		
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
		Intent gowebsite = new Intent(Preview.this,Contact.class);
		//startActivity(viewdescription);
		Bundle bundle = getIntent().getExtras();
		gowebsite.putExtras(bundle);
		//
		//final String uri = bundle.getString("uri");
		//Intent gowebsite = new Intent(Intent.ACTION_VIEW,Uri.parse(uri));
		startActivity(gowebsite);
	}


}