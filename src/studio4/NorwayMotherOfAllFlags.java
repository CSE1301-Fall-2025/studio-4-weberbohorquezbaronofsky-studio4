package studio4;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor(0,38,84);
		StdDraw.filledRectangle(22/6.0, 8, 22/6.0, 8);
		StdDraw.setPenColor(206,17,38);
		StdDraw.filledRectangle(22-22/6.0, 8, 22/6.0, 8);
		
	}

	public static void indonesia() {
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(11, 12, 11, 4);
		// 
	}

	public static void netherlands() {
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor(173,29,37);
		StdDraw.filledRectangle(11, 16-16/6.0, 11, 16/6.0);
		StdDraw.setPenColor(30,71,133);
		StdDraw.filledRectangle(11, 16/6.0, 11, 16/6.0);
		// TODO
	}

	public static void poland() {
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor(255,0,0);
		StdDraw.filledRectangle(11, 4, 11, 4);
		// TODO
	}

	public static void thailand() {
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor(165,25,49);
		StdDraw.filledRectangle(11, 16-16/12.0, 11, 16/12.0);
		StdDraw.filledRectangle(11, 16/12.0, 11, 16/12.0);
		StdDraw.setPenColor(45,42,74);
		StdDraw.filledRectangle(11, 8, 11, 16/6.0);
		// TODO
	}

	public static void finland() {
		StdDraw.clear();
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.setPenColor(0,47,108);
		StdDraw.filledRectangle(11, 8, 11, 2);
		StdDraw.filledRectangle(8, 8, 2, 8);
		// TODO
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						indonesia();
						if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
								JOptionPane.QUESTION_MESSAGE, options)) {
							netherlands();
							if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
									JOptionPane.QUESTION_MESSAGE, options)) {
								poland();
								if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
										JOptionPane.QUESTION_MESSAGE, options)) {
									thailand();
									if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
											JOptionPane.QUESTION_MESSAGE, options)) {
										finland();
										if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
											// pass
										} else {
											continue;
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}
