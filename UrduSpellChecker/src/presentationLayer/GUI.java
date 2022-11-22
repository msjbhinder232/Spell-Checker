package Presentation_Layer;

import java.awt.*;       // Using AWT layouts
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*;    // Using Swing components and containers

import Business_Layer.GenerateMutants;

/**
* Generate Mutants of Each Word Automatically:
* -> Mutants to cross varify the actual words
* -> Cat Mutates into Kat
* -> Site Mutates into Sit
*
* @author  Muhammad Saad Javed (20F-0349)
* @version 1.0
* @since   2022-11-22 
*/

//Creating the GUI
class MyFrame extends JFrame implements ActionListener {
  
  public JButton btn1, btn2;  // Declare a Button component
  public TextField textField; // Declare a TextField component
  public JLabel label; // Declare a Label component
  public JTextArea textArea; // Declare a TextArea component
  
  public MyFrame() {
	  
    JPanel mainPanel = new JPanel(); // Add a JPanel into the content-pane
    
    setTitle("Urdu Spell Checker"); // "super" Frame sets title
    setSize(500, 500); // "super" Frame sets initial size
    
    mainPanel.setLayout(null); // "super" frame sets to FlowLayout
    mainPanel.setPreferredSize(new Dimension(500, 500)); // "super" Frame sets its initial window size
    mainPanel.setBackground(Color.LIGHT_GRAY); // "super" Frame sets its Background color
    
    label = new JLabel("لفظ درج کریں"); // Add a Label into the content-pane
    label.setBounds(180, 0, 150, 50); // "super" frame sets to Bound
    label.setForeground(Color.white); // "super" frame sets to Foreground
    label.setFont(new Font("Serif", Font.PLAIN, 30)); // "super" frame sets to Font
    
    textField = new TextField(20); // construct the TextField component with initial text
    textField.setBounds(175, 50, 150, 30); // "super" frame sets to Bound
    textField.setFont(new Font("Serif", Font.PLAIN, 20)); // "super" frame sets to Font
    
    mainPanel.add(label); // "this" Container adds the Label
    mainPanel.add(textField); //"this" Container adds the TextField
    
    btn1 = new JButton("Enter");
    btn1.setBounds(143, 115, 90, 30); // "super" frame sets to Bound
    btn1.setBackground(Color.red); // "super" Frame sets its Background color
    btn1.setForeground(Color.white); // "super" Frame sets its Background
    btn2 = new JButton("Clear"); //Set b JButton
    btn2.setBounds(253, 115, 90, 30); //Location of the b JButton
    btn2.setBackground(Color.red); //Set Background of the JButton
    btn2.setForeground(Color.white); //Set the font color of the JButton
    
    mainPanel.add(btn2); //Add b Label to panel
    mainPanel.add(btn1); //Add b2 Label to panel
    
    textArea = new JTextArea(10, 30); //Set a1 JTextArea
    textArea.setBounds(120, 150, 150, 150); //Location of the a1 JTextArea
    textArea.setEditable(false); //Set the a1 editable to False
    
    mainPanel.add(textArea); //Add a1 Label to panel
    JScrollPane scrollPane = new JScrollPane(textArea); //initializing one JScrollPane and add to a1
    scrollPane.setBounds(45, 200, 400, 150); //Location of the scrollPane JScrollPane
    mainPanel.add(scrollPane); //Add scrollPane Label to panel
    add(mainPanel); //Add panel to the Frame
    
    btn2.addActionListener(this); //Set b to actionPerformed
    btn1.addActionListener(this); //Set b2 to actionPerformed
    
    setVisible(true); //Set the frame visible to true
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Set the frame with DefaultCloseOperation

  }
  
  //Functions of the Buttons
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btn2) //If button b is clicked
    {
      textField.setText(""); //Clear the t1 TextField
      textArea.setText(""); //Clear the a1 JTextArea
    }
    if (e.getSource() == btn1) //If button b2 is clicked
    {

      String str = textField.getText();

      // take input
      GenerateMutants gm = new GenerateMutants(str);
      //System.out.println(gm.implementGenerateMutants());

      textArea.setFont(new Font("Serif", Font.PLAIN, 20)); //Set the a1 Font
      textArea.setText(gm.implementGenerateMutants()); //Set the a1 output

    }
  }
}

class GUI {
	  public static void main(String[] args) {
		  
	    //Calling the MyFrame Class
	    new MyFrame();
	  }
	}