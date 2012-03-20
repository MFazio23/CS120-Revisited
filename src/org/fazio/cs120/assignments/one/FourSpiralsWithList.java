package org.fazio.cs120.assignments.one;

import aLibrary.DrawingTool;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Michael Fazio
 */
public class FourSpiralsWithList {
	
	public FourSpiralsWithList() {
		DrawingTool toolA = new DrawingTool();
		DrawingTool toolB = new DrawingTool();
		DrawingTool toolC = new DrawingTool();
		DrawingTool toolD = new DrawingTool();

		toolB.turnClockwise();
		toolC.turnClockwise();
		toolC.turnClockwise();
		toolD.turnCounterclockwise();
		
		List<DrawingTool> toolList = new LinkedList<DrawingTool>();

		toolList.add(toolA);
		toolList.add(toolB);
		toolList.add(toolC);
		toolList.add(toolD);

		for(DrawingTool tool : toolList) {
			this.startingSetup(tool);
		}

		for(DrawingTool tool : toolList) tool.moveForwardBy(100);
		for(DrawingTool tool : toolList) tool.turnClockwise();
		for(DrawingTool tool : toolList) tool.moveForwardBy(80);
		for(DrawingTool tool : toolList) tool.turnClockwise();
		for(DrawingTool tool : toolList) tool.moveForwardBy(40);
		for(DrawingTool tool : toolList) tool.turnClockwise();
		for(DrawingTool tool : toolList) tool.moveForwardBy(20);
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
		new FourSpiralsWithList();
	}
	
}
