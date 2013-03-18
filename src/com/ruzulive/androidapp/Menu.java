package com.ruzulive.androidapp;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Menu extends ListActivity{

	String classes[] = {"MainActivity", "TextPlay", "Email", "Camera", "MenuItem4"};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//simple list item 1 = example item from android SDK
		setListAdapter(new ArrayAdapter<String>(Menu.this, android.R.layout.simple_list_item_1, classes));
	}
	
	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		// TODO Auto-generated method stub
		super.onListItemClick(l, v, position, id);
		
		String myString = classes[position]; //String = whichever list item was clicked
		//Starting an activity
		try{
			Class mainAct = Class.forName("com.ruzulive.androidapp."+ myString);
			Intent mainActIntent = new Intent(Menu.this, mainAct);
			startActivity(mainActIntent);
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
