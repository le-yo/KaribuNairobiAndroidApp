package com.karibunairobi;



import com.karibunairobi.R;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;

public class Prayers extends ListActivity {

	private String[] prayer_types = new String[] { "5 types of prayers",
			"Common prayers" };

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setListAdapter(new ArrayAdapter<String>(this, R.layout.prayers,
				prayer_types));
		ListView lvSacraments = getListView();
		lvSacraments.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				if (position == 0) {
					// calling the secondlist activity
					Intent intent = new Intent(Prayers.this,
							FiveTypesofPrayers.class);
					startActivity(intent);
				} else if (position == 1) {

					Intent intSoH = new Intent(Prayers.this,
							CommonPrayers.class);
					startActivity(intSoH);

				}

			}
		});
	}
}
