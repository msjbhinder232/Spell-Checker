package testingBusinessLayer;
import buisnessLayer.Model;
import businessLayer.ReadXmlFiles;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.Reader;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestBusinessLayer {

	@Test
	public void perfectFile(){
		ReadXmlFiles model = new ReadXmlFiles();
		File file = new File("C:\\Users\\Mr Laptop\\Desktop\\demo");
		Assertions.assertTrue(model.readFile(""));
	}
	
	@Test
	public void noContent(){
		ReadXmlFiles model = new ReadXmlFiles();
		File file = new File("C:\\Users\\Mr Laptop\\Desktop\\demo");
		Assertions.assertFalse(model.readFile(file));
	}
	
	@Test
	public void noTitle(){
		ReadXmlFiles model = new ReadXmlFiles();
		File file = new File("C:\\Users\\Mr Laptop\\Desktop\\demo");
		Assertions.assertTrue(model.readFile(file));
	}
	
	@Test
	public void noAuthor(){
		ReadXmlFiles model = new ReadXmlFiles();
		File file = new File("C:\\Users\\Mr Laptop\\Desktop\\demo");
		Assertions.assertTrue(model.readFile(file));
	}

}
