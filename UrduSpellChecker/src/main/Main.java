package main;

import presentationLayer.Controller;
import presentationLayer.AppGui;

public class Main {
	
public static void main(String[] args){
		
	    try {
	    	new AppGui();
			new Controller();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	   
	}

 
}
