package lab5;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JList;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class IdealWeight {

	private JFrame frame;
	private JTextField label_text;
	private JButton Result_btn; 
	private JLabel label_result; 
	
	public JTextField getTextFieldtext() {
		return label_text;
	}

	public JButton getBtnNewButton() {
		return Result_btn;
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IdealWeight window = new IdealWeight();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}
	public IdealWeight() {
		designField();
	}
	
	private void designField() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBounds(100, 100, 680, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblTypeAnyText = new JLabel("Type Any Text here");
		lblTypeAnyText.setForeground(new Color(0, 0, 128));
		lblTypeAnyText.setBackground(SystemColor.textHighlight);
		lblTypeAnyText.setFont(new Font("Serif", Font.BOLD, 20));
		lblTypeAnyText.setBounds(53, 96, 555, 25);
		frame.getContentPane().add(lblTypeAnyText);
		
		 Result_btn = new JButton("Click to check Result");
	String	 matchword="ایک" ;
		Result_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Wordnew="ایک";
				if(matchword==Wordnew)
				{
					label_result.setText(matchword);
				}
				else 
				{
					label_result.setText("Invalid input"); 
				}
			}
		});
		Result_btn.setBackground(new Color(192, 192, 192));
		Result_btn.setForeground(SystemColor.textText);
		Result_btn.setFont(new Font("Serif", Font.PLAIN, 13));
		Result_btn.setBounds(244, 209, 164, 35);
		frame.getContentPane().add(Result_btn);
		
		label_text = new JTextField();
		label_text.setText(" ");
		label_text.setBounds(63, 124, 555, 82);
		frame.getContentPane().add(label_text);
		label_text.setColumns(10);
		
		label_result = new JLabel("\r\n");
		label_result.setForeground(new Color(192, 192, 192));
		label_result.setBackground(SystemColor.menu);
		label_result.setFont(new Font("Tahoma", Font.BOLD, 15));
		label_result.setBounds(63, 255, 541, 70);
		frame.getContentPane().add(label_result);
		
		JLabel welcome_field = new JLabel("\t\t\t\t\t\tWelcome to Spell Checker....!");
		welcome_field.setFont(new Font("Segoe Script", Font.BOLD, 25));
		welcome_field.setBackground(SystemColor.textHighlight);
		welcome_field.setBounds(148, 24, 393, 46);
		frame.getContentPane().add(welcome_field);
	}

	public void showException(String string) {
		label_result.setText("Invalid input"); 
		
	}
}