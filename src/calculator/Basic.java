package calculator;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Basic {
	/* calculated [AC] */
	/* [1] [2] [3] [+] */
	/* [4] [5] [6] [-] */
	/* [7] [8] [9] [x] */
	/* [0] [  =  ] [÷] */
	static double final_answer = 0;
	static boolean set = false;
	static double calculated = 0;
	static byte mode = 0;
	static JLabel final_answerinfo;
	static JLabel calculatedinfo;
	static JLabel setinfo;
	static JLabel modeinfo;
	static Error1 error = new Error1();
	
	public static void main(String[] args) {
		Basic basic = new Basic();
		basic.basic(true);
	}

	public void basic(boolean debug) {
		//if (debug == true) {
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
				final_answerinfo = new JLabel("final_answer: " + final_answer, JLabel.RIGHT);
				JLabel updatedinfo = new JLabel("updated: true", JLabel.LEFT);
				calculatedinfo = new JLabel("calculated: " + calculated, JLabel.RIGHT);
				setinfo = new JLabel("set: " + set, JLabel.LEFT);
				modeinfo = new JLabel("mode: " + mode, JLabel.RIGHT);

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

			} catch (Exception e1) {
				error.Error();
			}
		//}
			
		try {
			JFrame.setDefaultLookAndFeelDecorated(true);

			JFrame Window = new JFrame("Basic Calculator");
			Window.setLayout(new GridBagLayout());
			GridBagConstraints GridLayout = new GridBagConstraints();
			GridLayout.fill = GridBagConstraints.HORIZONTAL;

			String final_ans = String.valueOf(final_answer);

			JLabel ans = new JLabel(final_ans, JLabel.RIGHT);
			GridLayout.gridx = 0;
			GridLayout.gridy = 0;
			GridLayout.gridwidth = 3;
			Window.add(ans, GridLayout);
			ans.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));

			JButton clear = new JButton("AC");
			GridLayout.gridx = 3;
			GridLayout.gridy = 0;
			GridLayout.gridwidth = 1;
			Window.add(clear, GridLayout);
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

			JButton one = new JButton("1");
			GridLayout.gridx = 0;
			GridLayout.gridy = 1;
			GridLayout.gridwidth = 1;
			Window.add(one, GridLayout);
			one.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 1;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});

			JButton two = new JButton("2");
			GridLayout.gridx = 1;
			GridLayout.gridy = 1;
			GridLayout.gridwidth = 1;
			Window.add(two, GridLayout);
			two.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 2;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});

			JButton three = new JButton("3");
			GridLayout.gridx = 2;
			GridLayout.gridy = 1;
			GridLayout.gridwidth = 1;
			Window.add(three, GridLayout);
			three.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 3;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});

			JButton plus = new JButton("+");
			GridLayout.gridx = 3;
			GridLayout.gridy = 1;
			GridLayout.gridwidth = 1;
			Window.add(plus, GridLayout);
			plus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (set == false) {
						calculated = final_answer;
						set = true;
						final_answer = 0;
						mode = 1;
						ans.setText("" + final_answer);
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
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
						ans.setText("" + final_answer);
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
					}
				}
			});

			JButton four = new JButton("4");
			GridLayout.gridx = 0;
			GridLayout.gridy = 2;
			GridLayout.gridwidth = 1;
			Window.add(four, GridLayout);
			four.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 4;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});

			JButton five = new JButton("5");
			GridLayout.gridx = 1;
			GridLayout.gridy = 2;
			GridLayout.gridwidth = 1;
			Window.add(five, GridLayout);
			five.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 5;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});

			JButton six = new JButton("6");
			GridLayout.gridx = 2;
			GridLayout.gridy = 2;
			GridLayout.gridwidth = 1;
			Window.add(six, GridLayout);
			six.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 6;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});

			JButton minus = new JButton("-");
			GridLayout.gridx = 3;
			GridLayout.gridy = 2;
			GridLayout.gridwidth = 1;
			Window.add(minus, GridLayout);
			minus.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (set == false) {
						calculated = final_answer;
						set = true;
						final_answer = 0;
						mode = 2;
						ans.setText("" + final_answer);
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
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
						ans.setText("" + final_answer);
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
					}
				}
			});

			JButton seven = new JButton("7");
			GridLayout.gridx = 0;
			GridLayout.gridy = 3;
			GridLayout.gridwidth = 1;
			Window.add(seven, GridLayout);
			seven.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 7;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});

			JButton eight = new JButton("8");
			GridLayout.gridx = 1;
			GridLayout.gridy = 3;
			GridLayout.gridwidth = 1;
			Window.add(eight, GridLayout);
			eight.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 8;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});

			JButton nine = new JButton("9");
			GridLayout.gridx = 2;
			GridLayout.gridy = 3;
			GridLayout.gridwidth = 1;
			Window.add(nine, GridLayout);
			nine.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10 + 9;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});

			JButton multiply = new JButton("x");
			GridLayout.gridx = 3;
			GridLayout.gridy = 3;
			GridLayout.gridwidth = 1;
			Window.add(multiply, GridLayout);
			multiply.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (set == false) {
						calculated = final_answer;
						set = true;
						final_answer = 0;
						mode = 3;
						ans.setText("" + final_answer);
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
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
						ans.setText("" + final_answer);final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
					}
				}
			});

			JButton zero = new JButton("0");
			GridLayout.gridx = 0;
			GridLayout.gridy = 4;
			GridLayout.gridwidth = 1;
			Window.add(zero, GridLayout);
			zero.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					final_answer = final_answer * 10;
					ans.setText("" + final_answer);
					final_answerinfo.setText("final_answer: " + final_answer);
				}
			});

			JButton divide = new JButton("÷");
			GridLayout.gridx = 3;
			GridLayout.gridy = 4;
			GridLayout.gridwidth = 1;
			Window.add(divide, GridLayout);
			divide.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (set == false) {
						calculated = final_answer;
						set = true;
						final_answer = 0;
						mode = 4;
						ans.setText("" + final_answer);
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
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
						ans.setText("" + final_answer);
						final_answerinfo.setText("final_answer: " + final_answer);
						calculatedinfo.setText("calculated: " + calculated);
						setinfo.setText("set: " + set);
						modeinfo.setText("mode: " + mode);
					}
				}
			});

			JButton equals = new JButton("=");
			GridLayout.gridx = 1;
			GridLayout.gridy = 4;
			GridLayout.gridwidth = 2;
			Window.add(equals, GridLayout);
			equals.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
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
					set = false;
					calculated = 0;
					mode = 0;
					final_answerinfo.setText("final_answer: " + final_answer);
					calculatedinfo.setText("calculated: " + calculated);
					setinfo.setText("set: " + set);
					modeinfo.setText("mode: " + mode);
				}
			});

			Window.setSize(325, 175);
			Window.setVisible(true);
			Window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		} catch (Exception e) {
			error.Error();
		}
	}
}
