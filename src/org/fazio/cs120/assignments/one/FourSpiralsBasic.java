package org.fazio.cs120.assignments.one;

import aLibrary.DrawingTool;

/**
 * @author Michael Fazio <michael.fazio@kohls.com>
 * @since 3/7/12 4:00 PM
 */
public class FourSpiralsBasic {
	
	public FourSpiralsBasic() {
		DrawingTool toolA = new DrawingTool();
		DrawingTool toolB = new DrawingTool();
		DrawingTool toolC = new DrawingTool();
		DrawingTool toolD = new DrawingTool();

		toolA.dontDraw();
		toolB.dontDraw();
		toolC.dontDraw();
		toolD.dontDraw();
		
		toolB.turnClockwise();
		toolC.turnClockwise();
		toolC.turnClockwise();
		toolD.turnCounterclockwise();

		toolA.moveForwardBy(60);
		toolA.turnCounterclockwise();
		toolA.moveForwardBy(60);
		toolA.turnCounterclockwise();
		toolA.turnCounterclockwise();

		toolB.moveForwardBy(60);
		toolB.turnCounterclockwise();
		toolB.moveForwardBy(60);
		toolB.turnCounterclockwise();
		toolB.turnCounterclockwise();
		
		toolC.moveForwardBy(60);
		toolC.turnCounterclockwise();
		toolC.moveForwardBy(60);
		toolC.turnCounterclockwise();
		toolC.turnCounterclockwise();
		
		toolD.moveForwardBy(60);
		toolD.turnCounterclockwise();
		toolD.moveForwardBy(60);
		toolD.turnCounterclockwise();
		toolD.turnCounterclockwise();

		toolA.draw();
		toolB.draw();
		toolC.draw();
		toolD.draw();

		toolA.moveForwardBy(100);
		toolB.moveForwardBy(100);
		toolC.moveForwardBy(100);
		toolD.moveForwardBy(100);

		toolA.turnClockwise();
		toolB.turnClockwise();
		toolC.turnClockwise();
		toolD.turnClockwise();

		toolA.moveForwardBy(80);
		toolB.moveForwardBy(80);
		toolC.moveForwardBy(80);
		toolD.moveForwardBy(80);

		toolA.turnClockwise();
		toolB.turnClockwise();
		toolC.turnClockwise();
		toolD.turnClockwise();

		toolA.moveForwardBy(40);
		toolB.moveForwardBy(40);
		toolC.moveForwardBy(40);
		toolD.moveForwardBy(40);

		toolA.turnClockwise();
		toolB.turnClockwise();
		toolC.turnClockwise();
		toolD.turnClockwise();

		toolA.moveForwardBy(20);
		toolB.moveForwardBy(20);
		toolC.moveForwardBy(20);
		toolD.moveForwardBy(20);
	}
	
	public static void main(String[] args) {
		new FourSpiralsBasic();
	}

}
