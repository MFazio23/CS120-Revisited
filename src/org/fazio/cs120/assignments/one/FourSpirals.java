package org.fazio.cs120.assignments.one;

import aLibrary.DrawingTool;

/**
 * @author Michael Fazio <michael.fazio@kohls.com>
 * @since 3/7/12 4:00 PM
 */
public class FourSpirals {

	//AWindow window;
	aLibrary.DrawingTool tool;
	
	public FourSpirals() {
		//this.window = new AWindow(10, 10, 200, 200);
		this.tool = new DrawingTool();
		this.tool.draw();
		this.tool.moveForwardBy(40);
		this.tool.turnClockwise();
		this.tool.moveForwardBy(10);
		this.tool.turnClockwise();
		this.tool.moveForwardBy(20);

	}
	
	public static void main(String[] args) {
		new FourSpirals();
	}

}