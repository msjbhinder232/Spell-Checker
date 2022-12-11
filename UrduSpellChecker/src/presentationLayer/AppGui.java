package presentationLayer;

import java.awt.*; // Using AWT layouts
import java.awt.event.*; // Using AWT event classes and listener interfaces
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.*; // Using Swing components and containers
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.jdbc.PreparedStatement;

import net.proteanit.sql.DbUtils;



//GUI of the Urdu Spell Checker
public class AppGui extends JFrame implements ActionListener {

  public JTextArea inputTextArea, outputTextArea; // Declare a TextArea component
  public JButton importDataBtn, generateMutantsBtn, highlightTyposBtn, giveSuggestionsBtn, clearBtn, addBtn, browseBtn, addNewWordBtn, manualAddBtn,updateDataBtn;
  public JLabel inputLabel, outputLabel,titleLabel, choiceLabel, optionLabel1,optionLabel2, idLabel, wordLabel, updateLabel; // Declare a Label component
  public JTextField txt, manualWordTxt, idTxt, wordTxt, updateWordTxt;
  public JFrame frame;
  public JTable jt1;
  public JScrollPane scrollPane;
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
   
    
    jt1 = new JTable();
    scrollPane = new JScrollPane();
    scrollPane.setBounds(50, 156, 452, 231);
    
    scrollPane.setViewportView(jt1);
    scrollPane.setVisible(false);
    mainPanel.add(scrollPane);


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
	
	idTxt = new JTextField();
	idTxt.setBackground(Color.WHITE);
	idTxt.setBounds(70, 480, 120, 20);
	idTxt.setColumns(10);
	
	wordTxt = new JTextField();
	wordTxt.setBackground(Color.WHITE);
	wordTxt.setBounds(260, 480, 120, 20);
	wordTxt.setColumns(10);
	
	updateWordTxt = new JTextField();
	updateWordTxt.setBackground(Color.WHITE);
	updateWordTxt.setBounds(450, 480, 120, 20);
	updateWordTxt.setColumns(10);
	
	

    clearBtn = new JButton("Clear");
    clearBtn.setBounds(620, 450, 120, 30);
    clearBtn.addActionListener(this);
    
    addNewWordBtn = new JButton("اپ ڈیٹ لفظ");
    addNewWordBtn.setBounds(620, 500, 120, 30);
    addNewWordBtn.addActionListener(this);
    addNewWordBtn.setFont(new Font("Serif", Font.BOLD, 16));
   
    
    updateDataBtn = new JButton("اپ ڈیٹ لفظ");
    updateDataBtn.setBounds(250,550, 145, 30);
    updateDataBtn.addActionListener(this);
    updateDataBtn.setFont(new Font("Serif", Font.BOLD, 16));
    
    
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
    
    
    idLabel  = new JLabel("آئی ڈی شامل کریں");
    idLabel.setBounds(50, 420, 200, 50);
    idLabel.setForeground(Color.white);
    idLabel .setFont(new Font("Serif", Font.PLAIN, 25));
    mainPanel.add(idLabel);
    
    wordLabel  = new JLabel("لفظ شامل کریں");
    wordLabel.setBounds(260, 420, 300, 50);
    wordLabel.setForeground(Color.white);
    wordLabel .setFont(new Font("Serif", Font.PLAIN, 25));
    mainPanel.add(wordLabel);
    
    updateLabel  = new JLabel("نیا لفظ شامل کریں");
    updateLabel.setBounds(440, 420, 300, 50);
    updateLabel.setForeground(Color.white);
    updateLabel .setFont(new Font("Serif", Font.PLAIN, 25));
    mainPanel.add(updateLabel);
    
	
    mainPanel.add(importDataBtn);
    mainPanel.add(generateMutantsBtn);
    mainPanel.add(highlightTyposBtn);
    mainPanel.add(giveSuggestionsBtn);
    mainPanel.add(clearBtn);
    mainPanel.add(txt);
    mainPanel.add(manualWordTxt);
    mainPanel.add(idTxt);
    mainPanel.add(wordTxt);
    mainPanel.add(updateWordTxt);
    mainPanel.add(addBtn);
    mainPanel.add(browseBtn);
    mainPanel.add(addNewWordBtn);
    mainPanel.add(manualAddBtn);
    mainPanel.add(updateDataBtn);
    txt.setVisible(false);
    manualWordTxt.setVisible(false);
    idTxt.setVisible(false);
    wordTxt.setVisible(false);
    updateWordTxt.setVisible(false);
    addBtn.setVisible(false);
    browseBtn.setVisible(false);
    choiceLabel.setVisible(false);
    manualAddBtn.setVisible(false);
    optionLabel1.setVisible(false);
    optionLabel2.setVisible(false);
    idLabel.setVisible(false);
    wordLabel.setVisible(false);
    updateLabel.setVisible(false);
    scrollPane.setVisible(false);
    updateDataBtn.setVisible(false);
    
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    
  
}
  
  
  public void addDataIntoJTable() throws SQLException {
	  Connection con = null;
	  Statement stmt = null;
	  ResultSet rs = null;
	  ResultSetMetaData rsmd = null;
	  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker", "root", "");
	  
		try {
			
			
			System.out.println("Connected");
			stmt = con.createStatement();
			
			String fetch = "SELECT * FROM `words`";
			rs = stmt.executeQuery(fetch);
			rsmd  = rs.getMetaData();
		    DefaultTableModel model = (DefaultTableModel) jt1.getModel();
			
		    int col = rsmd.getColumnCount();
		    String colName[] = new String[col];
		    for(int i=0;i<col;i++) {
		    	colName[i] = rsmd.getColumnName(i+1);
		    	model.setColumnIdentifiers(colName);
		    	String wid,word,frequency;
		    	while (rs.next()) {
					 
		            wid = rs.getString(1);
		            word = rs.getString(2);
		            frequency = rs.getString(3);
		            
		            String[] row = {wid,word,frequency};
		           
		            model.addRow(row);
		            
		            
		        }

		    }
		    rs.close();
		    con.close();
			System.out.println("Fetched");
			
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
			
	}
  
  
  
  public void updateTable() {
	  
	  DefaultTableModel model = (DefaultTableModel) jt1.getModel();
	  if(jt1.getSelectedRowCount() == 1) {
		 
		  String id = idTxt.getText();
		  String word = wordTxt.getText();
		  String newWord = updateWordTxt.getText();
		  
		  
		  model.setValueAt(newWord, jt1.getSelectedRow(), 1);
		 
	  }
	  else {
		  System.out.println("Update Error");
	  }
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
    	idLabel.setVisible(false);
    	wordLabel.setVisible(false);
    	updateLabel.setVisible(false);
        idTxt.setVisible(false);
        wordTxt.setVisible(false);
        updateWordTxt.setVisible(false);
        scrollPane.setVisible(false);
        updateDataBtn.setVisible(false);
    	
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
    	idLabel.setVisible(false);
    	wordLabel.setVisible(false);
    	updateLabel.setVisible(false);
        idTxt.setVisible(false);
        wordTxt.setVisible(false);
        updateWordTxt.setVisible(false);
        scrollPane.setVisible(false);
        updateDataBtn.setVisible(false);
			
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
    	idLabel.setVisible(false);
    	updateLabel.setVisible(false);
    	scrollPane.setVisible(false);
    	updateDataBtn.setVisible(false);
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
	    idLabel.setVisible(false);
	    wordLabel.setVisible(false);
	    updateLabel.setVisible(false);
	    idTxt.setVisible(false);
	    wordTxt.setVisible(false);
	    updateWordTxt.setVisible(false);
	    scrollPane.setVisible(false);
	    updateDataBtn.setVisible(false);
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
        idLabel.setVisible(false);
        wordLabel.setVisible(false);
        updateLabel.setVisible(false);
        idTxt.setVisible(false);
        wordTxt.setVisible(false);
        updateWordTxt.setVisible(false);
        scrollPane.setVisible(false);
        updateDataBtn.setVisible(false);
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
    	 idLabel.setVisible(false);
    	 wordLabel.setVisible(false);
    	 updateLabel.setVisible(false);
    	 idTxt.setVisible(false);
    	 wordTxt.setVisible(false);
    	 updateWordTxt.setVisible(false);
    	 scrollPane.setVisible(false);
    	 updateDataBtn.setVisible(false);
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
        idLabel.setVisible(false);
        wordLabel.setVisible(false);
        updateLabel.setVisible(false);
        idTxt.setVisible(false);
        wordTxt.setVisible(false);
        updateWordTxt.setVisible(false);
        scrollPane.setVisible(false);
        updateDataBtn.setVisible(false);
     }
    //Function of addWordBtn
    if (e.getSource() == addNewWordBtn) {
    	txt.setVisible(false);
    	addBtn.setVisible(false);
    	browseBtn.setVisible(false);
    	choiceLabel.setVisible(false);
        manualWordTxt.setVisible(false);
        manualAddBtn.setVisible(false);
        optionLabel1.setVisible(false);
        optionLabel2.setVisible(false);
        //table.setVisible(true);
        idLabel.setVisible(true);
        wordLabel.setVisible(true);
        updateLabel.setVisible(true);
        idTxt.setVisible(true);
        wordTxt.setVisible(true);
        updateWordTxt.setVisible(true);
        scrollPane.setVisible(true);
        updateDataBtn.setVisible(true);
        try {
			addDataIntoJTable();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
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
    	idLabel.setVisible(false);
    	wordLabel.setVisible(false);
    	updateLabel.setVisible(false);
        idTxt.setVisible(false);
        wordTxt.setVisible(false);
        updateWordTxt.setVisible(false);
        scrollPane.setVisible(false);
        updateDataBtn.setVisible(false);
    	cont.sendmanualWords(manualWordTxt.getText());
    	
     }
  
    
    //Function of updateDataBtn
    if (e.getSource() == updateDataBtn) {
    	idTxt.getText();
    	wordTxt.getText();
    	updateWordTxt.getText();
    	txt.setVisible(false);
    	addBtn.setVisible(false);
    	browseBtn.setVisible(false);
    	choiceLabel.setVisible(false);
        manualWordTxt.setVisible(false);
        manualAddBtn.setVisible(false);
        optionLabel1.setVisible(false);
        optionLabel2.setVisible(false);
        //table.setVisible(true);
        idLabel.setVisible(true);
        wordLabel.setVisible(true);
        updateLabel.setVisible(true);
        idTxt.setVisible(true);
        wordTxt.setVisible(true);
        updateWordTxt.setVisible(true);
        scrollPane.setVisible(true);
        //displayDataBtn.setVisible(true);
        updateDataBtn.setVisible(true);
        cont.updateData(idTxt.getText(),wordTxt.getText(),updateWordTxt.getText());
        updateTable();
   
       
     }
    
  }
  
}
