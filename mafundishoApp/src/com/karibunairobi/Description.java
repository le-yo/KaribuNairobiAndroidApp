package com.karibunairobi;



import android.os.Bundle;

import com.karibunairobi.R;

public class Description  extends DashBoardActivity  {
	
	public void onCreate(Bundle savedInstanceState) {
		
		
		super.onCreate(savedInstanceState);
		setContentView(R.layout.description);
		
		  Bundle bundle = getIntent().getExtras();
	      final String pos = bundle.getString("pos");
			final Integer position = bundle.getInt("position");
			final Integer bg = bundle.getInt("bg");
		
		
	}

	
	
}
