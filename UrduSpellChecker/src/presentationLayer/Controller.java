package presentationLayer;
import  businessLayer.Model;

import java.io.File;

public class Controller {
	
private Model model;
	
public Controller() {
	
	new View();
	model = new Model();
}

public void path() {
	model.folderPath();
}


}
