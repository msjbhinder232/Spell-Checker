package dataAccessLayer;
import businessLayer.Model;

import java.sql.*;


public class DataBase {
	Connection con = null;
    Statement stmt = null;
    private Model model;
    
    public DataBase() {
    	
    	model = new Model();
    
    }
    
    /*
     * author: Fahad-Bin-Imran 
     * (20F-0194)
     * 
     * Make insertData function to connect and insert data into Datbase
     * */
	public void insertData(){
		
		

		try {
			
			
			int i = 1;
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker", "root", "");
			System.out.println("Connected");
			
			System.out.println("Inserting data into table");
			stmt = con.createStatement();
			
			String insert = "INSERT INTO `content`(`id`, `title`, `author`, `paragraph`) VALUES ('" + i + "' , '" + model.getTitle() + "' ,'" + model.getAuthor() + "','" + model.getParagraph() + "')";
			stmt.executeUpdate(insert);

			System.out.println("Inserted");
			
			
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}
	
	/*
     * author: Fahad-Bin-Imran 
     * (20F-0194)
     * 
     * Make insertWords function to connect and insert data
     * */
	
	public void insertWords(){
		
		

		try {
			
			
			int i = 1;
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker", "root", "");
			System.out.println("Connected");
			
			System.out.println("Inserting data into table");
			stmt = con.createStatement();
			
			String insert = "INSERT INTO `words`(`wid`, `word`, `frequency`) VALUES ('" + i + "' , '" + model.getWords() + "' ,'" + model.getFrequency() + "','" + "')";
			stmt.executeUpdate(insert);

			System.out.println("Inserted");
			
			
		}
		
		   catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

}
