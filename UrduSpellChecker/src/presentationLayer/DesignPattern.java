package lab5;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.SystemColor;

public class DesignPattern extends JFrame {

	private JPanel contentPane;
	JButton Result_btn;
	JTextArea Text1;
	
 /*
     * author: Muhammad Atif Siddique
     * (20F-0106)
     * 
     * here is GUI of highlights usecase
     * */
	JTextArea result1;
	

	public DesignPattern() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 353);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(4, 6, 4, 6));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(new Color(0, 191, 255));
		
		JLabel head_1 = new JLabel("یہاں کوئی بھی متن ٹائپ کریں.........!۔");
		head_1.setFont(new Font("Serif", Font.BOLD, 17));
		head_1.setBounds(260, 101, 231, 30);
		contentPane.add(head_1);
		
		  Text1 = new JTextArea();
		Text1.setBounds(51, 132, 458, 68);
		contentPane.add(Text1);
		
		result1 = new JTextArea();
		result1.setBackground(new Color(176, 224, 230));
		result1.setBounds(51, 242, 458, 31);
		contentPane.add(result1);
		
		 Result_btn = new JButton(" کلک");
		 Result_btn.setBackground(Color.MAGENTA);
		Result_btn.setBounds(240, 211, 55, 23);
		contentPane.add(Result_btn);
		
		JLabel resultBtnInst = new JLabel("چیک کرنے کے لیے کلک کریں.    👈۔");
		resultBtnInst.setFont(new Font("Serif", Font.BOLD, 10));
		resultBtnInst.setBounds(305, 211, 144, 23);
		contentPane.add(resultBtnInst);
		
		JLabel welcome = new JLabel("(-------اردو سپیل چیکر-------)");
		welcome.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 29));
		welcome.setBounds(115, 22, 350, 30);
		contentPane.add(welcome);
	}
	public JButton getBtnNewButton() {
		return Result_btn;
	}

	public void setBtnNewButton(JButton btnNewButton) {
		this.Result_btn = btnNewButton;
	}

	public JTextArea getTextArea() {
		return Text1;
	}

	public void setTextArea(JTextArea textArea) {
		this.Text1 = textArea;
	}

	public JTextArea getTextArea_1() {
		return result1;
	}

	public void setTextArea_1(JTextArea textArea_1) {
		this.result1 = textArea_1;
	}
}
