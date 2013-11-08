package com.karibunairobi;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;

import com.karibunairobi.R;



import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Parish extends DashBoardActivity {

	InputStream inputStream;
	HttpClient httpclient;
	HttpPost httppost;
	List<NameValuePair> nameValuePairs;
	StringBuffer sb;
	String line, result, number;
	String health = null;
	byte[] data;
	ArrayList items = new ArrayList();
	ArrayAdapter<?> aa;
	ListView myListView;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.parish);
		myListView = (ListView) this.findViewById(android.R.id.list);
		// Spinner spin=(Spinner) findViewById(R.id.spinner);

		final String[] Splittedparishes = { "Our Lady Queen of Peace",
				"Mbagathi Study Centre", "Holy Family Basilica",
				"Queen of Apostles Seminary", "Guadalupe Catholic Church",
				"Assumption", "St. Teresa of Avila", "St. Peter's Claver",
				"Don Bosco","St. Austins Catholic","St. Paul's Chapel"};
		aa = new ArrayAdapter<String>(this, R.layout.list_items,
				Splittedparishes);
		myListView.setAdapter(aa);
		myListView.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int pos,
					long arg3) {
				final String keyword = Splittedparishes[pos];

				new ProgressDialog(arg0.getContext());

				final ProgressDialog dialog = ProgressDialog.show(
						arg0.getContext(), "Please Wait", "Mapping.....");
				Thread thread = new Thread() {
					@Override
					public void run() {
						try {
							Intent intent = new Intent(Parish.this,
									ParishDirection.class);
							Bundle bundle = new Bundle();
							bundle.putString("selectedparish", keyword);
							intent.putExtras(bundle);
							startActivity(intent);

							runOnUiThread(new Runnable() {
								public void run() {

									dialog.dismiss();
								}
							});
						} catch (Exception e) {
							// TODO: handle exception
						}
					}
				};
				thread.start();

			}
		});

	}

}