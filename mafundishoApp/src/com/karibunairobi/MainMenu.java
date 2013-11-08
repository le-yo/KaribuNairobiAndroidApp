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
			startActivity(intent);
			break;

		case R.id.btn_questions:
			intent = new Intent(this, Hilton.class);
			startActivity(intent);
			break;

		case R.id.btn_comm:
			intent = new Intent(this, Commandments.class);
			startActivity(intent);
			break;

		case R.id.btn_creed:
			intent = new Intent(this, Description.class);
			startActivity(intent);
			break;
		case R.id.btn_parish:
			intent = new Intent(this, Parish.class);
			startActivity(intent);
			break;
		case R.id.btn_about:
			intent = new Intent(this, About.class);
			startActivity(intent);
			break;
		default:
			break;
		}
	}
}
