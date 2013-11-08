package com.karibunairobi;



import com.karibunairobi.R;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Sacraments extends ListActivity {
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		String[] values = new String[] { "Christian Initiation Sacraments",
				"Sacraments of Healing", "Service of Communion Sacraments" };
		// Use your own layout
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				R.layout.sacraments, R.id.label, values);
		setListAdapter(adapter);
		ListView lvSacraments = getListView();
		lvSacraments.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// Toast.makeText(getApplicationContext(),
				// ((TextView)view).getText(), Toast.LENGTH_SHORT).show();
				if (position == 0) {
					// calling the secondlist activity
					Intent intent = new Intent(Sacraments.this,
							ChristianInitiationSacraments.class);
					startActivity(intent);
				} else if (position == 1) {

					Intent intSoH = new Intent(Sacraments.this,
							Sacraments_of_Healing.class);
					startActivity(intSoH);

				} else if (position == 2) {
					Intent intSatheService = new Intent(Sacraments.this,
							ServiceofCommunionSacraments.class);
					startActivity(intSatheService);
				}

			}
		});
	}

}