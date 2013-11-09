package com.karibunairobi;



import android.R.integer;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.karibunairobi.R;

public class Description  extends DashBoardActivity  {
	
	public void onCreate(Bundle savedInstanceState) {
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.description);
		
		  Bundle bundle = getIntent().getExtras();
	      final Integer pos = bundle.getInt("pos");
			final Integer position = bundle.getInt("position");
			final Integer bg = bundle.getInt("background");
			TextView HeaderText = (TextView) findViewById(R.id.textView1);
			char[] ls = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
			  int position2 = position +1;
			  String r = "";
			  String p = "";
			  String a = pos + r; 
			  String b = position + r; 
			  r = ls[pos % 26] + r;
			  p= ls[position % 26] + p;
			  
			  StringBuffer sb = new StringBuffer();
			  sb.append("d").append(pos).append(position2);			
				String result = sb.toString();
				int resID = getResources().getIdentifier(result, "string", getPackageName());
				String strTest = getResources().getString(resID);
				
				HeaderText.setText(strTest); 
			  //String a = pos + r; 
		

	}
	
}
