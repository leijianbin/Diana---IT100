/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy_test extends GraphicsProgram {
	/** Width of label in pixels */
	private static final int labelWidth = 120;

	/** Height of label in pixels */
	private static final int labelHeight = 30;
	

	//get window center position
	private int centerx = getWidth()/2;
	private int centery = getHeight()/2;
	
	private GLabel makeLabel(GLabel label) {
		//center label
		double posx = centerx - labelWidth/2;
		double posy = centery;
		
		GRect labelBox = new GRect(posx, posy, labelWidth,labelHeight);
		add(labelBox);//draws rectangle
		GLabel labelVal = label;
		double i = (posx + labelWidth/2);
		double j = (posy + labelHeight/2);
		double posA = i - (labelVal.getWidth()/2);
		double posB = j + (labelVal.getAscent()/2);
		labelVal.setLocation(posA,posB);
		add(labelVal);//prints text
		return labelVal;
	}
	
	public void run() {
		
		makeLabel(new GLabel("ConsoleProgram"));
		
	}
}

