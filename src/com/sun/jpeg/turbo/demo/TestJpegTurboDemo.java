package com.sun.jpeg.turbo.demo;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TestJpegTurboDemo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test_jpeg_turbo_demo);
		
		Util.read();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.test_jpeg_turbo_demo, menu);
		return true;
	}

}
