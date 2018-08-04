package calculator;
/*
 * Author: Stephen Ogden
 * 
 */

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator {
	final static String info = "Calculator launcher v2.4";
	
	static boolean debug = false;
	static boolean updated = false;
	static boolean set = false;
	
	static long final_answer = 0;
	static long calculated = 0;
	
	static byte mode = 0;
	
	static Error1 error = new Error1();
	static Basic basic = new Basic();
	static Matrix matrix = new Matrix();

	// half of a long is 1,073,741,824
	public static void main(String[] args) throws Exception {
		// /*
		debug = Calculator.debug();
		while (updated == false) {
			Thread.sleep(300);
		}
		// */

		Calculator.Selector();

	}

	public static boolean debug() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame debug_window = new JFrame(info);
		debug_window.setLayout(new GridLayout(3, 1));

		JLabel message = new JLabel("Would you like to enable debug mode for developmental purposes?", JLabel.CENTER);
		JButton Yes = new JButton("YES");
		JButton No = new JButton("NO");

		debug_window.add(message);
		debug_window.add(Yes);
		debug_window.add(No);
		debug_window.pack();

		debug_window.setVisible(true);

		Yes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				debug = true;
				debug_window.setVisible(false);
				// System.out.println("Debugger enabled");
				// System.out.println("Value of debug: " +
				// String.valueOf(debug));
				updated = true;
			}
		});
		No.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// This should still be false
				debug_window.setVisible(false);
				updated = true;
			}
		});

		debug_window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		return debug;

	}

	/* public static void Basic() {
		try {

			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame debugw = new JFrame("debugw");

			debugw.setLayout(new GridLayout(5, 2));
			debugw.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

			JLabel booleaninfo = new JLabel("Values of all booleans:\n", JLabel.LEFT);
			JLabel numinfo = new JLabel("Values of all numbers:\n", JLabel.RIGHT);
			JLabel left = new JLabel("", JLabel.LEFT);
			JLabel right = new JLabel("", JLabel.RIGHT);
			JLabel debuginfo = new JLabel("debug: " + debug, JLabel.LEFT);
			JLabel final_answerinfo = new JLabel("final_answer: " + final_answer, JLabel.RIGHT);
			JLabel updatedinfo = new JLabel("updated: " + updated, JLabel.LEFT);
			JLabel calculatedinfo = new JLabel("calculated: " + calculated, JLabel.RIGHT);
			JLabel setinfo = new JLabel("set: " + set, JLabel.LEFT);
			JLabel modeinfo = new JLabel("mode: " + mode, JLabel.RIGHT);
			// JLabel console = new JLabel("", JLabel.LEFT);

			debugw.add(booleaninfo);
			debugw.add(numinfo);
			debugw.add(left);
			debugw.add(right);
			debugw.add(debuginfo);
			debugw.add(final_answerinfo);
			debugw.add(updatedinfo);
			debugw.add(calculatedinfo);
			debugw.add(setinfo);
			debugw.add(modeinfo);

			debugw.pack();
			debugw.setVisible(debug);

			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame Basic = new JFrame("Basic Calculator");
			Basic.setLayout(new GridLayout(5, 4));
			String final_ans = String.valueOf(final_answer);

			JLabel left_filler = new JLabel(" ", JLabel.LEFT);
			JLabel center_filler = new JLabel(" ", JLabel.CENTER);
			JLabel another_filler = new JLabel(" ", JLabel.CENTER);
			JLabel ans = new JLabel(final_ans, JLabel.RIGHT);
			ans.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JButton one = new JButton("1");
			JButton two = new JButton("2");
			JButton three = new JButton("3");
			JButton clear = new JButton("AC");
			JButton four = new JButton("4");
			JButton five = new JButton("5");
			JButton six = new JButton("6");
			JButton plus = new JButton("+");
			JButton seven = new JButton("7");
			JButton eight = new JButton("8");
			JButton nine = new JButton("9");
			JButton minus = new JButton("-");
			JButton multiply = new JButton("x");
			JButton zero = new JButton("0");
			JButton divide = new JButton("÷");
			JButton equals = new JButton("=");

			Basic.add(left_filler);
			Basic.add(center_filler);
			Basic.add(another_filler);
			Basic.add(ans);
			Basic.add(one);
			Basic.add(two);
			Basic.add(three);
			Basic.add(plus);
			Basic.add(four);
			Basic.add(five);
			Basic.add(six);
			Basic.add(minus);
			Basic.add(seven);
			Basic.add(eight);
			Basic.add(nine);
			Basic.add(multiply);
			Basic.add(clear);
			Basic.add(zero);
			Basic.add(equals);
			Basic.add(divide);
			Basic.pack();
			Basic.setVisible(true);

			one.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 1;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});
			two.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 2;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});
			three.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 3;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});
			clear.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = 0;
					calculated = 0;
					set = false;
					mode = 0;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
					calculatedinfo.setText("calculated: " + calculated);
					setinfo.setText("set: " + set);
					modeinfo.setText("mode: " + mode);
				}
			});
			four.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 4;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});
			five.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 5;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});
			six.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 6;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});
			plus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (set == false) {
						calculated = final_answer;
						set = true;
						final_answer = 0;
						mode = 1;
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
						ans.setText("" + final_answer);
					} else {
						if (mode == 1) {
							final_answer = calculated + final_answer;
						} else if (mode == 2) {
							final_answer = calculated - final_answer;
						} else if (mode == 3) {
							final_answer = calculated * final_answer;
						} else if (mode == 4) {
							final_answer = calculated / final_answer;
						} else {
							error.Error();
						}
						ans.setText("" + final_answer);
						calculated = final_answer;
						final_answer = 0;
						mode = 1;
						if (debug == true) {
							final_answerinfo.setText("final_answer: " + final_answer);
							calculatedinfo.setText("calculated: " + calculated);
							setinfo.setText("set: " + set);
							modeinfo.setText("mode: " + mode);
						}
						ans.setText("" + final_answer);
					}
				}
			});
			seven.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 7;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});
			eight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 8;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});
			nine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 9;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});
			minus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (set == false) {
						calculated = final_answer;
						set = true;
						final_answer = 0;
						mode = 2;
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
						ans.setText("" + final_answer);
					} else {
						if (mode == 1) {
							final_answer = calculated + final_answer;
						} else if (mode == 2) {
							final_answer = calculated - final_answer;
						} else if (mode == 3) {
							final_answer = calculated * final_answer;
						} else if (mode == 4) {
							final_answer = calculated / final_answer;
						} else {
							error.Error();
						}
						ans.setText("" + final_answer);
						calculated = final_answer;
						final_answer = 0;
						mode = 2;
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
						ans.setText("" + final_answer);
					}
				}
			});
			multiply.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (set == false) {
						calculated = final_answer;
						set = true;
						final_answer = 0;
						mode = 3;
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
						ans.setText("" + final_answer);
					} else {
						if (mode == 1) {
							final_answer = calculated + final_answer;
						} else if (mode == 2) {
							final_answer = calculated - final_answer;
						} else if (mode == 3) {
							final_answer = calculated * final_answer;
						} else if (mode == 4) {
							final_answer = calculated / final_answer;
						} else {
							error.Error();
						}
						ans.setText("" + final_answer);
						calculated = final_answer;
						final_answer = 0;
						mode = 3;
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
						ans.setText("" + final_answer);
					}
				}
			});
			zero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});
			divide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (set == false) {
						calculated = final_answer;
						set = true;
						final_answer = 0;
						mode = 4;
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
						ans.setText("" + final_answer);
					} else {
						if (mode == 1) {
							final_answer = calculated + final_answer;
						} else if (mode == 2) {
							final_answer = calculated - final_answer;
						} else if (mode == 3) {
							final_answer = calculated * final_answer;
						} else if (mode == 4) {
							final_answer = calculated / final_answer;
						} else {
							error.Error();
						}
						ans.setText("" + final_answer);
						calculated = final_answer;
						final_answer = 0;
						mode = 4;
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
						ans.setText("" + final_answer);
					}
				}
			});
			equals.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (mode == 1) {
						final_answer = calculated + final_answer;
						final_answerinfo.setText("final_answer: " + final_answer);
					} else if (mode == 2) {
						final_answer = calculated - final_answer;
						final_answerinfo.setText("final_answer: " + final_answer);
					} else if (mode == 3) {
						final_answer = calculated * final_answer;
						final_answerinfo.setText("final_answer: " + final_answer);
					} else if (mode == 4) {
						final_answer = calculated / final_answer;
						final_answerinfo.setText("final_answer: " + final_answer);
					} else {
						error.Error();
					}
					ans.setText("" + final_answer);
					set = false;
					calculated = 0;
					mode = 0;
					calculatedinfo.setText("calculated: " + calculated);
					setinfo.setText("set: " + set);
					modeinfo.setText("mode: " + mode);
				}
			});

			Basic.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		} catch (Exception e) {
			error.Error();
		}
	} */

	/* public static void Matrix() {
		try {
			JFrame.setDefaultLookAndFeelDecorated(true);
			JFrame Matrix = new JFrame("Matrix Calculator");
			Matrix.setLayout(new GridLayout(3, 11));

			JTextArea one_one = new JTextArea("_");
			one_one.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea one_two = new JTextArea("_");
			one_two.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea one_three = new JTextArea("_");
			one_three.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JButton plus = new JButton("+");
			plus.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea one_four = new JTextArea("_");
			one_four.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea one_five = new JTextArea("_");
			one_five.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea one_six = new JTextArea("_");
			one_six.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel top_filler = new JLabel(" ");
			top_filler.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel ans_one_one = new JLabel("_");
			ans_one_one.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel ans_one_two = new JLabel("_");
			ans_one_two.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel ans_one_three = new JLabel("_");
			ans_one_three.setFont(new Font(Font.SERIF, Font.PLAIN, 20));

			JTextArea two_one = new JTextArea("_");
			two_one.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea two_two = new JTextArea("_");
			two_two.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea two_three = new JTextArea("_");
			two_three.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JButton minus = new JButton("-");
			minus.setFont(new Font(Font.SERIF, Font.PLAIN, 30));
			JTextArea two_four = new JTextArea("_");
			two_four.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea two_five = new JTextArea("_");
			two_five.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea two_six = new JTextArea("_");
			two_six.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel equals = new JLabel("=");
			equals.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel ans_two_one = new JLabel("_");
			ans_two_one.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel ans_two_two = new JLabel("_");
			ans_two_two.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel ans_two_three = new JLabel("_");
			ans_two_three.setFont(new Font(Font.SERIF, Font.PLAIN, 20));

			JTextArea three_one = new JTextArea("_");
			three_one.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea three_two = new JTextArea("_");
			three_two.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea three_three = new JTextArea("_");
			three_three.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JButton multiply = new JButton("X");
			multiply.setFont(new Font(Font.SERIF, Font.PLAIN, 15));
			JTextArea three_four = new JTextArea("_");
			three_four.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea three_five = new JTextArea("_");
			three_five.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JTextArea three_six = new JTextArea("_");
			three_six.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel bottom_filler = new JLabel(" ");
			bottom_filler.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel ans_three_one = new JLabel("_");
			ans_three_one.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel ans_three_two = new JLabel("_");
			ans_three_two.setFont(new Font(Font.SERIF, Font.PLAIN, 20));
			JLabel ans_three_three = new JLabel("_");
			ans_three_three.setFont(new Font(Font.SERIF, Font.PLAIN, 20));

			Matrix.add(one_one);
			Matrix.add(one_two);
			Matrix.add(one_three);
			Matrix.add(plus);
			Matrix.add(one_four);
			Matrix.add(one_five);
			Matrix.add(one_six);
			Matrix.add(top_filler);
			Matrix.add(ans_one_one);
			Matrix.add(ans_one_two);
			Matrix.add(ans_one_three);
			Matrix.add(two_one);
			Matrix.add(two_two);
			Matrix.add(two_three);
			Matrix.add(minus);
			Matrix.add(two_four);
			Matrix.add(two_five);
			Matrix.add(two_six);
			Matrix.add(equals);
			Matrix.add(ans_two_one);
			Matrix.add(ans_two_two);
			Matrix.add(ans_two_three);
			Matrix.add(three_one);
			Matrix.add(three_two);
			Matrix.add(three_three);
			Matrix.add(multiply);
			Matrix.add(three_four);
			Matrix.add(three_five);
			Matrix.add(three_six);
			Matrix.add(bottom_filler);
			Matrix.add(ans_three_one);
			Matrix.add(ans_three_two);
			Matrix.add(ans_three_three);

			Matrix.pack();
			Matrix.setVisible(true);
			Matrix.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			*/
			/*
			String size1 = JOptionPane.showInputDialog(null,
					"Enter the amount of rows for the first matrix (1-3)\n\n(Example:  For a 2x1 matrix, you would enter a 2)\n\n _   x   X");
			int siz1 = Integer.parseInt(size1);
			String size2 = JOptionPane.showInputDialog(null,
					"Enter the amount of columns for the first matrix (1-3)\n\n(Example:  For a 2x1 matrix, you would enter a 1)\n\n"
							+ siz1 + "   x   _");
			int siz2 = Integer.parseInt(size2);
			if (siz1 <= 0) {
				String message = "An error has occured.\nThe number you have entered is too small!";
				JOptionPane.showMessageDialog(new JFrame(), message, "Error", JOptionPane.WARNING_MESSAGE);
				System.out.println("Too small");
			} else if (siz1 >= 4) {
				String message = "An error has occured.\nThe number you have entered is too big";
				JOptionPane.showMessageDialog(new JFrame(), message, "Error", JOptionPane.WARNING_MESSAGE);
				System.out.println("Too big");
			} else if (siz2 <= 0) {
				System.out.println("Too small");
			} else if (siz2 >= 4) {
				System.out.println("Too big");
			} else if (siz1 == 1 && siz2 == 1) {
				String input1 = JOptionPane.showInputDialog(null, "Enter the first number in the matrix\n\n_");
				int num1 = Integer.parseInt(input1);
				String[] matrixbuttons = { "Addition", "Subtraction", "Multiplication" };
				int matrixbuttonreturned = JOptionPane.showOptionDialog(null, "Choose an operation", "Operation",
						JOptionPane.WARNING_MESSAGE, 0, null, matrixbuttons, matrixbuttons[2]);
				if (debug == true) {
					System.out.println("Value of matrixbuttonreturned:  " + String.valueOf(matrixbuttonreturned));
				}
				String input2 = JOptionPane.showInputDialog(null, "Enter the first number in the second matrix\n\n_");
				int num2 = Integer.parseInt(input2);
				if (matrixbuttonreturned == 0) {
					int ans1 = num1 + num2;
					String message = "The final value is:  \n\n" + String.valueOf(ans1);
					JOptionPane.showMessageDialog(new JFrame(), message, "Answer", JOptionPane.INFORMATION_MESSAGE);
				} else if (matrixbuttonreturned == 1) {
					int ans1 = num1 - num2;
					String message = "The final value is:  \n\n" + String.valueOf(ans1);
					JOptionPane.showMessageDialog(new JFrame(), message, "Answer", JOptionPane.INFORMATION_MESSAGE);
				} else if (matrixbuttonreturned == 2) {
					int ans1 = num1 * num2;
					String message = "The final value is:  \n\n" + String.valueOf(ans1);
					JOptionPane.showMessageDialog(new JFrame(), message, "Answer", JOptionPane.INFORMATION_MESSAGE);
				} else {
					error.Error();
				}
			} else if (siz1 == 1 && siz2 == 2) {
				// 1x2
				// String input1
			} else if (siz1 == 1 && siz2 == 3) {
				// 1x3
			} else if (siz1 == 2 && siz2 == 1) {
				// 2x1
			} else if (siz1 == 2 && siz2 == 2) {
				String input1 = JOptionPane.showInputDialog(null,
						"Enter the first number in the matrix (top left)\n\n_   X\nX   X");
				int num1 = Integer.parseInt(input1);
				String input2 = JOptionPane.showInputDialog(null,
						"Enter the second number in the matrix (top right)\n\n" + num1 + "   _\nX   X");
				int num2 = Integer.parseInt(input2);
				String input3 = JOptionPane.showInputDialog(null,
						"Enter the third number in the matrix (bottom left)\n\n" + num1 + "   " + num2 + "\n_   X");
				int num3 = Integer.parseInt(input3);
				String input4 = JOptionPane.showInputDialog(null,
						"Enter the fourth number in the marix (bottom right)\n\n" + num1 + "   " + num2 + "\n" + num3
								+ "   _");
				int num4 = Integer.parseInt(input4);
				String[] matrixbuttons = { "Addition", "Subtraction", "Multiplication" };
				int matrixbuttonreturned = JOptionPane.showOptionDialog(null, "Choose an operation", "Operation",
						JOptionPane.WARNING_MESSAGE, 0, null, matrixbuttons, matrixbuttons[2]);
				if (debug == true) {
					System.out.println("Value of matrixbuttonreturned:  " + String.valueOf(matrixbuttonreturned));
				}
				String input5 = JOptionPane.showInputDialog(null,
						"Enter the first number in the second matrix (top left)\n\n_   X\nX   X");
				int num5 = Integer.parseInt(input5);
				String input6 = JOptionPane.showInputDialog(null,
						"Enter the second number in the second matrix (top right)\n\n" + num5 + "   _\nX   X");
				int num6 = Integer.parseInt(input6);
				String input7 = JOptionPane.showInputDialog(null,
						"Enter the third number in the second matrix (bottom left)\n\n" + num5 + "   " + num6
								+ "\n_   X");
				int num7 = Integer.parseInt(input7);
				String input8 = JOptionPane.showInputDialog(null,
						"Enter the fourth number in the matrix (bottom right)\n\n" + num5 + "   " + num6 + "\n" + num7
								+ "   _");
				int num8 = Integer.parseInt(input8);
				if (matrixbuttonreturned == 0) {
					int ans1 = num1 + num5, ans2 = num2 + num6, ans3 = num3 + num7, ans4 = num4 + num8;
					String message = "The final value is:  \n\n" + String.valueOf(ans1) + "   " + String.valueOf(ans2)
							+ " \n" + String.valueOf(ans3) + "   " + String.valueOf(ans4);
					JOptionPane.showMessageDialog(new JFrame(), message, "Answer", JOptionPane.INFORMATION_MESSAGE);
				} else if (matrixbuttonreturned == 1) {
					int ans1 = num1 - num5, ans2 = num2 - num6, ans3 = num3 - num7, ans4 = num4 - num8;
					String message = "The final value is:  \n\n" + String.valueOf(ans1) + "   " + String.valueOf(ans2)
							+ "\n" + String.valueOf(ans3) + "   " + String.valueOf(ans4);
					JOptionPane.showMessageDialog(new JFrame(), message, "Answer", JOptionPane.INFORMATION_MESSAGE);
				} else if (matrixbuttonreturned == 2) {
					int ans1 = num1 * num5 + num2 * num7, ans2 = num1 * num6 + num2 * num8,
							ans3 = num3 * num5 + num4 * num7, ans4 = num3 * num6 + num4 * num8;
					String message = "The final value is:  \n\n" + String.valueOf(ans1) + "   " + String.valueOf(ans2)
							+ "\n" + String.valueOf(ans3) + "   " + String.valueOf(ans4);
					JOptionPane.showMessageDialog(new JFrame(), message, "Answer", JOptionPane.INFORMATION_MESSAGE);
				} else {
					error.Error();
				}

			} else if (siz1 == 2 && siz2 == 3) {
				// 2x3\
			} else if (siz1 == 3 && siz2 == 1) {
				// 3x1
			} else if (siz1 == 3 && siz2 == 2) {
				// 3x2
			} else if (siz1 == 3 && siz2 == 3) {
				String input1 = JOptionPane.showInputDialog(null,
						"Enter the first number in the matrix (top left)\n\n_   X   X \nX   X   X\nX   X   X");
				int num1 = Integer.parseInt(input1);
				String input2 = JOptionPane.showInputDialog(null,
						"Enter the second number in the matrix (top middle)\n\n" + num1
								+ "   _   X\nX   X   X\nX   X   X");
				int num2 = Integer.parseInt(input2);
				String input3 = JOptionPane.showInputDialog(null, "Enter the third number in the matrix (top right)\n\n"
						+ num1 + "   " + num2 + "   _\nX   X   X\nX   X   X");
				int num3 = Integer.parseInt(input3);
				String input4 = JOptionPane.showInputDialog(null,
						"Enter the fourth number in the matrix (middle left)\n\n" + num1 + "   " + num2 + "   " + num3
								+ "\n_   X   X\nX   X   X");
				int num4 = Integer.parseInt(input4);
				String input5 = JOptionPane.showInputDialog(null,
						"Enter the fifth number in the matrix (middle middle)\n\n" + num1 + "   " + num2 + "   " + num3
								+ "\n" + num4 + "   _   X\nX   X   X");
				int num5 = Integer.parseInt(input5);
				String input6 = JOptionPane.showInputDialog(null,
						"Enter the sixth number in the matrix (middle right)\n\n" + num1 + "   " + num2 + "   " + num3
								+ "\n" + num4 + "   " + num5 + "   _  \nX   X   X");
				int num6 = Integer.parseInt(input6);
				String input7 = JOptionPane.showInputDialog(null,
						"Enter the seventh number in the matrix (bottom left)\n\n" + num1 + "   " + num2 + "   " + num3
								+ "\n" + num4 + "   " + num5 + "   " + num6 + "\n_   X   X");
				int num7 = Integer.parseInt(input7);
				String input8 = JOptionPane.showInputDialog(null,
						"Enter the eighth number in the matrix (bottom middle)\n\n" + num1 + "   " + num2 + "   " + num3
								+ "\n" + num4 + "   " + num5 + "   " + num6 + "\n" + num7 + "   _   X");
				int num8 = Integer.parseInt(input8);
				String input9 = JOptionPane.showInputDialog(null,
						"Enter the ninth number in the matrix (bottom right)\n\n" + num1 + "   " + num2 + "   " + num3
								+ "\n" + num4 + "   " + num5 + "   " + num6 + "\n" + num7 + "   " + num8 + "   _");
				int num9 = Integer.parseInt(input9);
				String[] matrixbuttons = { "Addition", "Subtraction", "Multiplication" };
				int matrixbuttonreturned = JOptionPane.showOptionDialog(null, "Choose an operation", "Operation",
						JOptionPane.WARNING_MESSAGE, 0, null, matrixbuttons, matrixbuttons[2]);
				if (debug == true) {
					System.out.println("Value of matrixbuttonreturned:  " + String.valueOf(matrixbuttonreturned));
				}
				String input10 = JOptionPane.showInputDialog(null,
						"Enter the first number in the matrix (top left)\n\n_   X   X\nX   X   X\nX   X   X");
				int num10 = Integer.parseInt(input10);
				String input11 = JOptionPane.showInputDialog(null,
						"Enter the second number in the matrix (top middle)\n\n" + num10
								+ "   _   X\nX   X   X\nX   X   X");
				int num11 = Integer.parseInt(input11);
				String input12 = JOptionPane.showInputDialog(null,
						"Enter the third number in the matrix (top right)\n\n" + num10 + "   " + num11
								+ "   _\nX   X   X\nX   X   X");
				int num12 = Integer.parseInt(input12);
				String input13 = JOptionPane.showInputDialog(null,
						"Enter the fourth number in the matrix (middle left)\n\n" + num10 + "   " + num11 + "   "
								+ num12 + "\n_   X   X\nX   X   X");
				int num13 = Integer.parseInt(input13);
				String input14 = JOptionPane.showInputDialog(null,
						"Enter the fifth number in the matrix (middle middle)\n\n" + num10 + "   " + num11 + "   "
								+ num12 + "\n" + num13 + "   _   X\nX   X   X");
				int num14 = Integer.parseInt(input14);
				String input15 = JOptionPane.showInputDialog(null,
						"Enter the sixth number in the matrix (middle right)\n\n" + num10 + "   " + num11 + "   "
								+ num12 + "\n" + num13 + "   " + num14 + "   _  \nX   X   X");
				int num15 = Integer.parseInt(input15);
				String input16 = JOptionPane.showInputDialog(null,
						"Enter the seventh number in the matrix (bottom left)\n\n" + num10 + "   " + num11 + "   "
								+ num12 + "\n" + num13 + "   " + num14 + "   " + num15 + "\n_   X   X");
				int num16 = Integer.parseInt(input16);
				String input17 = JOptionPane.showInputDialog(null,
						"Enter the eighth number in the matrix (bottom middle)\n\n" + num10 + "   " + num11 + "   "
								+ num12 + "\n" + num13 + "   " + num14 + "   " + num15 + "\n" + num16 + "   _   X");
				int num17 = Integer.parseInt(input17);
				String input18 = JOptionPane.showInputDialog(null,
						"Enter the ninth number in the matrix (bottom right)\n\n" + num10 + "   " + num11 + "   "
								+ num12 + "\n" + num13 + "   " + num14 + "   " + num15 + "\n" + num16 + "   " + num17
								+ "   _");
				int num18 = Integer.parseInt(input18);
				if (matrixbuttonreturned == 0) {
					int ans1 = num1 + num10, ans2 = num2 + num11, ans3 = num3 + num12, ans4 = num4 + num13,
							ans5 = num5 + num14, ans6 = num6 + num15, ans7 = num7 + num16, ans8 = num8 + num17,
							ans9 = num9 + num18;
					String message = "The final value is:  \n\n" + String.valueOf(ans1) + "   " + String.valueOf(ans2)
							+ "   " + String.valueOf(ans3) + "\n" + String.valueOf(ans4) + "   " + String.valueOf(ans5)
							+ "   " + String.valueOf(ans6) + "\n" + String.valueOf(ans7) + "   " + String.valueOf(ans8)
							+ "   " + String.valueOf(ans9);
					JOptionPane.showMessageDialog(new JFrame(), message, "Answer", JOptionPane.INFORMATION_MESSAGE);
				} else if (matrixbuttonreturned == 1) {
					int ans1 = num1 - num10, ans2 = num2 - num11, ans3 = num3 - num12, ans4 = num4 - num13,
							ans5 = num5 - num14, ans6 = num6 - num15, ans7 = num7 - num16, ans8 = num8 - num17,
							ans9 = num9 - num18;
					String message = "The final value is:  \n\n" + String.valueOf(ans1) + "   " + String.valueOf(ans2)
							+ "   " + String.valueOf(ans3) + "\n" + String.valueOf(ans4) + "   " + String.valueOf(ans5)
							+ "   " + String.valueOf(ans6) + "\n" + String.valueOf(ans7) + "   " + String.valueOf(ans8)
							+ "   " + String.valueOf(ans9);
					JOptionPane.showMessageDialog(new JFrame(), message, "Answer", JOptionPane.INFORMATION_MESSAGE);
				} else if (matrixbuttonreturned == 2) {
					int ans1 = num1 * num10 + num2 * num13 + num3 * num16,
							ans2 = num1 * num11 + num2 * num14 + num3 * num17,
							ans3 = num1 * num12 + num2 * num15 + num3 * num18,
							ans4 = num4 * num10 + num5 * num13 + num6 * num16,
							ans5 = num4 * num11 + num5 * num14 + num6 * num17,
							ans6 = num4 * num12 + num5 * num15 + num6 * num18,
							ans7 = num7 * num10 + num8 * num13 + num9 * num16,
							ans8 = num7 * num11 + num8 * num14 + num9 * num17,
							ans9 = num7 * num12 + num8 * num15 + num9 * num18;
					String message = "The final value is:  \n\n" + String.valueOf(ans1) + "   " + String.valueOf(ans2)
							+ "   " + String.valueOf(ans3) + "\n" + String.valueOf(ans4) + "   " + String.valueOf(ans5)
							+ "   " + String.valueOf(ans6) + "\n" + String.valueOf(ans7) + "   " + String.valueOf(ans8)
							+ "   " + String.valueOf(ans9);
					JOptionPane.showMessageDialog(new JFrame(), message, "Answer", JOptionPane.INFORMATION_MESSAGE);
					
				} else {
					error.Error();
				}

			} else {
				error.Error();
			}
			
		} catch (Exception e) {
			error.Error();
		}
	} */

	/*
	public static void Error() {
		// String message = "An error has occured with the Basic/Matrix
		// Calculator.\nClick OK, or press Enter/spacebar to go bakc to the
		// launcher, and restart the calculator.";

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame Error = new JFrame(info);
		Error.setLayout(new GridLayout(3, 1));

		JLabel first_message = new JLabel("    An error has occured with the Calculator    ");
		JLabel second_message = new JLabel("     Press \"Enter\" to return to the launcher   ");
		JButton Continue = new JButton("Launcher");

		Error.add(first_message);
		Error.add(second_message);
		Error.add(Continue);

		Error.pack();
		Error.setVisible(true);

		Continue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Error.setVisible(false);
			}
		});

		Error.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

		// JOptionPane.showMessageDialog(new JFrame(), message, "ERROR",
		// JOptionPane.INFORMATION_MESSAGE);

	}
	*/

	public static void Selector() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame Selector = new JFrame(info);
		Selector.setLayout(new GridLayout(2, 3));

		JLabel left_filler = new JLabel("", JLabel.LEFT);
		JLabel message = new JLabel("Select a Calculator", JLabel.CENTER);
		JLabel right_filler = new JLabel("", JLabel.RIGHT);
		JButton Basic = new JButton("Basic Calculator");
		JLabel center_filler = new JLabel("", JLabel.CENTER);
		JButton Matrix = new JButton("Matrix Calculator");

		Selector.add(left_filler);
		Selector.add(message);
		Selector.add(right_filler);
		Selector.add(Basic);
		Selector.add(center_filler);
		Selector.add(Matrix);
		Selector.pack();
		Selector.setVisible(true);

		Basic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Calculator.Basic();
				basic.basic(debug);

			}
		});
		Matrix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Calculator.Matrix();
				matrix.matrix(debug);
			}
		});

		Selector.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}