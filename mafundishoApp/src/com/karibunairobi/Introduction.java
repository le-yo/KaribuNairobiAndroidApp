package com.karibunairobi;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import com.karibunairobi.R;



import android.os.Bundle;
import android.widget.TextView;

public class Introduction extends DashBoardActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.introduction);
		// setHeader(getString(R.string.whataboutTitle), false, true);

		TextView helloTxt = (TextView) findViewById(R.id.textView1);
		helloTxt.setText(readTxt());
	}

	private String readTxt() {

		InputStream inputStream = getResources().openRawResource(R.raw.intro);

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

}