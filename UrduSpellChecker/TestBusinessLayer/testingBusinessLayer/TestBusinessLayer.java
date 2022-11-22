package testingBusinessLayer;
import buisnessLayer.Model;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestBusinessLayer {

	@Test
	public void perfectFile(){
		Model model = new Model();
		File file = new File(path);
		Assertions.assertTrue(model.readFile(file));
	}
	
	@Test
	public void noContent(){
		Model model = new Model();
		File file = new File(path);
		Assertions.assertFalse(model.readFile(file));
	}
	
	@Test
	public void noTitle(){
		Model model = new Model();
		File file = new File(path);
		Assertions.assertTrue(model.readFile(file));
	}
	
	@Test
	public void noAuthor(){
		Model model = new Model();
		File file = new File(path);
		Assertions.assertTrue(model.readFile(file));
	}

}
