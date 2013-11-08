package com.karibunairobi;

import com.karibunairobi.R;
import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Demonstrate how to populate a complex ListView with icon and text.
 * Icon images taken from icon pack by Everaldo Coelho (http://www.everaldo.com)
 */
public class Listview extends Activity {
	private List<Car> myCars = new ArrayList<Car>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		populateCarList();
		populateListView();
		registerClickCallback();
	}
	private void populateCarList() {
		myCars.add(new Car("Hilton", R.drawable.hilton, "Needing work"));
		myCars.add(new Car("Nairobi Serena", R.drawable.serena, "Lovable"));
		myCars.add(new Car("Nairobi Safari Club", R.drawable.safariclub, "Wet"));
		myCars.add(new Car("Laico Regency", R.drawable.laicoregency, "Fast!"));
		myCars.add(new Car("Fairmont The Norfolk", R.drawable.fairmont, "Awesome"));
		myCars.add(new Car("Panari", R.drawable.panari, "Not *very* good")); 
		myCars.add(new Car("Ole Sereni", R.drawable.olesereni, "Out of this world"));
		myCars.add(new Car("The Giraffe Manor", R.drawable.giraffemanor, "Out of this world"));
		myCars.add(new Car("Mokoyeti Resort", R.drawable.mokoyetiresort, "Out of this world"));
		myCars.add(new Car("Java House", R.drawable.javahouse, "Out of this world"));
		myCars.add(new Car("The Thorn Tree Cafe", R.drawable.thorntree, "Out of this world"));
		myCars.add(new Car("Cafe Maghreb", R.drawable.maghreb, "Out of this world"));
		myCars.add(new Car("Debonairs", R.drawable.debonairs, "Out of this world"));
		myCars.add(new Car("Steers", R.drawable.streers, "Out of this world"));
		myCars.add(new Car("Cafe Deli", R.drawable.cafedeli, "Out of this world")); 
		
	}
	
	private void populateListView() {
		ArrayAdapter<Car> adapter = new MyListAdapter();
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setAdapter(adapter);
	}
	
	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {
				
							
				Car clickedCar = myCars.get(position);
				
				Intent intent;
				switch (position) {

				case 0:
					intent = new Intent(Listview.this, Hilton.class);
					startActivity(intent);
					break;

				case R.id.btn_questions: 
					

				case R.id.btn_comm:
					intent = new Intent(Listview.this, Commandments.class);
					startActivity(intent);
					break;

				case R.id.btn_creed:
					intent = new Intent(Listview.this, Description.class);
					startActivity(intent);
					break;
				case R.id.btn_parish:
					intent = new Intent(Listview.this, Parish.class);
					startActivity(intent);
					break;
				case R.id.btn_about:
					intent = new Intent(Listview.this, About.class);
					startActivity(intent);
					break;
				default:
					String message = "You clicked position " + position
					+ " Which is car make " + clickedCar.getMake();
	Toast.makeText(Listview.this, message, Toast.LENGTH_LONG).show();
					
					break;
				}
				
				
			}
		});
	}
	
	private class MyListAdapter extends ArrayAdapter<Car> {
		public MyListAdapter() {
			super(Listview.this, R.layout.item_view, myCars);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
			}
			
			// Find the car to work with.
			Car currentCar = myCars.get(position);
			
			// Fill the view
			ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
			imageView.setImageResource(currentCar.getIconID());
			
			// Make:
			TextView makeText = (TextView) itemView.findViewById(R.id.item_txtMake);
			makeText.setText(currentCar.getMake());

			// Year:
			TextView yearText = (TextView) itemView.findViewById(R.id.item_txtYear);
			yearText.setText("" + currentCar.getYear());
			
			// Condition:
			//TextView condionText = (TextView) itemView.findViewById(R.id.item_txtCondition);
			//condionText.setText(currentCar.getCondition());

			return itemView;
		}				
	}
}














