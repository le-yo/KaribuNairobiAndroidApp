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
			//for each list item, we need the description we can use the position
			//we need the latitude and longitude of the map we can use the position and back up with poss
			//we need the contacts
			//we need the website
			
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
			break;
		case 3:
			myItems.add(new ListItems("Focus Cabs", R.drawable.yellowcab, "Needing work"));
			myItems.add(new ListItems("Jatco Cabs", R.drawable.yellowcab, "Lovable"));
			myItems.add(new ListItems("JimCab Kenya", R.drawable.carsrow, "Wet"));
			myItems.add(new ListItems("Universal Cabs", R.drawable.yellowcab, "Fast!"));
			myItems.add(new ListItems("Summit Safaris Cabs", R.drawable.yellowcab, "Awesome"));
			myItems.add(new ListItems("Burner Cabs Services", R.drawable.yellowcab, "Not *very* good")); 
			break;

		case 4:
			myItems.add(new ListItems("Nairobi National Park", R.drawable.yellowcab, "Needing work"));
			myItems.add(new ListItems("Karen Blixen Museum", R.drawable.yellowcab, "Lovable"));
			myItems.add(new ListItems("Uhuru Park", R.drawable.carsrow, "Wet"));
			myItems.add(new ListItems("Nairobi Snake Park", R.drawable.yellowcab, "Fast!"));
			myItems.add(new ListItems("Nairobi Gallery", R.drawable.yellowcab, "Awesome"));
			myItems.add(new ListItems("Nairobi National Museum", R.drawable.yellowcab, "Not *very* good"));
			myItems.add(new ListItems("Mamba Village", R.drawable.yellowcab, "Not *very* good"));
		break;
			
		case 5:
			myItems.add(new ListItems("The Carnivore Nightclub", R.drawable.yellowcab, "Needing work"));
			myItems.add(new ListItems("Klub House(K1)", R.drawable.yellowcab, "Lovable"));
			myItems.add(new ListItems("Rafikiz Bar & Lounge", R.drawable.carsrow, "Wet"));
			myItems.add(new ListItems("Casablanca", R.drawable.yellowcab, "Fast!"));
			myItems.add(new ListItems("Taboo", R.drawable.yellowcab, "Awesome"));
			myItems.add(new ListItems("The Florida Nightclub", R.drawable.yellowcab, "Not *very* good"));
		break;
		case 6:
			myItems.add(new ListItems("The Carnivore Nightclub", R.drawable.yellowcab, "Needing work"));
			myItems.add(new ListItems("Klub House(K1)", R.drawable.yellowcab, "Lovable"));
			myItems.add(new ListItems("Rafikiz Bar & Lounge", R.drawable.carsrow, "Wet"));
			myItems.add(new ListItems("Casablanca", R.drawable.yellowcab, "Fast!"));
			myItems.add(new ListItems("Taboo", R.drawable.yellowcab, "Awesome"));
			myItems.add(new ListItems("The Florida Nightclub", R.drawable.yellowcab, "Not *very* good"));
		break;
		}
		
		
	 
		
	}
	
	private void populateListView() {
		Bundle bundle = getIntent().getExtras();
		final String Header = bundle.getString("Header");
		TextView HeaderText = (TextView) findViewById(R.id.txtMade);
		HeaderText.setText(Header);
		
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
				Bundle bundle = getIntent().getExtras();
				final String pos = bundle.getString("pos");
				Integer pos2 = Integer.parseInt(pos);
				final Integer bg = bundle.getInt("background");
				intent = new Intent(Listview.this, Preview.class);					
				Bundle bundle2 = new Bundle();
				bundle2.putInt("pos", pos2);
				bundle2.putInt("position", position);
				bundle2.putInt("background",bg);
				intent.putExtras(bundle2);
				startActivity(intent);
//				
//				
//				switch (position) {
//				
//
//				case 1:
//					intent = new Intent(Listview.this, Preview.class);					
//					Bundle bundle2 = new Bundle();
//					bundle2.putString("pos", pos);
//					bundle2.putInt("position", position);
//					bundle2.putInt("background",bg);
//					intent.putExtras(bundle2);					
//					
//					startActivity(intent);
//				
//					//bundle2.putInt("description",R.drawable.hilton);
//					
//					
//	
//	//for each list item we need to bundle up a few things
//					
//			//for the preview we need the background image which is shared
//					
//			//for each list item we need to get the description we need the background image
//					//background
//					//for each list item, we need the description
//					//we need the latitude and longitude of the map
//					//we need the contacts
//					//we need the website
//					//
//					//bundle.putInteger(background, value);
////					bundle.putString("lat", "1");
////					bundle.putString("Title", "1");
////					bundle.putString("longi", "34");
////					bundle.putString("uri", "http://devs.mobi");
//					
//		//			intent.putExtras(bundle2);					
//					
//					startActivity(intent);
//					break;
//
//				case 2: 
//					
//
//				case 3:
//					intent = new Intent(Listview.this, Commandments.class);
//					startActivity(intent);
//					break;
//
//				case 4:
//					intent = new Intent(Listview.this, Description.class);
//					startActivity(intent);
//					break;
//				case 5:
//					intent = new Intent(Listview.this, Parish.class);
//					startActivity(intent);
//					break;
//				case 6:
//					intent = new Intent(Listview.this, About.class);
//					startActivity(intent);
//					break;
//				default:
//					String message = "You clicked position " + position
//					+ " Which is car make " + clickedCar.getMake();
//	Toast.makeText(Listview.this, message, Toast.LENGTH_LONG).show();
//					
//					break;
//				}
//				
				
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














