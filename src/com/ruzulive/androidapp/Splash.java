package com.ruzulive.androidapp;

import android.app.Activity;
import android.os.Bundle;

public class Splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash); //Sets content page to splash layout
		//Used as a timer for the Splash screen
		Thread timer= new Thread() {
			public void run(){
				try{
					
				} catch(InterruptedException e){
					
				} finally {
					
				}
			};
		};
	}

}
