package presentationLayer;

import javax.swing.JButton;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import dataAccessLayer.DataBase;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class View extends JFrame implements ActionListener {
	
	JTextField t =new JTextField("");  
	JButton button,button2;
	private DataBase db;
	public View(DataBase d) {
		
		db = d;
		 
		button = new JButton("Browse File");
		button.setBounds(270, 100, 100, 30);
		button.addActionListener((this));
		
		
		button2 = new JButton("Add");
		button2.setBounds(120, 150, 100, 30);
		button2.addActionListener((this));
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,300);
		this.setTitle("Urdu Spell Checker");
		this.setVisible(true);
		this.add(button);
		this.add(button2);
		
	    t.setBounds(50,100, 200,30);  
	    this.add(t);   
	    this.setSize(400,400);  
	    this.setLayout(null);  
	    this.setVisible(true);  
	    
	}
	

  /*
   * author: Fahad-Bin-Imran 
   * (20F-0194)
   * 
   * Make browseButton function to browse a file
   * */
public void browseButton() {
		
	try {
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Select XML File");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES); 
		
		int response = fileChooser.showOpenDialog(null);
		if (response == JFileChooser.APPROVE_OPTION) {
			File file = new File(fileChooser.getSelectedFile().getAbsoluteFile(), "");
			String path = file.getAbsolutePath();
			t.setText(path);		
			
		}	
	}
	catch(Exception e) {
		JOptionPane.showMessageDialog(null, "Cannot select file");
	}
		
	}



/*
 * author: Fahad-Bin-Imran 
 * (20F-0194)
 * 
 * Make addButton function to insert file data into Database
 * */
public void addButton() {
	
	button2.addActionListener(this);
	db.insertData();
	
	
}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button) {
			browseButton();
		}
		if(e.getSource() == button2) {
			String p = e.getActionCommand();
			if (p.equalsIgnoreCase("Add")) {
				try {
					addButton();
					JOptionPane.showMessageDialog(null, "Data inserted");
				}
				catch(Exception e1) {
					System.out.println(e1);
				}
			}
			
		}
	}
	

}
