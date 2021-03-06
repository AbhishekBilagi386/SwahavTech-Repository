package com.monocept.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class ObserverFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ObserverFrame() {
		this.frameInit();
		JFrame frame = new JFrame("Frame Title");
		final JTextArea comp = new JTextArea();
		JButton btn = new JButton("click");
		frame.getContentPane().add(comp, BorderLayout.CENTER);
		frame.getContentPane().add(btn, BorderLayout.SOUTH);

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				comp.setText("Button has been clicked");
			}
		});

		int width = 300;
		int height = 300;
		frame.setSize(width, height);

		frame.setVisible(true);
	}

}
