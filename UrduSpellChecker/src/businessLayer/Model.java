package businessLayer;
import java.io.File;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Model {
	
	private String title;
	private String author;
	private String paragraph;
	
	public Model() {
		
		readFile();
		
	}
	
	
	 /*
	   * author: Fahad-Bin-Imran 
	   * (20F-0194)
	   * 
	   * Make readFile function to  read file data
	   * */
	public void readFile() {
		
	  DocumentBuilderFactory fact = DocumentBuilderFactory.newInstance();
	  File file = new File("C:\\Users\\Mr Laptop\\Desktop\\demo\\dem.xml");
	  try {
		  
		  DocumentBuilder build = fact.newDocumentBuilder();
		  Document document = build.parse(file);
		  document.getDocumentElement().normalize();
		 
		  NodeList nodeList = document.getElementsByTagName("document");  
		  for (int itr = 0; itr < nodeList.getLength(); itr++)   
		  {  
		  Node node = nodeList.item(itr);  
		  if (node.getNodeType() == Node.ELEMENT_NODE)   
		  {  
		  Element eElement = (Element) node;  
		  title = document.getElementsByTagName("title").item(0).getTextContent();  
		  author = document.getElementsByTagName("name").item(0).getTextContent();  
		  paragraph = document.getElementsByTagName("section").item(0).getTextContent();  
		
		  
		  
		  }  
		 
		  }
		  
	  }
	  catch(Exception e) {
		  System.out.println(e.getMessage());
		  
	  }
	
		
		
		
	}
	
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

	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getParagraph() {
		return paragraph;
	}

	public void setParagraph(String paragraph) {
		this.paragraph = paragraph;
	}
}
