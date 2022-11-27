package Presentation_Layer;

import java.awt.*; // Using AWT layouts
import java.awt.event.*; // Using AWT event classes and listener interfaces
import javax.swing.*; // Using Swing components and containers

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
class View extends JFrame implements ActionListener {

  public JTextArea inputTextArea, outputTextArea; // Declare a TextArea component
  public JButton importDataBtn, generateMutantsBtn, highlightTyposBtn, giveSuggestionsBtn, clearBtn;
  public JLabel inputLabel, outputLabel; // Declare a Label component

  public View() {

    JPanel mainPanel = new JPanel();

    setTitle("Urdu Spell Checker");
    setSize(800, 725);

    mainPanel.setLayout(null);
    mainPanel.setPreferredSize(new Dimension(500, 500));
    mainPanel.setBackground(Color.LIGHT_GRAY);

    inputLabel = new JLabel("Fetch Data");
    inputLabel.setBounds(250, 10, 150, 50);
    inputLabel.setForeground(Color.white);
    inputLabel.setFont(new Font("Serif", Font.PLAIN, 30));
    mainPanel.add(inputLabel);

    inputTextArea = new JTextArea(100, 100);
    inputTextArea.setBounds(50, 70, 525, 250);
    inputTextArea.setEditable(false);
    mainPanel.add(inputTextArea);
    JScrollPane scrollPane = new JScrollPane(inputTextArea);
    scrollPane.setBounds(50, 70, 525, 250);
    mainPanel.add(scrollPane);
    add(mainPanel);

    outputLabel = new JLabel("Display Data");
    outputLabel.setBounds(250, 335, 200, 50);
    outputLabel.setForeground(Color.white);
    outputLabel.setFont(new Font("Serif", Font.PLAIN, 30));
    mainPanel.add(outputLabel);

    outputTextArea = new JTextArea(100, 100);
    outputTextArea.setBounds(50, 400, 525, 250);
    outputTextArea.setEditable(false);
    mainPanel.add(outputTextArea);
    JScrollPane scrollPane1 = new JScrollPane(outputTextArea);
    scrollPane1.setBounds(50, 400, 525, 250);
    mainPanel.add(scrollPane1);
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

    clearBtn = new JButton("Clear");
    clearBtn.setBounds(620, 450, 120, 30);
    clearBtn.addActionListener(this);

    mainPanel.add(importDataBtn);
    mainPanel.add(generateMutantsBtn);
    mainPanel.add(highlightTyposBtn);
    mainPanel.add(giveSuggestionsBtn);
    mainPanel.add(clearBtn);

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
    if (e.getSource() == clearBtn) {
      inputTextArea.setText("");
      outputTextArea.setText("");
    }
    if (e.getSource() == generateMutantsBtn) {}
  }

  public static void main(String[] args) {
    new View();
  }
}