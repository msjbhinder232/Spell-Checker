package spellchecker;


import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Frame extends JFrame implements ActionListener  {
	
	Frame(){		
		
		JButton button = new JButton("Browse File");
		button.setBounds(170, 100, 120, 30);
		button.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,300);
		this.setTitle("Urdu Spell Checker");
		this.setVisible(true);
		this.add(button);
	
		
	}
	
	
	public void BrowseButton() {
		
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
		
		int response = fileChooser.showOpenDialog(null);
		if (response == JFileChooser.APPROVE_OPTION) {
			File file = new File(fileChooser.getSelectedFile().getAbsoluteFile(), "");
		}
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
			BrowseButton();
		}

}
