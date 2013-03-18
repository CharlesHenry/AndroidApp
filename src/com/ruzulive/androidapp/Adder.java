package com.ruzulive.androidapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Adder extends Activity {
	
	//define objects
	int counter;
	Button add, sub;
	TextView display;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //setting up objects
        counter = 0;
        add = (Button) findViewById(R.id.bAdd);
        sub = (Button) findViewById(R.id.bSub);
        display = (TextView) findViewById(R.id.tvDisplay);
        
        //onClickListener setup
        add.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				counter++;
				display.setText("Your total is " + counter );
			}
		});
        sub.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				counter--;
				display.setText("Your total is " + counter );
			}
		});
        
        
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}