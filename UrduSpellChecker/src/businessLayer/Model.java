package businessLayer;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.io.FileReader;

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
	HashMap<String, Integer> frequency = new HashMap<>();

	
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

		
	}

	 /*
	   * author: Fahad-Bin-Imran 
	   * (20F-0194)
	   * 
	   * Make countWord function to maintain the frequency of words
	   * */
	public void countWord() throws Exception {
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Mr Laptop\\Desktop\\demo\\dem.xml"))) {
			

			String line = reader.readLine();
			while(line != null) {
				
				
				if(!line.trim().equals("")) {
					String [] words = line.split(" ");
					
					for(String word : words) {
						if(word == null || word.trim().equals("")) {
							continue;
						}
						String processed = word.toLowerCase();
						processed = processed.replaceAll("\\<.*?>", "");
						processed = processed.replaceAll("(?U)[\\W_]+", "");
						processed = processed.replaceAll("[a-zA-Z]+", "");
						processed = processed.replaceAll("[0-9]", "");
						processed = processed.replaceAll("\"<([^<]*)>", "");
			            processed = processed.replaceAll("</([^<]*)>\"", "");
			            processed = processed.replaceAll("\"([^<]*)<([^<]*)>([^<]*)\"", "\"$1&lt;$2&gt;$3\"");
						
						
						if(frequency.containsKey(processed)) {
							frequency.put(processed, 
									frequency.get(processed) + 1);
						} else {
							frequency.put(processed, 1);
						}
					}
				}
				
				line = reader.readLine();
			}
			
			
			System.out.println(frequency);
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
