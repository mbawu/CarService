package com.xqxy.main;



import com.xqxy.carservice.R;

import android.os.Bundle;

import android.app.Activity;
import android.view.Menu;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);//11122299
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is-------- present.
		getMenuInflater().inflate(R.menu.main, menu); 
		return true;
	}

}
