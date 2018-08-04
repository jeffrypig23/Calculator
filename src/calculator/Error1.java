package calculator;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Error1 {
	

	public void Error() {

		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame Error = new JFrame("Error");
		Error.setLayout(new GridLayout(3, 1));

		JLabel first_message = new JLabel("    An error has occured    ");
		JLabel second_message = new JLabel("    Please press \"Enter\"    ");
		JButton Continue = new JButton("Enter");

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
	}
}
