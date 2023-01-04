package PresentationLayer;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.LineBorder;
import javax.swing.ScrollPaneConstants;

public class DesignPatternHighlight extends JFrame {

	private JPanel contentPane;
	JButton Result_btn;
	JTextArea Text1;
	
	 /*
     * author: Muhammad Atif Siddique
     * (20F-0106)
     * 
     * here is code of highlights of Designing the GUI
     * */
	JTextArea result1;
	private JTable table;
	private JScrollPane scrollpane;
	private DefaultTableModel defaultmodel;
		
	public DesignPatternHighlight() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 596, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		getContentPane().setBackground(new Color(0, 191, 255));
		
		JLabel head_1 = new JLabel("یہاں کوئی بھی متن ٹائپ کریں.........!۔");
		head_1.setFont(new Font("Serif", Font.BOLD, 17));
		head_1.setBounds(260, 101, 231, 30);
		contentPane.add(head_1);
		
		  Text1 = new JTextArea();
		Text1.setBounds(51, 132, 458, 30);
		contentPane.add(Text1);
		
		result1 = new JTextArea();
		result1.setBackground(new Color(176, 224, 230));
		result1.setBounds(51, 191, 458, 31);
		contentPane.add(result1);
		
		 Result_btn = new JButton(" کلک");
		 Result_btn.setBackground(Color.MAGENTA);
		Result_btn.setBounds(235, 164, 55, 23);
		contentPane.add(Result_btn);
		
		JLabel resultBtnMemo = new JLabel("چیک کرنے کے لیے کلک کریں.    👈۔");
		resultBtnMemo.setFont(new Font("Serif", Font.BOLD, 10));
		resultBtnMemo.setBounds(300, 164, 144, 23);
		contentPane.add(resultBtnMemo);
		
		JLabel welcome = new JLabel("(-------اردو سپیل چیکر-------)");
		welcome.setFont(new Font("Serif", Font.BOLD | Font.ITALIC, 29));
		welcome.setBounds(115, 22, 350, 30);
		contentPane.add(welcome);
		 // create the list
        sujList = new JList();
        sujList.setBounds(303, 157, 134, 213);
        contentPane.add(sujList);
        sujList.setVisibleRowCount(20);
        sujList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
    
        sujList.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e )
            {
            	Text1.replaceSelection(sujList.getSelectedValue().toString());
//            	Text1.setText(sujList.getSelectedValue().toString());
            
            } 
        });
        

        // set the size and display the window
        setSize(734, 422);
       setVisible(true);
         
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table.setBackground(new Color(192, 192, 192));
		table.setBounds(380, 355, 670, 328);
		scrollpane=new JScrollPane(table,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		defaultmodel=new DefaultTableModel();
		table.setRowSelectionAllowed(false);
		table.setColumnSelectionAllowed(false);
		scrollpane.setBounds(23, 268, 529, 266);
		scrollpane.setViewportView(table);
		contentPane.add(scrollpane);
		table.setModel(defaultmodel);
		this.setVisible(true);
		defaultmodel.addColumn("suggestions");
		defaultmodel.addColumn("Edit Distance");
		String[] s={"Atifrow","Atif Row"};
		defaultmodel.addRow(s);
		
	
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
