package registration1;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import java.awt.Font;

public class window {
	
	public static void main(String[]args) {
		showWindow();
	}
public static void showWindow() {
	JFrame frame = new JFrame();
	frame.setBounds(100, 100, 503, 561);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setBackground(Color.GRAY);
	panel.setBounds(0, 0, 489, 523);
	frame.getContentPane().add(panel);
	panel.setLayout(null);
	
	JPanel panel_1 = new JPanel();
	panel_1.setBounds(10, 10, 469, 503);
	panel.add(panel_1);
	panel_1.setLayout(null);
	
	JPanel panel_2 = new JPanel();
	panel_2.setBounds(0, 0, 469, 503);
	panel_1.add(panel_2);
	panel_2.setLayout(null);
	
	JTextPane textPane = new JTextPane();
	textPane.setToolTipText("");
	textPane.setFont(new Font("Tahoma", Font.ITALIC, 18));
	textPane.setText("\u06A9\u0627\u0631\u0628\u0631 \u0639\u0632\u06CC\u0632 \u062E\u0648\u0634 \u0622\u0645\u062F\u06CC\u062F");
	textPane.setBounds(10, 5, 449, 498);
	panel_2.add(textPane);
	
	frame.setVisible(true);
}
}
