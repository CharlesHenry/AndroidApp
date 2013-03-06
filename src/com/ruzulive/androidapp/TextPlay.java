package com.ruzulive.androidapp;

import java.util.Random;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

//class implements View.OnClickListener for button actions using a switch
public class TextPlay extends Activity{

	Button bCheckCommand;
	ToggleButton tbPassword;
	EditText input;
	TextView display;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		
		linkObjects();

		tbPassword.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if(tbPassword.isChecked()){
					input.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
				}else{
					input.setInputType(InputType.TYPE_CLASS_TEXT);
				}
			}
		});
		bCheckCommand.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String check = input.getText().toString(); //get text from 'input'
				display.setText(check);
				if(check.contentEquals("left")){
					display.setGravity(Gravity.LEFT);
				}else if(check.contentEquals("center")){
					display.setGravity(Gravity.CENTER);
				}else if(check.contentEquals("right")){
					display.setGravity(Gravity.RIGHT);
				}else if(check.contentEquals("blue")){
					display.setTextColor(Color.BLUE);
				}else if(check.contentEquals("random")){
					Random rand = new Random();
					display.setText("Woah!!");
					display.setTextSize(rand.nextInt(75)); //gives 75 choices for random number
					display.setTextColor(Color.rgb(rand.nextInt(255), rand.nextInt(255), rand.nextInt(255))); //random colour each time (RGB)
					
					switch(rand.nextInt(3)){
					case 0:
						display.setGravity(Gravity.LEFT);
						break;
					case 1:
						display.setGravity(Gravity.CENTER);
						break;
					case 2:
						display.setGravity(Gravity.RIGHT);
						break;
					}
				}else{
					display.setText("invalid");
					display.setTextSize(16);
					display.setGravity(Gravity.CENTER);
					display.setTextColor(Color.BLACK);
				}
			}
		});
	}

	private void linkObjects() {
		// TODO Auto-generated method stub
		bCheckCommand = (Button) findViewById(R.id.bResults);
		tbPassword = (ToggleButton) findViewById(R.id.tbPassword);
		input = (EditText) findViewById(R.id.etCommands);
		display = (TextView) findViewById(R.id.tvResults);
	}

}
