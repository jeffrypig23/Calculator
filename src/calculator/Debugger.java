package calculator;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Debugger {
	public static void main(String[] args) {

		Debugger.Debugger_Window(true, 1);
	}

	public static void Debugger_Window(boolean show, int num) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame debug = new JFrame("Debugger");
		debug.setLayout(new GridLayout(5, 2));
		debug.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		JLabel booleaninfo = new JLabel("Values of all booleans: ", JLabel.LEFT);
		JLabel left_Filler = new JLabel(" ", JLabel.LEFT);
		JLabel right_Filler = new JLabel(" ", JLabel.RIGHT);
		JLabel numinfo = new JLabel("Values of all numbers: ", JLabel.RIGHT);
		
		for (int i = 0; i < num; i++) {
			//JLabel boolean + i = new JLabel("" + i +": ", JLabel.LEFT);
		}
		
		JLabel booleana = new JLabel("a: true", JLabel.LEFT);
		JLabel inta = new JLabel("a: 1", JLabel.RIGHT);
		JLabel booleanb = new JLabel("b: true", JLabel.LEFT);
		JLabel intb = new JLabel("b: 2", JLabel.RIGHT);
		JLabel booleanc = new JLabel("c: false", JLabel.LEFT);
		JLabel intc = new JLabel("c: 3", JLabel.RIGHT);

		debug.add(booleaninfo);
		debug.add(numinfo);
		debug.add(left_Filler);
		debug.add(right_Filler);
		debug.add(booleana);
		debug.add(inta);
		debug.add(booleanb);
		debug.add(intb);
		debug.add(booleanc);
		debug.add(intc);
		
		
		debug.pack();
		if (show == true) {

			debug.setVisible(true);
		} else {
			debug.setVisible(false);
		}
	}
	/*
	 * static class KeyPressed implements KeyListener { public void
	 * keyPressed(KeyEvent e) { // Do nothing }
	 * 
	 * public void keyTyped(KeyEvent e) { if (e.getKeyCode() == 123) {
	 * System.out.println("yay"); } }
	 * 
	 * public void keyReleased(KeyEvent e) { // Do nothing } }
	 */
}