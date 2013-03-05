package com.ruzulive.androidapp;

import android.app.Activity;
import android.content.Intent;
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
					sleep(3000);
				} catch(InterruptedException e){
					e.printStackTrace();
				} finally {
					Intent mainAct = new Intent("com.ruzulive.androidapp.MAINACT"); //link to intent in AndroidManifest.xml
					startActivity(mainAct);
				}
			}
		};
		timer.start();
	}

	@Override
	//Method is called when another activity is started
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish(); //Kills splash screen
	}

}
