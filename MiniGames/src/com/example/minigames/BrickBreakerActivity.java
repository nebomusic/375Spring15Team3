package com.example.minigames;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class BrickBreakerActivity extends Activity {
	
	private AnimationView animationView;
	private SensorManager sensorManager;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_brick_breaker);
		
		animationView = (AnimationView)findViewById(R.id.animationView);
		enableAccelerometerListening();
	}
	public void onResume() {
		super.onResume();
		setContentView(R.layout.activity_brick_breaker);
	}
	
	private void enableAccelerometerListening(){
		sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
		sensorManager.registerListener (sensorEventListener1,
				sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER),
				SensorManager.SENSOR_DELAY_NORMAL);
	}
	
	private SensorEventListener sensorEventListener1 =
			new SensorEventListener() {

				@Override
				public void onSensorChanged(SensorEvent event) {
					// TODO Auto-generated method stub
					float x = event.values[0];
					float y = event.values[1];
					float z = event.values[2];
					
					animationView.setAX(x);
					animationView.setAY(y);
					animationView.setAZ(z);
				}
				
				@Override
				public void onAccuracyChanged(Sensor sensor, int accuracy) {
					// TODO Auto-generated method stub
	}
	};
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.brick_breaker, menu);
		return true;
	}
	
	public void handleClick(View v) {
		Intent intent = new Intent(this, MainActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	};
	private SensorEventListener sensorEventListener  =
			new SensorEventListener() {

				@Override
				public void onSensorChanged(SensorEvent event) {
					// TODO Auto-generated method stub
					float x = event.values[0];
					float y = event.values[1];
					float z = event.values[2];
					
					animationView.setAX(x);
					animationView.setAY(y);
					animationView.setAZ(z);
				}
				
				@Override
				public void onAccuracyChanged(Sensor sensor, int accuracy) {
					// TODO Auto-generated method stub
	}
	};
}

	