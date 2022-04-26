package com.monocept.frame;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomeFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JFrame frame;
	JLabel label;

	public void renderFrame() {
		// frame = new JFrame("Welcome to Abhishek Built JFrame");

		label = new JLabel("Hello Says Abhishek.", JLabel.CENTER);

		frame.add(label);
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public WelcomeFrame(String text) {
		frame = new JFrame(text);
		renderFrame();

	}
}
