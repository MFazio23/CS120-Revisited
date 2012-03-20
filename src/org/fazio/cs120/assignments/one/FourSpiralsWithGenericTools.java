package org.fazio.cs120.assignments.one;

import aLibrary.DrawingTool;

import java.util.Arrays;
import java.util.List;

/**
 * @author Michael Fazio
 */
public class FourSpiralsWithGenericTools {

	public FourSpiralsWithGenericTools() {
		List<DrawingTool> toolList = Arrays.asList(new DrawingTool(), new DrawingTool(), new DrawingTool(), new DrawingTool());

		int toolCount = 0;
		for(DrawingTool tool : toolList) {
			this.startingSetup(tool, toolCount);
			toolCount++;
		}

		for(DrawingTool tool : toolList) {
			tool.moveForwardBy(100);
			tool.turnClockwise();
		}

		for(DrawingTool tool : toolList) {
			tool.moveForwardBy(80);
			tool.turnClockwise();
		}

		for(DrawingTool tool : toolList) {
			tool.moveForwardBy(40);
			tool.turnClockwise();
		}

		for(DrawingTool tool : toolList) {
			tool.moveForwardBy(20);
			tool.turnClockwise();
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
		new FourSpiralsWithGenericTools();
	}
}
