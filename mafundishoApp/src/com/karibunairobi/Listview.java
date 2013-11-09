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


public class Listview extends Activity {
	private List<ListItems> myItems = new ArrayList<ListItems>();

	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		populateCarList();
		populateListView();
		registerClickCallback();
	} 
	private void populateCarList() {
		Bundle bundle = getIntent().getExtras();
		final String pos = bundle.getString("pos");
		 Integer poss = Integer.parseInt(pos);
		
		switch (poss) {

		case 1:
			myItems.add(new ListItems("Hilton", R.drawable.hilton, "Needing work"));
			myItems.add(new ListItems("Nairobi Serena", R.drawable.serena, "Lovable"));
			myItems.add(new ListItems("Nairobi Safari Club", R.drawable.safariclub, "Wet"));
			myItems.add(new ListItems("Laico Regency", R.drawable.laicoregency, "Fast!"));
			myItems.add(new ListItems("Fairmont The Norfolk", R.drawable.fairmont, "Awesome"));
			myItems.add(new ListItems("Panari", R.drawable.panari, "Not *very* good")); 
			myItems.add(new ListItems("Ole Sereni", R.drawable.olesereni, "Out of this world"));
			myItems.add(new ListItems("The Giraffe Manor", R.drawable.giraffemanor, "Out of this world"));
			myItems.add(new ListItems("Mokoyeti Resort", R.drawable.mokoyetiresort, "Out of this world"));
			myItems.add(new ListItems("Java House", R.drawable.javahouse, "Out of this world"));
			myItems.add(new ListItems("The Thorn Tree Cafe", R.drawable.thorntree, "Out of this world"));
			myItems.add(new ListItems("Cafe Maghreb", R.drawable.maghreb, "Out of this world"));
			myItems.add(new ListItems("Debonairs", R.drawable.debonairs, "Out of this world"));
			myItems.add(new ListItems("Steers", R.drawable.streers, "Out of this world"));
			myItems.add(new ListItems("Cafe Deli", R.drawable.cafedeli, "Out of this world"));
			break;

		case 2:
			myItems.add(new ListItems("Uchumi City Square", R.drawable.uchumilarge, "Needing work")); 
			myItems.add(new ListItems("Uchumi Langata Hyper", R.drawable.uchumilarge, "Lovable"));
			myItems.add(new ListItems("Uchumi Capital Centre", R.drawable.uchumilarge, "Wet"));
			myItems.add(new ListItems("Uchumi Ngong Hyper", R.drawable.uchumilarge, "Fast!"));
			myItems.add(new ListItems("Uchumi Sarit", R.drawable.uchumilarge, "Awesome"));
			myItems.add(new ListItems("Uchumi Taj Mall", R.drawable.uchumilarge, "Not *very* good")); 
			myItems.add(new ListItems("Uchumi Adams Arcade", R.drawable.uchumilarge, "Out of this world"));
			myItems.add(new ListItems("Uchumi Buruburu", R.drawable.uchumilarge, "Out of this world"));
			myItems.add(new ListItems("Uchumi Ongata Rongai", R.drawable.uchumilarge, "Out of this world"));
			myItems.add(new ListItems("Uchumi Westlands", R.drawable.uchumilarge, "Out of this world"));
			myItems.add(new ListItems("Nakumatt Mega", R.drawable.nakumatt, "Out of this world"));
			myItems.add(new ListItems("Nakumatt Ukay", R.drawable.nakumatt, "Out of this world"));
			myItems.add(new ListItems("Nakumatt Lifestyle", R.drawable.nakumatt, "Out of this world"));
			myItems.add(new ListItems("Nakumatt Embakasi", R.drawable.nakumatt, "Out of this world"));
			myItems.add(new ListItems("Nakumatt Karen", R.drawable.nakumatt, "Out of this world")); 
			myItems.add(new ListItems("Nakumatt Juction", R.drawable.nakumatt, "Out of this world"));
			myItems.add(new ListItems("Nakumatt Ronald Ngala", R.drawable.nakumatt, "Out of this world"));
			myItems.add(new ListItems("Nakumatt Prestige", R.drawable.nakumatt, "Out of this world"));
			myItems.add(new ListItems("Nakumatt Galleria", R.drawable.nakumatt, "Out of this world"));
			myItems.add(new ListItems("Nakumatt Village Market", R.drawable.nakumatt, "Out of this world")); 
			myItems.add(new ListItems("Tuskys T-Mall", R.drawable.tuskys, "Needing work"));
			myItems.add(new ListItems("Tuskys Imara", R.drawable.tuskys, "Lovable"));
			myItems.add(new ListItems("Tuskys Greenspan", R.drawable.tuskys, "Wet"));
			myItems.add(new ListItems("Tuskys Express", R.drawable.tuskys, "Fast!"));
			myItems.add(new ListItems("Tuskys Embakasi", R.drawable.tuskys, "Awesome"));
			myItems.add(new ListItems("Tuskys Chap Chap Adams", R.drawable.tuskys, "Not *very* good")); 

		case R.id.btn_comm:
			

		case R.id.btn_creed:
			
		
		default:
			break;
		}
		
		
	 
		
	}
	
	private void populateListView() {
		TextView HeaderText = (TextView) findViewById(R.id.txtMade);
		HeaderText.setText("Hotels and Restaurants");
		
		ArrayAdapter<ListItems> adapter = new MyListAdapter();
		
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setAdapter(adapter);
	}
	
	private void registerClickCallback() {
		ListView list = (ListView) findViewById(R.id.carsListView);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View viewClicked,
					int position, long id) {
				
							
				ListItems clickedCar = myItems.get(position);
				
				Intent intent;
				switch (position) {

				case 0:
					intent = new Intent(Listview.this, Preview.class);					
					Bundle bundle = new Bundle();
					//we need the title of the list
					//list items
					//item id to identify it
					
	
	//for each list item we need to bundle up a few things
					
			//for the preview we need the background image
					
			//for the description we need the background image which will be the same as the preview
					//for each list item, we need the description
					//we need the latitude and longitude of the map
					//we need the contacts string
					//
					bundle.putString("lat", "1");
					bundle.putString("Title", "1");
					bundle.putString("longi", "34");
					bundle.putString("uri", "http://devs.mobi");
					
					intent.putExtras(bundle);					
					
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
	
	private class MyListAdapter extends ArrayAdapter<ListItems> {
		public MyListAdapter() {
			super(Listview.this, R.layout.item_view, myItems);
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// Make sure we have a view to work with (may have been given null)
			View itemView = convertView;
			if (itemView == null) {
				itemView = getLayoutInflater().inflate(R.layout.item_view, parent, false);
			}
			
			// Find the car to work with.
			ListItems currentCar = myItems.get(position);
			
			// Fill the view
			ImageView imageView = (ImageView)itemView.findViewById(R.id.item_icon);
			imageView.setImageResource(currentCar.getIconID());
			
			//Fill the background
			//ImageView imageView = (ImageView)itemView.findViewById(R.id.);
			//imageView.setImageResource(currentCar.getIconID());
			
			// Make:
			TextView makeText = (TextView) itemView.findViewById(R.id.item_txtMake);
			makeText.setText(currentCar.getMake());
			
			
			
			

			// Year:
			//TextView yearText = (TextView) itemView.findViewById(R.id.item_txtYear);
			//yearText.setText("" + currentCar.getYear());
			
			// Condition:
			//TextView condionText = (TextView) itemView.findViewById(R.id.item_txtCondition);
			//condionText.setText(currentCar.getCondition());

			return itemView;
		}				
	}
}














