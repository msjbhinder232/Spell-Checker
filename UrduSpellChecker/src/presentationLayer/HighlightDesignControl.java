package lab5;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

import Logic.Model;
 /*
     * author: Muhammad Atif Siddique
     * (20F-0106)
     * 
     * here is code of highlights of class controller
     * */
public class DesignControl {
	Model model;
	DesignPattern view;
	ArrayList<String> List=new ArrayList<String>();
	
	
	public DesignControl(Model m, DesignPattern v) {
		model = m;
		view = v;
	}

	public void getStartController() {
		view.getBtnNewButton().addActionListener(e -> {
			String line=view.getTextArea().getText();
			actionOnButton(line);

		});
	}

	private void actionOnButton(String line) {
		List=model.getWord();
		if(List==null) {
			System.out.println("ڈیٹا بیس سے الفاظ کی فہرست خالی ہے۔");
		}
		line+=" ";
		String [] w=line.split(" ");
		String lineWrong="";
		ArrayList<String> wrongWords=model.check(List,w);
		for (int i = 0; i < wrongWords.size(); i++) {
			String string = wrongWords.get(i);
			lineWrong+=string+" ";
			
		}
		view.getTextArea_1().setText(lineWrong);
		Highlighter highLight = view.getTextArea_1().getHighlighter();
		highLight.removeAllHighlights();
		HighlightPainter y = new DefaultHighlighter.DefaultHighlightPainter(Color.red);
		try {
			highLight.addHighlight(0,lineWrong.length() , y);
		} catch (BadLocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
