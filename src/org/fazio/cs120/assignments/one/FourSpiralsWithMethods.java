package org.fazio.cs120.assignments.one;

import aLibrary.DrawingTool;

/**
 * @author Michael Fazio
 */
public class FourSpiralsWithMethods {
	
	public FourSpiralsWithMethods() {

		DrawingTool toolA = new DrawingTool();
		DrawingTool toolB = new DrawingTool();
		DrawingTool toolC = new DrawingTool();
		DrawingTool toolD = new DrawingTool();

		toolB.turnClockwise();
		toolC.turnClockwise();
		toolC.turnClockwise();
		toolD.turnCounterclockwise();

		startingSetup(toolA);

		startingSetup(toolB);

		startingSetup(toolC);

		startingSetup(toolD);

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

	private void startingSetup(DrawingTool tool) {
		tool.dontDraw();
		tool.moveForwardBy(60);
		tool.turnCounterclockwise();
		tool.moveForwardBy(60);
		tool.turnCounterclockwise();
		tool.turnCounterclockwise();
		tool.draw();
	}

	public static void main(String[] args) {
		new FourSpiralsWithMethods();
	}
	
}
