package presentationLayer;

import java.awt.*; // Using AWT layouts
import java.awt.event.*; // Using AWT event classes and listener interfaces
import java.io.File;

import javax.swing.*; // Using Swing components and containers



//GUI of the Urdu Spell Checker
public class AppGui extends JFrame implements ActionListener {

  public JTextArea inputTextArea, outputTextArea; // Declare a TextArea component
  public JButton importDataBtn, generateMutantsBtn, highlightTyposBtn, giveSuggestionsBtn, clearBtn, addBtn, browseBtn;
  public JLabel inputLabel, outputLabel,titleLabel; // Declare a Label component
  public JTextField txt;
  public JFrame frame;
  private Controller cont;

  public AppGui() throws Exception {
    
	  
	cont = new Controller();
    JPanel mainPanel = new JPanel();
    frame =  new JFrame();

    setTitle("Urdu Spell Checker");
    setSize(800, 725);

    mainPanel.setLayout(null);
    mainPanel.setPreferredSize(new Dimension(500, 500));
    mainPanel.setBackground(Color.LIGHT_GRAY);
    add(mainPanel);

    importDataBtn = new JButton("Import data from XML to DB");
    importDataBtn.setBounds(620, 250, 120, 30);
    importDataBtn.addActionListener(this);

    generateMutantsBtn = new JButton("Generate Mutants");
    generateMutantsBtn.setBounds(620, 300, 120, 30);
    generateMutantsBtn.addActionListener(this);

    highlightTyposBtn = new JButton("Highlight Typos");
    highlightTyposBtn.setBounds(620, 350, 120, 30);
    highlightTyposBtn.addActionListener(this);

    giveSuggestionsBtn = new JButton("Give Suggestions");
    giveSuggestionsBtn.setBounds(620, 400, 120, 30);
    giveSuggestionsBtn.addActionListener(this);
    
    addBtn = new JButton("شامل کریں");
    addBtn.setBounds(220, 280, 99, 23);
    addBtn.addActionListener(this);
    
    browseBtn = new JButton("براؤز کریں");
    browseBtn.setBounds(360, 280, 99, 23);
    browseBtn.addActionListener(this);
    
    txt = new JTextField();
    txt.setBackground(Color.WHITE);
	txt.setBounds(125, 222, 460, 28);
	txt.setColumns(10);
	txt.setColumns(10);

    clearBtn = new JButton("Clear");
    clearBtn.setBounds(620, 450, 120, 30);
    clearBtn.addActionListener(this);
    
    titleLabel = new JLabel("اردو املا چیکر");
    titleLabel.setBounds(280, 80, 150, 50);
    titleLabel.setForeground(Color.white);
    titleLabel.setFont(new Font("Serif", Font.PLAIN, 30));
    mainPanel.add(titleLabel);

    mainPanel.add(importDataBtn);
    mainPanel.add(generateMutantsBtn);
    mainPanel.add(highlightTyposBtn);
    mainPanel.add(giveSuggestionsBtn);
    mainPanel.add(clearBtn);
    mainPanel.add(txt);
    mainPanel.add(addBtn);
    mainPanel.add(browseBtn);
    txt.setVisible(false);
    addBtn.setVisible(false);
    browseBtn.setVisible(false);

    importDataBtn.addActionListener(this);
    generateMutantsBtn.addActionListener(this);
    highlightTyposBtn.addActionListener(this);
    giveSuggestionsBtn.addActionListener(this);
    clearBtn.addActionListener(this);

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  //Functions of the Buttons
  public void actionPerformed(ActionEvent e) {
	//Function of ClearBtn
    if (e.getSource() == clearBtn) {
    	txt.setVisible(false);
    	addBtn.setVisible(false);
    	browseBtn.setVisible(false);
    }
    //Function of importDataBtn
    if (e.getSource() == importDataBtn) {
    	txt.setText("");
    	txt.setVisible(true);
    	addBtn.setVisible(true);
    	browseBtn.setVisible(true);
			
    }
    //Function of addBtn
    if (e.getSource() == addBtn) {
    	txt.setText("");
    	txt.setVisible(true);
    	addBtn.setVisible(true);
    	browseBtn.setVisible(true);
		cont.path();
		JOptionPane.showMessageDialog(frame, "کامیابی سے شامل");
    }
    //Function of browseBtn
    if (e.getSource() == browseBtn) {
    	JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Select XML File");
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
		
		int response = fileChooser.showOpenDialog(null);
		if (response == JFileChooser.APPROVE_OPTION) {
			File directoryPath = new File(fileChooser.getSelectedFile().getAbsoluteFile(), "");
			String path = directoryPath.getAbsolutePath();
    	    txt.setText(path);
    	
     }
		txt.setVisible(true);
	    addBtn.setVisible(true);
	    browseBtn.setVisible(true);
   }
    if (e.getSource() == generateMutantsBtn) {
    	txt.setVisible(false);
    	addBtn.setVisible(false);
    	browseBtn.setVisible(false);
  
  }
    if (e.getSource() == highlightTyposBtn) {
    	txt.setVisible(false);
    	addBtn.setVisible(false);
    	browseBtn.setVisible(false);
  
     }
    if (e.getSource() == giveSuggestionsBtn) {
    	txt.setVisible(false);
    	addBtn.setVisible(false);
    	browseBtn.setVisible(false);
  
     }
    
  }
  
}
