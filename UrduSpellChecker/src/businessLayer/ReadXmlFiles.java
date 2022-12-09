package businessLayer;

import dataAccessLayer.DataBase;

import java.io.File;




public class ReadXmlFiles {

	private DataBase db;
	

	
	public ReadXmlFiles() throws Exception {
		
			 db = new DataBase();
		  }
	
	
	/*
	   * author: Fahad-Bin-Imran 
	   * (20F-0194)
	   * 
	   * Make folderPath function to get folder path
	   * */
	public void folderPath() {
		
		 File file = new File("C:\\Users\\Mr Laptop\\Desktop\\demo");
		 String path = file.toString();
		 try {
		 readFile(path);
		 }
		 catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	}
		
		
	
	 /*
	   * author: Fahad-Bin-Imran 
	   * (20F-0194)
	   * 
	   * Make readFile function to  read file data
	   * */
	public void readFile(String path) {
		File file = new File(path);
		 File[] fileArray = file.listFiles();
		  for (File f:fileArray) {
			 System.out.println(f.toString());
			 db.insertData(f);
			  
			 
		  }
	}
		

	
	
}
