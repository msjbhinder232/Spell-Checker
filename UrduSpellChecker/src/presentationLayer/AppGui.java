package presentationLayer;

import java.awt.*; // Using AWT layouts
import java.awt.event.*; // Using AWT event classes and listener interfaces
import java.io.File;

import javax.swing.*; // Using Swing components and containers



//GUI of the Urdu Spell Checker
public class AppGui extends JFrame implements ActionListener {

  public JTextArea inputTextArea, outputTextArea; // Declare a TextArea component
  public JButton importDataBtn, generateMutantsBtn, highlightTyposBtn, giveSuggestionsBtn, clearBtn, addBtn, browseBtn, addWordBtn, manualAddBtn;
  public JLabel inputLabel, outputLabel,titleLabel, choiceLabel, optionLabel1,optionLabel2; // Declare a Label component
  public JTextField txt, manualWordTxt;
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

    //importDataBtn
    importDataBtn = new JButton("ڈیٹا درآمد کریں");
    importDataBtn.setBounds(620, 250, 120, 30);
    importDataBtn.addActionListener(this);
    importDataBtn.setFont(new Font("Serif", Font.BOLD, 16));

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
    addBtn.setFont(new Font("Serif", Font.BOLD, 16));
    
    browseBtn = new JButton("براؤز کریں");
    browseBtn.setBounds(360, 280, 99, 23);
    browseBtn.addActionListener(this);
    browseBtn.setFont(new Font("Serif", Font.BOLD, 16));
    
    txt = new JTextField();
    txt.setBackground(Color.WHITE);
	txt.setBounds(125, 222, 460, 28);
	txt.setColumns(10);
	
	manualWordTxt = new JTextField();
	manualWordTxt.setBackground(Color.WHITE);
	manualWordTxt.setBounds(125, 442, 460, 28);
	manualWordTxt.setColumns(10);
	

    clearBtn = new JButton("Clear");
    clearBtn.setBounds(620, 450, 120, 30);
    clearBtn.addActionListener(this);
    
    addWordBtn = new JButton("لفظ شامل کریں");
    addWordBtn.setBounds(620, 500, 120, 30);
    addWordBtn.addActionListener(this);
    addWordBtn.setFont(new Font("Serif", Font.BOLD, 16));
    
    titleLabel = new JLabel("اردو املا چیکر");
    titleLabel.setBounds(280, 80, 250, 50);
    titleLabel.setForeground(Color.white);
    titleLabel.setFont(new Font("Serif", Font.PLAIN, 35));
    mainPanel.add(titleLabel);
    
    optionLabel1  = new JLabel("فائلوں کا راستہ شامل کریں۔");
    optionLabel1.setBounds(340, 170, 300, 50);
    optionLabel1.setForeground(Color.white);
    optionLabel1.setFont(new Font("Serif", Font.PLAIN, 25));
    mainPanel.add(optionLabel1);
    
    optionLabel2  = new JLabel("نیا لفظ شامل کریں");
    optionLabel2.setBounds(420, 390, 300, 50);
    optionLabel2.setForeground(Color.white);
    optionLabel2.setFont(new Font("Serif", Font.PLAIN, 25));
    mainPanel.add(optionLabel2);
    
    
    
    choiceLabel = new JLabel("یا");
    choiceLabel.setBounds(340, 340, 150, 50);
    choiceLabel.setForeground(Color.white);
    choiceLabel.setFont(new Font("Serif", Font.PLAIN, 30));
    mainPanel.add(choiceLabel);
    
    manualAddBtn = new JButton("لفظ شامل کریں");
    manualAddBtn.setBounds(300, 500, 115, 23);
    manualAddBtn.addActionListener(this);
    manualAddBtn.setFont(new Font("Serif", Font.BOLD, 16));

    mainPanel.add(importDataBtn);
    mainPanel.add(generateMutantsBtn);
    mainPanel.add(highlightTyposBtn);
    mainPanel.add(giveSuggestionsBtn);
    mainPanel.add(clearBtn);
    mainPanel.add(txt);
    mainPanel.add(manualWordTxt);
    mainPanel.add(addBtn);
    mainPanel.add(browseBtn);
    mainPanel.add(addWordBtn);
    mainPanel.add(manualAddBtn);
    txt.setVisible(false);
    manualWordTxt.setVisible(false);
    addBtn.setVisible(false);
    browseBtn.setVisible(false);
    choiceLabel.setVisible(false);
    manualAddBtn.setVisible(false);
    optionLabel1.setVisible(false);
    optionLabel2.setVisible(false);

    importDataBtn.addActionListener(this);
    generateMutantsBtn.addActionListener(this);
    highlightTyposBtn.addActionListener(this);
    giveSuggestionsBtn.addActionListener(this);
    clearBtn.addActionListener(this);
    addWordBtn.addActionListener(this);

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
    	choiceLabel.setVisible(false);
    	manualWordTxt.setVisible(false);
    	manualAddBtn.setVisible(false);
    	optionLabel1.setVisible(false);
    	optionLabel2.setVisible(false);
    	
    }
    //Function of importDataBtn
    if (e.getSource() == importDataBtn) {
    	txt.setText("");
    	txt.setVisible(true);
    	addBtn.setVisible(true);
    	browseBtn.setVisible(true);
    	choiceLabel.setVisible(true);
    	manualWordTxt.setVisible(true);
    	manualAddBtn.setVisible(true);
    	optionLabel1.setVisible(true);
    	optionLabel2.setVisible(true);

			
    }
    //Function of addBtn
    if (e.getSource() == addBtn) {
    	txt.setText("");
    	txt.setVisible(true);
    	addBtn.setVisible(true);
    	browseBtn.setVisible(true);
    	choiceLabel.setVisible(true);
    	manualWordTxt.setVisible(true);
    	manualAddBtn.setVisible(true);
    	optionLabel1.setVisible(true);
    	optionLabel2.setVisible(true);
		cont.path();
		cont.sendWords();
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
	    choiceLabel.setVisible(true);
	    manualWordTxt.setVisible(true);
	    manualAddBtn.setVisible(true);
	    optionLabel1.setVisible(true);
	    optionLabel2.setVisible(true);
   }
  //Function of generateMutantsBtn
    if (e.getSource() == generateMutantsBtn) {
    	txt.setVisible(false);
    	addBtn.setVisible(false);
    	browseBtn.setVisible(false);
    	choiceLabel.setVisible(false);
    	manualWordTxt.setVisible(false);
    	manualAddBtn.setVisible(false);
    	optionLabel1.setVisible(false);
        optionLabel2.setVisible(false);
  }
  //Function of highlightTyposBtn
    if (e.getSource() == highlightTyposBtn) {
    	txt.setVisible(false);
    	addBtn.setVisible(false);
    	browseBtn.setVisible(false);
    	choiceLabel.setVisible(false);
    	 manualWordTxt.setVisible(false);
    	 manualAddBtn.setVisible(false);
    	 optionLabel1.setVisible(false);
    	 optionLabel2.setVisible(false);
     }
  //Function of giveSuggestionBtn
    if (e.getSource() == giveSuggestionsBtn) {
    	txt.setVisible(false);
    	addBtn.setVisible(false);
    	browseBtn.setVisible(false);
    	choiceLabel.setVisible(false);
        manualWordTxt.setVisible(false);
        manualAddBtn.setVisible(false);
        optionLabel1.setVisible(false);
        optionLabel2.setVisible(false);
     }
    //Function of addWordBtn
    if (e.getSource() == addWordBtn) {
    	txt.setVisible(false);
    	addBtn.setVisible(false);
    	browseBtn.setVisible(false);
    	choiceLabel.setVisible(false);
        manualWordTxt.setVisible(false);
        manualAddBtn.setVisible(false);
        optionLabel1.setVisible(false);
        optionLabel2.setVisible(false);
     }
    
    //Function of addWordBtn
    if (e.getSource() == manualAddBtn) {
    	manualWordTxt.getText();
    	txt.setVisible(true);
    	addBtn.setVisible(true);
    	browseBtn.setVisible(true);
    	choiceLabel.setVisible(true);
    	manualWordTxt.setVisible(true);
    	manualAddBtn.setVisible(true);
    	optionLabel1.setVisible(true);
    	optionLabel2.setVisible(true);
    	cont.sendmanualWords(manualWordTxt.getText());
    	
     }
  }
  
}
