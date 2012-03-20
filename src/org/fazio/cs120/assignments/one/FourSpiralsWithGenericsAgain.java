package org.fazio.cs120.assignments.one;

import aLibrary.DrawingTool;

import java.util.Arrays;
import java.util.List;

/**
 * @author Michael Fazio
 */
public class FourSpiralsWithGenericsAgain {

	public FourSpiralsWithGenericsAgain() {
		List<DrawingTool> toolList = Arrays.asList(new DrawingTool(), new DrawingTool(), new DrawingTool(), new DrawingTool());

		int toolCount = 0;
		for(DrawingTool tool : toolList) {
			this.startingSetup(tool, toolCount);
			toolCount++;
		}

		for(int distance : new int[]{100, 80, 40, 20}) {
			for(DrawingTool tool : toolList) {
				tool.moveForwardBy(distance);
				tool.turnClockwise();
			}
		}
	}

	private void startingSetup(DrawingTool tool, int toolCount) {

		for(int x=0;x<toolCount;x++) tool.turnClockwise();

		tool.dontDraw();
		tool.moveForwardBy(60);
		tool.turnCounterclockwise();
		tool.moveForwardBy(60);
		tool.turnCounterclockwise();
		tool.turnCounterclockwise();
		tool.draw();
	}

	public static void main(String[] args) {
		new FourSpiralsWithGenericsAgain();
	}
}
