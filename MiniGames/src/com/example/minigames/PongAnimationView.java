package com.example.minigames;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class PongAnimationView extends View {
	
	private Actor paddle1;
	private Actor paddle2;
	private Actor ball;
	
	private float ax = 0;
	private float ay = 0;
	private float az = 0;
	
	private Handler h; {
	h = new Handler();
	}
	private int RATE = 30;
	

	public PongAnimationView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	ball = new Actor(context, 100, 100, Color.RED, 25);
	paddle1 = new Actor (context, 300, 300, Color.BLACK, 40);
	paddle2 = new Actor (context, 300, 300, Color.BLACK, 40);
	
	}
	
	public boolean onTouchEvent(MotionEvent event){
		int action = event.getActionMasked();
		int actionIdex = event.getActionIndex();
		
		paddle1 = goTo((int)event.getX(), (int)event.getY());
		
		return true;
}



	private Actor goTo(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	};
		

	
	public void setAX(float x) {
	ax = x;
}

	public void setAY(float y) {
	ay = y;
}

	public void setAZ(float z) {
	az = z;
}

	public void onDraw(Canvas c) {
	paddle1.drawRect(c);
	paddle2.drawRect(c);
	ball.drawCircle(c);
	if (ball.isTouching(paddle1)){
		ball.bounceUp();
	}
	if (ball.isTouching(paddle2)){
			ball.bounceUp();
	}

	ball.move();
	ball.bounce(c);

	h.postDelayed (r, RATE);
	
	}
	
	private Runnable r = new Runnable() {

		@Override
		public void run() {
			// TODO Auto-generated method stub
			invalidate();
		}
	
	private void invalidate() {
			// TODO Auto-generated method stub
			
		}

	public boolean onTouchEvent(MotionEvent event) {
		
		int action = event.getActionMasked();
		int actionIdex = event.getActionIndex();
		
//		paddle1.goTo((int) event.getX(), 750);
		
		return true;
	}
	
};
	
}
	
