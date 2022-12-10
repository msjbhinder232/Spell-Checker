package presentationLayer;
import presentationLayer.AppGui;
import  businessLayer.ReadXmlFiles;
import dataAccessLayer.DataBase;


public class Controller {
	
private ReadXmlFiles model;
private AppGui view;
private DataBase db;
	
public Controller() throws Exception {
	
	
	model = new ReadXmlFiles();
	db = new DataBase();
		
}

//path function
public void path() {
	model.folderPath();
}

public void sendWords() {
	db.insertWords();
}

public void sendmanualWords(String string) {
	db.addManualWord(string);
}



}
