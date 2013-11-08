package com.karibunairobi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.karibunairobi.R;



import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class ChristianInitiationSacraments extends DashBoardActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.christianinitiationsacraments);
		// setHeader(getString(R.string.whataboutTitle), false, true);

		TextView cisText = (TextView) findViewById(R.id.tv_ChristianInitiationSacraments);
		cisText.setText(readTxt());
	}

	private String readTxt() {

		InputStream inputStream = getResources().openRawResource(R.raw.cis);

		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

		int i;
		try {
			i = inputStream.read();
			while (i != -1) {
				byteArrayOutputStream.write(i);
				i = inputStream.read();
			}
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return byteArrayOutputStream.toString();
	}

	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflator = getMenuInflater();
		inflator.inflate(R.menu.cis_menu, menu);
		return true;
	}

	// get the selected item on the options menu
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.read_more:
			Intent read_more = new Intent(
					Intent.ACTION_VIEW,
					Uri.parse("http://www.vatican.va/archive/ENG0015/__P3F.HTM"));
			startActivity(read_more);
			break;
		case R.id.back:
			Intent intent = new Intent(this, MainMenu.class);
			startActivity(intent);
			break;
		}

		return true;
	}

}
