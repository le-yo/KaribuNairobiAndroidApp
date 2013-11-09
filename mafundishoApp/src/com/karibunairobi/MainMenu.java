package com.karibunairobi;



import com.karibunairobi.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainMenu extends DashBoardActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_menu);
		setHeader(getString(R.string.whataboutTitle), false, true);
	}

	public void onButtonClicker(View v) {
		Intent intent;
		Bundle bundle = new Bundle();
		switch (v.getId()) {
		/*case R.id.btn_intro:
			intent = new Intent(this, Introduction.class);
			startActivity(intent);
			break;

		case R.id.btn_sacraments:
			intent = new Intent(this, Sacraments.class);
			startActivity(intent);
			break;*/

		case R.id.btn_prayers:
			intent = new Intent(this, Listview.class);			
			bundle.putString("pos", "1");
			bundle.putInt("background",R.drawable.hilton);
			bundle.putString("Header", "Hotels & Restaurants");
			intent.putExtras(bundle);
			startActivity(intent);
			break;

		case R.id.btn_questions:
			intent = new Intent(this, Listview.class);			
			bundle.putString("pos", "2");
			bundle.putInt("background",R.drawable.hilton);
			bundle.putString("Header", "Supermarkets");
			intent.putExtras(bundle);
			startActivity(intent);
			break;

		case R.id.btn_comm:
			intent = new Intent(this, Listview.class);			
			bundle.putString("pos", "3");
			bundle.putInt("background",R.drawable.hilton);
			intent.putExtras(bundle);
			startActivity(intent);
			break;

		case R.id.btn_creed:
			intent = new Intent(this, Listview.class);			
			bundle.putString("pos", "4");
			bundle.putInt("background",R.drawable.hilton);
			intent.putExtras(bundle);
			startActivity(intent);
			break;
		case R.id.btn_parish:
			intent = new Intent(this, Listview.class);			
			bundle.putString("pos", "5");
			bundle.putInt("background",R.drawable.hilton);
			intent.putExtras(bundle);
			startActivity(intent);
			break;
		case R.id.btn_about:
			intent = new Intent(this, Listview.class);			
			bundle.putString("pos", "6");
			bundle.putInt("background",R.drawable.hilton);
			intent.putExtras(bundle);
			startActivity(intent);
			break;
		default:
			break;
		}
	}
}
