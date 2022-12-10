package PresentationLayer;

import javax.swing.JFrame;

import LogicLayer.ModelHighlights;

public class MainHighlight {
	 /*
     * author: Muhammad Atif Siddique
     * (20F-0106)
     * 
     * here is code of highlights usecase main class
     * */
	public static void main(String[] args) {
		//DesignPatternHighlight searchBar = new DesignPatternHighlight();
      
		DesignPatternHighlight v = new DesignPatternHighlight();
		  v.sujList.setVisible(false);
	        
	        v.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		v.setVisible(true);
		ModelHighlights m = new ModelHighlights();
		HighlightDesignControl c = new HighlightDesignControl(m, v);
		c.getStartController();
		
	}

}
