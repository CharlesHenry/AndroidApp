package com.ruzulive.androidapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Data extends Activity implements OnClickListener {

	Button bSA, bSAFR;
	EditText etSend;
	TextView tvGot;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.get);
		setUpReferences();
	}

	public void setUpReferences() {
		bSA = (Button) findViewById(R.id.bSA);
		bSAFR = (Button) findViewById(R.id.bSAFR);
		etSend = (EditText) findViewById(R.id.etSend);
		tvGot = (TextView) findViewById(R.id.tvGot);

		bSA.setOnClickListener(this);
		bSAFR.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bSA:
			String bread = etSend.getText().toString(); //get string from edit text etSend
			Bundle basket = new Bundle();				//make new bundle to store string
			basket.putString("keyBread", bread); 			//add string to bundle
			
			//pass bundle to intent and start it
			Intent a = new Intent(Data.this, OpenedClass.class); //setup intent to open another class
			a.putExtras(basket);						//pass bundle to intent
			startActivity(a);							//start intent
			break;
		case R.id.bSAFR:
			
			break;
		}
	}

}
