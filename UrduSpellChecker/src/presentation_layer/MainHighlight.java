package lab5;

import Logic.Model;

public class DesignMain {
 /*
     * author: Muhammad Atif Siddique
     * (20F-0106)
     * 
     * here is main of highlights of class controller
     * */
	public static void main(String[] args) {
		DesignPattern v = new DesignPattern();
		v.setVisible(true);
		Model m = new Model();
		DesignControl c = new DesignControl(m, v);
		c.getStartController();
	}

}
