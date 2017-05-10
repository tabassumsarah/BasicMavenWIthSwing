package com.sarah;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 * Just a swing version of Hello World!
 *
 */

public final class App {

	public static void main(final String[] args) {
		App app = new App();
		app.buildAndDisplayGui();
	}

	private void buildAndDisplayGui() {
		JFrame frame = new JFrame("Basic Swing App");
		JLabel label = new JLabel("Hello World");

		frame.setMinimumSize(new Dimension(320, 200));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setLocation(400, 300);
		frame.getContentPane().add(label);
		frame.setVisible(true);
	}

}
