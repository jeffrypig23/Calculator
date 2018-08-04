package calculator;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/* {[_],[_],[_]} [+] {[_],[_]|[_]} [ ] [_],[_],[_] */
/* {[_],[_],[_]} [-] {[_],[_]|[_]} |=| [_],[_],[_] */
/* {[_],[_],[_]} [x] {[_],[_]|[_]} [ ] [_],[_],[_] */

public class Matrix {
	static int oxo = 0;
	static int txo = 0;
	static int thxo = 0;
	static int oxt = 0;
	static int txt = 0;
	static int thxt = 0;
	static int oxth = 0;
	static int txth = 0;
	static int thxth = 0;
	public static void main(String[] args) {
		Matrix matrix = new Matrix();
		matrix.matrix(true);
	}

	public void matrix(boolean debug) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame Window = new JFrame("Matrix Calculator");
		Window.setLayout(new GridBagLayout());
		GridBagConstraints GridLayout = new GridBagConstraints();
		GridLayout.fill = GridBagConstraints.HORIZONTAL;

		JLabel openbracket1 = new JLabel("[");
		openbracket1.setFont(new Font(Font.SERIF, Font.PLAIN, 100));
		GridLayout.gridx = 0;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 3;
		Window.add(openbracket1, GridLayout);
		
		JTextArea onexone = new JTextArea("0");
		onexone.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 1;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(onexone, GridLayout);
		
		JLabel pipe1 = new JLabel(",");
		pipe1.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 2;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(pipe1, GridLayout);

		JTextArea twoxone = new JTextArea("0");
		twoxone.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 3;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(twoxone, GridLayout);
		
		JLabel pipe2 = new JLabel(",");
		pipe2.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 4;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(pipe2, GridLayout);
		
		JTextArea threexone = new JTextArea("0");
		threexone.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 5;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(threexone, GridLayout);
		
		JLabel closebracket1 = new JLabel("]");
		closebracket1.setFont(new Font(Font.SERIF, Font.PLAIN, 100));
		GridLayout.gridx = 6;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 3;
		Window.add(closebracket1, GridLayout);
		
		JButton plus = new JButton("+");
		plus.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 7;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(plus, GridLayout);
		
		JLabel openbracket2 = new JLabel("[");
		openbracket2.setFont(new Font(Font.SERIF, Font.PLAIN, 100));
		GridLayout.gridx = 8;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 3;
		Window.add(openbracket2, GridLayout);
		
		JTextArea fourxone = new JTextArea("0");
		fourxone.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 9;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(fourxone, GridLayout);
		
		JLabel pipe3 = new JLabel(",");
		pipe3.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 10;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(pipe3, GridLayout);

		JTextArea fivexone = new JTextArea("0");
		fivexone.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 11;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(fivexone, GridLayout);
		
		JLabel pipe4 = new JLabel(",");
		pipe4.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 12;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(pipe4, GridLayout);
		
		JTextArea sixxone = new JTextArea("0");
		sixxone.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 13;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(sixxone, GridLayout);
		
		JLabel closebracket2 = new JLabel("]");
		closebracket2.setFont(new Font(Font.SERIF, Font.PLAIN, 100));
		GridLayout.gridx = 14;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 3;
		Window.add(closebracket2, GridLayout);
		
		JLabel equals = new JLabel("=");
		equals.setFont(new Font(Font.SERIF, Font.PLAIN, 50));
		GridLayout.gridx = 15;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 3;
		Window.add(equals, GridLayout);
		
		JLabel openbracket3 = new JLabel("[");
		openbracket3.setFont(new Font(Font.SERIF, Font.PLAIN, 100));
		GridLayout.gridx = 16;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 3;
		Window.add(openbracket3, GridLayout);
		
		String fin_oxo = String.valueOf(oxo);
		JLabel answeronexone = new JLabel(fin_oxo);
		answeronexone.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		GridLayout.gridx = 17;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(answeronexone, GridLayout);
		
		JLabel pipe5 = new JLabel(",");
		pipe5.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 18;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(pipe5, GridLayout);
		
		String fin_txo = String.valueOf(txo);
		JLabel answertwoxone = new JLabel(fin_txo);
		answertwoxone.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		GridLayout.gridx = 19;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(answertwoxone, GridLayout);
		
		JLabel pipe6 = new JLabel(",");
		pipe6.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 20;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(pipe6, GridLayout);
		
		String fin_thxo = String.valueOf(thxo);
		JLabel answerthreexone = new JLabel(fin_thxo);
		answerthreexone.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		GridLayout.gridx = 21;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 1;
		Window.add(answerthreexone, GridLayout);
		
		JLabel closebracket3 = new JLabel("]");
		closebracket3.setFont(new Font(Font.SERIF, Font.PLAIN, 100));
		GridLayout.gridx = 22;
		GridLayout.gridy = 0;
		GridLayout.gridheight = 3;
		Window.add(closebracket3, GridLayout);
		
		JTextArea onextwo = new JTextArea("0");
		onextwo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 1;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(onextwo, GridLayout);
		
		JLabel pipe7 = new JLabel(",");
		pipe7.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 2;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(pipe7, GridLayout);
		
		JTextArea twoxtwo = new JTextArea("0");
		twoxtwo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 3;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(twoxtwo, GridLayout);
		
		JLabel pipe8 = new JLabel(",");
		pipe8.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 4;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(pipe8, GridLayout);
		
		JTextArea threextwo = new JTextArea("0");
		threextwo.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 5;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(threextwo, GridLayout);
		
		JButton minus = new JButton("-");
		minus.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 7;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(minus, GridLayout);
		
		JTextArea twoxfour = new JTextArea("0");
		twoxfour.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 9;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(twoxfour, GridLayout);
		
		JLabel pipe9 = new JLabel(",");
		pipe9.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 10;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(pipe9, GridLayout);
		
		JTextArea twoxfive = new JTextArea("0");
		twoxfive.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 11;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(twoxfive, GridLayout);
		
		JLabel pipe10 = new JLabel(",");
		pipe10.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 12;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(pipe10, GridLayout);
		
		JTextArea twoxsix = new JTextArea("0");
		twoxsix.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 13;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(twoxsix, GridLayout);
		
		String fin_oxt = String.valueOf(oxt);
		JLabel answeronextwo = new JLabel(fin_oxt);
		answeronextwo.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		GridLayout.gridx = 17;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(answeronextwo, GridLayout);
		
		JLabel pipe11 = new JLabel(",");
		pipe11.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 18;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(pipe11, GridLayout);
		
		String fin_txt = String.valueOf(txt);
		JLabel answertwoxtwo = new JLabel(fin_txt);
		answertwoxtwo.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		GridLayout.gridx = 19;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(answertwoxtwo, GridLayout);
		
		JLabel pipe12 = new JLabel(",");
		pipe12.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 20;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(pipe12, GridLayout);
		
		String fin_thxt = String.valueOf(thxt);
		JLabel answerthreextwo = new JLabel(fin_thxt);
		answerthreextwo.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		GridLayout.gridx = 21;
		GridLayout.gridy = 1;
		GridLayout.gridheight = 1;
		Window.add(answerthreextwo, GridLayout);

		JTextArea onexthree = new JTextArea("0");
		onexthree.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 1;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(onexthree, GridLayout);
		
		JLabel pipe13 = new JLabel(",");
		pipe13.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 2;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(pipe13, GridLayout);
		
		JTextArea twoxthree = new JTextArea("0");
		twoxthree.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 3;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(twoxthree, GridLayout);
		
		JLabel pipe14 = new JLabel(",");
		pipe14.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 4;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(pipe14, GridLayout);
		
		JTextArea threexthree = new JTextArea("0");
		threexthree.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 5;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(threexthree, GridLayout);
		
		JButton multiply = new JButton("x");
		multiply.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 7;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(multiply, GridLayout);
		
		JTextArea threexfour = new JTextArea("0");
		threexfour.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 9;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(threexfour, GridLayout);
		
		JLabel pipe15 = new JLabel(",");
		pipe15.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 10;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(pipe15, GridLayout);
		
		JTextArea threexfive = new JTextArea("0");
		threexfive.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 11;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(threexfive, GridLayout);
		
		JLabel pipe16 = new JLabel(",");
		pipe16.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 12;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(pipe16, GridLayout);
		
		JTextArea threexsix = new JTextArea("0");
		threexsix.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 13;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(threexsix, GridLayout);
		
		String fin_oxth = String.valueOf(oxth);
		JLabel answeronexthree = new JLabel(fin_oxth);
		answeronexthree.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		GridLayout.gridx = 17;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(answeronexthree, GridLayout);
		
		JLabel pipe17 = new JLabel(",");
		pipe17.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 18;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(pipe17, GridLayout);
		
		String fin_txth = String.valueOf(txth);
		JLabel answertwoxthree = new JLabel(fin_txth);
		answertwoxthree.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		GridLayout.gridx = 19;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(answertwoxthree, GridLayout);
		
		JLabel pipe18 = new JLabel(",");
		pipe18.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 20));
		GridLayout.gridx = 20;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(pipe18, GridLayout);
		
		String fin_thxth = String.valueOf(thxth);
		JLabel answerthreexthree = new JLabel(fin_thxth);
		answerthreexthree.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 20));
		GridLayout.gridx = 21;
		GridLayout.gridy = 2;
		GridLayout.gridheight = 1;
		Window.add(answerthreexthree, GridLayout);
		
		// TODO: Add in functions for operations! aka RETURN TO
		
		plus.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) {
				String onexonetext = onexone.getText();
				String fourxonetext = fourxone.getText();
				//int a = (Integer.parseInt(onexonetext)) + (Integer.parseInt(fourxonetext));
				//oxo.setText();
				
				
			}
		});

		Window.setSize(500, 200);
		Window.setVisible(true);
		Window.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	}
}
