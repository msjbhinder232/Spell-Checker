package dataAccessLayer;


import java.io.File;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;


public class DataBase {
	Connection con = null;
    Statement stmt = null;
    //private Model model;
    ResultSet rs = null;
    String content;
    private String title;
	private String author;
	private String paragraph;
    
    public DataBase() throws Exception {
    	
    	//model = new Model();
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/spell_checker", "root", "");
    }
    
    /*
     * author: Fahad-Bin-Imran 
     * (20F-0194)
     * 
     * Make insertData function to connect and insert data into Datbase
     * */
	public void insertData(File f){
		
		DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();

		try {
			
			  DocumentBuilder build = fact.newDocumentBuilder();
			  Document document = build.parse(f);
			  document.getDocumentElement().normalize();
			 
			  title = document.getElementsByTagName("title").item(0).getTextContent();  
			  author = document.getElementsByTagName("name").item(0).getTextContent();  
			  paragraph = document.getElementsByTagName("section").item(0).getTextContent();  
			  
			    
				title = title.replaceAll("(?U)[\\W_]+", " ");
				title = title.replaceAll("[a-zA-Z]", " ");
				title = title.replaceAll("[0-9]", " ");
				title = title.trim();
				author = author.replaceAll("(?U)[\\W_]+", " ");
				author = author.replaceAll("[a-zA-Z]", " ");
				author = author.replaceAll("[0-9]", " ");
				author = author.trim();
				paragraph = paragraph.replaceAll("(?U)[\\W_]+", " ");
				paragraph = paragraph.replaceAll("[a-zA-Z]", " ");
				paragraph = paragraph.replaceAll("[0-9]", " ");
				
				paragraph = paragraph.trim();
				
			
		
			stmt = con.createStatement();
			
			String insert = "INSERT INTO `content`(`title`, `author`, `paragraph`) VALUES ('" + title + "' ,'" + author + "','" + paragraph + "')";
			stmt.executeUpdate(insert);

			System.out.println("Inserted");
			System.out.println("Title:" + title);
			System.out.println("Author" + author);
			System.out.println("Content" + paragraph);
			
			
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
	public void insertWords() {
		
		 String str = fetchData();
		 Map<String,Integer> mp=new HashMap<>();
		 
	    // Splitting to find the word
	    String arr[]=str.split(" ");

	    // Loop to iterate over the words
	    for(int i=0;i<arr.length;i++)
	    {
	        // Condition to check if the
	        // array element is present
	        // the hash-map
	        if(mp.containsKey(arr[i]))
	        {
	            mp.put(arr[i], mp.get(arr[i])+1);
	        }
	        else
	        {
	            mp.put(arr[i],1);
	        }
	    }
	    
	    // Loop to iterate over the
	    // elements of the map
	    for (Entry<String, Integer> entry : mp.entrySet())
	    {
	        //System.out.println(entry.getKey() + " = " + entry.getValue());
	        
	            try {
				
				
			
				
				     
				      System.out.println("Connected");
				
				
				      stmt = con.createStatement();
				
				      String insert = "INSERT INTO `words`(`word`, `frequency`) VALUES ('" + entry.getKey() + "' ,'" + entry.getValue() + "')";
				      stmt.executeUpdate(insert);

				      System.out.println("Inserted");
				
				
			}
			
			   catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
	    }
	        	
	   
		}
		
	
	
	
public String fetchData(){
		
		

		try {
			
			System.out.println("Connected");
			
			stmt = con.createStatement();
			
			String fetch = "SELECT `paragraph` FROM `content`";
			rs = stmt.executeQuery(fetch);
			
			while (rs.next()) {
				 
                content = rs.getString("paragraph");
                //System.out.println(content);
            }
			
			rs.close();

			System.out.println("Fetched");
			
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		return content;
		
		
		
	}


}
	


