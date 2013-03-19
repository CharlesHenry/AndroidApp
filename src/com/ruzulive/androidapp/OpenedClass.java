package com.ruzulive.androidapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class OpenedClass extends Activity implements OnClickListener,
		OnCheckedChangeListener {

	TextView tvQuestion, tvTest;
	Button returnData;
	RadioGroup selectionList;
	String gotBread;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		setUpReferences();
		Bundle gotBasket = getIntent().getExtras(); //get extras when class is opened with extras
		gotBread = gotBasket.getString("keyBread");	//put extras into a string var
		tvQuestion.setText(gotBread);
	}

	public void setUpReferences(){
		tvQuestion = (TextView) findViewById (R.id.tvQuestion);
		tvTest = (TextView) findViewById (R.id.tvTest);
		returnData = (Button) findViewById (R.id.bReturn);
		selectionList = (RadioGroup) findViewById(R.id.rgAnswers);
		selectionList.setOnCheckedChangeListener(this); //call this method rather than the usual onClick for RadioGroup
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onCheckedChanged(RadioGroup group, int checkedId) {
		// TODO Auto-generated method stub
		switch (checkedId) {
		case R.id.rbCrazy:
			
			break;
		case R.id.rbSexy:
			
			break;
		case R.id.rbBoth:
			
			break;
		}
	}

}
