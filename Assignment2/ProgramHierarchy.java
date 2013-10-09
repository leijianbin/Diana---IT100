/*
 * File: ProgramHierarchy.java
 * Name: 
 * Section Leader: 
 * ---------------------------
 * This draws the diagram for Program Hierarchy.
 * Each label's rectangle is defined by posx and posy as the top left corner of the GRect.
 * Variables i and j are the values for the center of the rectangle based on posx and posy.
 * Variables posA and posB define the bottom left position of the GLabel.
 * The connecting lines all start at the top label's bottom middle position
 * and connect to the child labels' top middle positions.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {
	/** Width of label in pixels */
	private static final int labelWidth = 120;

	/** Height of label in pixels */
	private static final int labelHeight = 30;

	public void run() {
		//get window center position
		int centerx = getWidth()/2;
		int centery = getHeight()/2;

		//center label
		double posx1 = centerx - labelWidth/2;
		double posy1 = centery;

		GRect labelBox1 = new GRect(posx1, posy1, labelWidth,labelHeight);
		add(labelBox1);//draws rectangle
		GLabel labelVal1 = new GLabel("ConsoleProgram");
		double i1 = (posx1 + labelWidth/2);
		double j1 = (posy1 + labelHeight/2);
		double posA1 = i1 - (labelVal1.getWidth()/2);
		double posB1 = j1 + (labelVal1.getAscent()/2);
		labelVal1.setLocation(posA1,posB1);
		add(labelVal1);//prints text

		//top label
		double posx0 = centerx - labelWidth/2;
		double posy0 = centery - 2*labelHeight;

		GRect labelBox0 = new GRect(posx0, posy0, labelWidth,labelHeight);
		add(labelBox0);
		GLabel labelVal0 = new GLabel("Program");
		double i0 = (posx0 + labelWidth/2);
		double j0 = (posy0 + labelHeight/2);
		double posA0 = i0 - (labelVal0.getWidth()/2);
		double posB0 = j0 + (labelVal0.getAscent()/2);
		labelVal0.setLocation(posA0,posB0);
		add(labelVal0);

		//center label left
		double posx2 = centerx - 1.75*labelWidth;
		double posy2 = centery;

		GRect labelBox2 = new GRect(posx2, posy2, labelWidth,labelHeight);
		add(labelBox2);
		GLabel labelVal2 = new GLabel("GraphicsProgram");
		double i2 = (posx2 + labelWidth/2);
		double j2 = (posy2 + labelHeight/2);
		double posA2 = i2 - (labelVal2.getWidth()/2);
		double posB2 = j2 + (labelVal2.getAscent()/2);
		labelVal2.setLocation(posA2,posB2);
		add(labelVal2);

		//center label right
		double posx3 = centerx + .75*labelWidth;
		double posy3 = centery;

		GRect labelBox3 = new GRect(posx3, posy3, labelWidth,labelHeight);
		add(labelBox3);
		GLabel labelVal3 = new GLabel("DialogProgram");
		double i3 = (posx3 + labelWidth/2);
		double j3 = (posy3 + labelHeight/2);
		double posA3 = i3 - (labelVal3.getWidth()/2);
		double posB3 = j3 + (labelVal3.getAscent()/2);
		labelVal3.setLocation(posA3,posB3);
		add(labelVal3);

		//draw connecting lines
		GLine line1 = new GLine(i0,(j0+labelHeight/2),i1,(j1-labelHeight/2));
		add(line1);//top label connects to bottom center label
		GLine line2 = new GLine(i0,(j0+labelHeight/2),i2,(j2-labelHeight/2));
		add(line2);//top label connects to bottom left label
		GLine line3 = new GLine(i0,(j0+labelHeight/2),i3,(j3-labelHeight/2));
		add(line3);//top label connects to bottom right label
	}
}

