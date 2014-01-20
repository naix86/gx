package com.parse.starter;

import android.app.Activity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;

public class ParseStarterProjectActivity extends Activity {
	/** Called when the activity is first created. */
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		// Add your initialization code here
		Parse.initialize(this, "mFrewsKnWGVdz9AJJHfaN7WXKxq5LAz2Mp8B8mIR", "R88iw1KmwjFuUqaOxx8qceVGkzivBiQnKuICJCvJ");
		//Parse
        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
        //End Parse
        
		ParseAnalytics.trackAppOpened(getIntent());
	}
}
