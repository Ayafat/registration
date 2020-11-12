package registration1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class reg1 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_6;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reg1 window = new reg1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public reg1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(600,300,650,700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\u0646\u0627\u0645");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(482, 57, 85, 34);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(282, 104, 170, 34);
		frame.getContentPane().add(textField);
		textField.setColumns(30);
		
		JLabel lblNewLabel_1 = new JLabel("\u0646\u0627\u0645 \u062E\u0627\u0646\u0648\u0627\u062F\u06AF\u06CC");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(475, 101, 118, 34);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setBounds(282, 55, 170, 34);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(30);
		
		JLabel label = new JLabel("*\u0634\u0645\u0627\u0631\u0647 \u062A\u0645\u0627\u0633 \u062B\u0627\u0628\u062A");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.BOLD, 16));
		label.setBounds(474, 209, 152, 34);
		frame.getContentPane().add(label);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setColumns(15);
		textField_1.setBounds(282, 212, 170, 34);
		frame.getContentPane().add(textField_1);
		
		JLabel label_1 = new JLabel("*\u0634\u0645\u0627\u0631\u0647 \u0645\u0648\u0628\u0627\u06CC\u0644");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_1.setBounds(474, 264, 131, 34);
		frame.getContentPane().add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(15);
		textField_2.setBounds(282, 267, 170, 34);
		frame.getContentPane().add(textField_2);
		
		JLabel label_2 = new JLabel("\u0622\u062F\u0631\u0633");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_2.setBounds(462, 435, 131, 34);
		frame.getContentPane().add(label_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setColumns(30);
		textField_3.setBounds(10, 438, 442, 34);
		frame.getContentPane().add(textField_3);
		
		JLabel label_3 = new JLabel("*\u0627\u06CC\u0645\u06CC\u0644");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_3.setBounds(462, 378, 131, 34);
		frame.getContentPane().add(label_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setColumns(30);
		textField_4.setBounds(98, 381, 354, 34);
		frame.getContentPane().add(textField_4);
		
		JLabel label_4 = new JLabel("\u06A9\u062F\u0645\u0644\u06CC");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_4.setBounds(474, 321, 131, 34);
		frame.getContentPane().add(label_4);
		
		textField_5 = new JTextField();
		textField_5.setToolTipText("");
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setColumns(10);
		textField_5.setBounds(282, 324, 170, 34);
		frame.getContentPane().add(textField_5);
		
		JLabel label_5 = new JLabel("");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_5.setBounds(474, 209, 118, 34);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("*\u0631\u0645\u0632 \u0639\u0628\u0648\u0631");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 16));
		label_6.setBounds(475, 158, 118, 34);
		frame.getContentPane().add(label_6);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		passwordField.setHorizontalAlignment(SwingConstants.CENTER);
		passwordField.setBounds(282, 158, 170, 34);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("\u062B\u0628\u062A \u0646\u0627\u0645");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(329, 577, 123, 34);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u0648\u06CC\u0631\u0627\u06CC\u0634");
		button.setFont(new Font("Tahoma", Font.BOLD, 16));
		button.setBounds(182, 577, 123, 34);
		frame.getContentPane().add(button);
		
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
