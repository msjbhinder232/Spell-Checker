package main;

import presentationLayer.Controller;
import presentationLayer.View;

import businessLayer.Model;
import dataAccessLayer.DataBase;



public class Main {
	
public static void main(String[] args){
		
	    new Controller(new View(new DataBase()),new Model(),new DataBase());
	   
	   
	}

 
}
