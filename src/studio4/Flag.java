package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor(145,201,104);
		StdDraw.filledRectangle(11, 8, 11, 8);
		StdDraw.setPenColor(210,64,181);
		StdDraw.filledRectangle(11, 8, 11, 6);
		StdDraw.filledRectangle(11, 8, 9, 8);
		StdDraw.setPenColor(14,150,92);
		StdDraw.filledCircle(11, 8, 3);

		
	}
}