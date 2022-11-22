package DataBase_Layer;

import java.io.File;
import javax.xml.parsers.*;
import org.w3c.dom.*;

/**
* Generate Mutants of Each Word Automatically:
* -> Mutants to cross varify the actual words
* -> Cat Mutates into Kat
* -> Site Mutates into Sit
*
* @author  Muhammad Saad Javed (20F-0349)
* @version 1.0
* @since   2022-11-22 
*/

public class ReadXML {
	public static void main(String[] args) throws Exception {
		//Get Docuemnt Builder
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		 
		//Build Document
		Document document = builder.parse(new File("D:\\Eclipse IDE\\Spell_Checker\\0001.xml"));
		 
		//Normalize the XML Structure; It's just too important !!
		document.getDocumentElement().normalize();
		 
		//Here comes the root node
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		 
		//Get all
		NodeList mList = document.getElementsByTagName("meta");
		System.out.println("============================");
		 
		for (int temp = 0; temp < mList.getLength(); temp++)
		{
		 Node node = mList.item(temp);
		 System.out.println("");    //Just a separator
		 if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    //Print each detail
		    Element eElement = (Element) node;
		    System.out.println("Title : "  + eElement.getElementsByTagName("title").item(0).getTextContent());
		    System.out.println("Author Name : "   + eElement.getElementsByTagName("name").item(0).getTextContent());
		 }
		
		}
	}
}