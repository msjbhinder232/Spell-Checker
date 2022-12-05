package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

 /*
     * author: Muhammad Atif Siddique
     * (20F-0106)
     * 
     * here is code of database connectivity or store word in string to match
     * */
public class database {
	Statement stat;

	public void createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DataBaseNameHere", "root","");
			stat = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("connection failed");
		}
	}
	public ArrayList<String> getWord() {

		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("Hi");
		
		return wordList;
	

	}

}
