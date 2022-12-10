package PresentationLayer;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;

import LogicLayer.ModelHighlights;

public class HighlightDesignControl {
	ModelHighlights ModelHighlights;
	DesignPatternHighlight view;
	ArrayList<String> List=new ArrayList<String>();
	
	 /*
     * author: Muhammad Atif Siddique
     * (20F-0106)
     * 
     * here is class of highlights usecase controller
     * */
	public HighlightDesignControl(ModelHighlights m, DesignPatternHighlight v) {
		ModelHighlights = m;
		view = v;
	}

	public void getStartController() {
		view.getBtnNewButton().addActionListener(e -> {
			String inputWord=view.getTextArea().getText();
			actionOnButton(inputWord);

		});
		//Text1 = new JTextField(20);
	    view.getTextArea_1().addKeyListener(new KeyAdapter() {
	        public void keyReleased(KeyEvent e)
	        {
	            
	            String text = view.getTextArea_1().getText();
	            inputInTextField(text);
	        }
	    });
	    };
	  
	       
	         
	           

	private void actionOnButton(String inputWord) {
		List=ModelHighlights.getWord();
		inputWord+="";
		String [] w=inputWord.split(" ");
		String lineWrong="";
		ArrayList<String> wrongWords=ModelHighlights.check(List,w);
		ModelHighlights.editDis(inputWord);
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
	};
	private void inputInTextField(String text) {
	     // create the list
       // sujList = new JList(List);
		//view.setTextArea3();
		List=ModelHighlights.getWord();
        if (text.isEmpty()) {
        	view.setTextArea3().setVisible(false);
        } else {
        	view.setTextArea3().setVisible(true);
        }
        ArrayList<String> filteredsuj = new ArrayList<>();
        for (String sugg : List)
        {
            if (sugg.toLowerCase().contains(text.toLowerCase()))
            {
                filteredsuj.add(sugg);
            }
        }
        String[] filteredsujArray = filteredsuj
                .toArray(new String[filteredsuj.size()]);
      
        view.setTextArea3().setListData(filteredsujArray);
        
    


		
	};
	
	

}
