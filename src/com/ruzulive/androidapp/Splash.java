package com.ruzulive.androidapp;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

public class Splash extends Activity {
	
	MediaPlayer splashSound;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		//Remove title bar (must be used before setting content
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		//Remove notification bar
		this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.splash); //Sets content page to splash layout

		splashSound = MediaPlayer.create(Splash.this, R.raw.splash_sound);
		splashSound.start();
		
		//Used as a timer for the Splash screen
		Thread timer= new Thread() {
			public void run(){
				try{
					sleep(3000);
				} catch(InterruptedException e){
					e.printStackTrace();
				} finally {
					Intent mainAct = new Intent("com.ruzulive.androidapp.MENU"); //link to intent in AndroidManifest.xml
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
		splashSound.release(); //Stop sound
		finish(); //Kills splash screen
	}

}
