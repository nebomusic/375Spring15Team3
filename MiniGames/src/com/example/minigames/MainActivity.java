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

public class MainActivity extends Activity {

	private AnimationView animationView;
	private SensorManager sensorManager;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        animationView = (AnimationView)findViewById(R.id.animationView);
		enableAccelerometerListening();
    }
    private void enableAccelerometerListening() {
		// TODO Auto-generated method stub
		
	}
	protected void onResume() {
    	super.onResume();
    	setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
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
    }
    public void handleClick(View v) {
    	switch (v.getId()){
    		case R.id.buttonPong:
    			Intent intentOne = new Intent (this, PongActivity.class);
    			startActivity(intentOne);
    			break;
    		case R.id.buttonBrick:
    			Intent intentTwo = new Intent (this, BrickBreakerActivity.class);
    			startActivity(intentTwo);
    			break;
//    		case R.id.buttonConnect:
//    			Intent intentThree = new Intent (this, ConnectFourActivity.class);
//    			startActivity(intentThree);
//    			break;
//    		case R.id.buttonCraps:
//    			Intent intentFour = new Intent (this, AstroidsActivity.class);
//    			startActivity(intentFour);
//    			break;
//    		case R.id.buttonSettings:
//    			Intent intentFive = new Intent (this, SettingsActivity.class);
//    			startActivity(intentFive);
//    			break; 
    	}

    	
    }
}

  
    	
