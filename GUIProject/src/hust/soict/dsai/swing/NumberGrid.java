package hust.soict.dsai.swing;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class NumberGrid extends JFrame{
	private JButton[] btnNumbers = new JButton[10];
	private JButton btnDelete, btnReset;
	private JTextField tfDisplay;

	public NumberGrid() {
		// TODO Auto-generated constructor stub
		tfDisplay = new JTextField();
		tfDisplay.setSize(50, 180);
		tfDisplay.setComponentOrientation(
				ComponentOrientation.RIGHT_TO_LEFT);
		
		JPanel panelButtons = new JPanel(new GridLayout(4, 3));
		addButtons(panelButtons);
		
		Container cp = getContentPane();
		cp.setLayout(new BorderLayout());
		cp.add(tfDisplay, BorderLayout.NORTH);
		cp.add(panelButtons, BorderLayout.CENTER);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Number Grid");
		setSize(200, 200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new NumberGrid();
	}
	
	void addButtons (JPanel panelButtons) {
		ButtonListener btnListener = new ButtonListener();
		for (int i = 1; i <= 9; i++) {
			btnNumbers[i] = new JButton("" + i);
			panelButtons.add(btnNumbers[i]);
			btnNumbers[i].addActionListener(btnListener);
		}
		
		btnDelete = new JButton("DEL");
		panelButtons.add(btnDelete);
		btnDelete.addActionListener(btnListener);
		
		btnNumbers[0] = new JButton("0");
		panelButtons.add(btnNumbers[0]);
		btnNumbers[0].addActionListener(btnListener);
		
		btnReset = new JButton("C");
		panelButtons.add(btnReset);
		btnReset.addActionListener(btnListener);
	}

	private class ButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent evt) {
			String button = evt.getActionCommand();
			if (button.charAt(0) >= '0' && button.charAt(0) <= '9') {
				tfDisplay.setText(tfDisplay.getText() + button);
			}
			else if (button.equals("DEL")) {
				String str = tfDisplay.getText();
				tfDisplay.setText(str.substring(0, str.length() - 1));
			}
			else {
				tfDisplay.setText("");
			}
		}
	}
}
