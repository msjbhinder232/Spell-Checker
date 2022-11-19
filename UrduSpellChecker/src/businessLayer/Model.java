package businessLayer;
import java.io.File;



public class Model {
	
	public void folderPath() {
		
		String folderPath = "C:\\Users\\Mr Laptop\\Desktop\\";
		  
		  File folder = new File(folderPath);
		  
		  File[] files = folder.listFiles();
		  
		  //iterate the files array
		  for(File file:files) {
		   //check if the file
		   if(file.isFile()) {
		    //System.out.println("File - "+file.getName());
		   }
		  }
	}

}
