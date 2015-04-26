package com.example.bleexample;

import com.example.bleexample.R.drawable;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

public class NotificationActivity extends Activity {
ImageView ig;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_notification);
		ig= (ImageView) findViewById(R.id.imageView1);
		ig.setImageResource(R.drawable.downloadgg);
		
	}


}
