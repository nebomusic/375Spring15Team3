package com.example.minigames;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

public class AnimationViewConnect4 extends View {

	public int[][] board = new int[7][6];
	
	public AnimationViewConnect4(Context context, AttributeSet attrs) {
		super(context, attrs);
		
	} // end onCreate

	public boolean onTouchEvent(MotionEvent event){ 
		int action = event.getActionMasked(); 
		int actionIdex = event.getActionIndex(); 
		
		//paddle.goTo((int)event.getX(), 750);
		
	return true;
	} // end onTouchEvnet 
	
} // end class AnimationViewConnect4
