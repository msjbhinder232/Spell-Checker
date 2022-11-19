package presentationLayer;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class View extends JFrame implements ActionListener {
	
	JTextField t =new JTextField("");  
	public View() {
		
		JButton button = new JButton("Browse File");
		button.setBounds(270, 100, 100, 30);
		button.addActionListener((this));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,300);
		this.setTitle("Urdu Spell Checker");
		this.setVisible(true);
		this.add(button);
		
		 
	    
	    t.setBounds(50,100, 200,30);  
	    this.add(t);   
	    this.setSize(400,400);  
	    this.setLayout(null);  
	    this.setVisible(true);  
	}
	
	
public void browseButton() {
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
		
		int response = fileChooser.showOpenDialog(null);
		if (response == JFileChooser.APPROVE_OPTION) {
			File file = new File(fileChooser.getSelectedFile().getAbsoluteFile(), "");
			String path = file.getAbsolutePath();
			t.setText(path);
			
			
		}
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		browseButton();
	}
	

}
