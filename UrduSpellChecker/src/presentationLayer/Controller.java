package presentationLayer;
import  businessLayer.Model;
import  dataAccessLayer.DataBase;


public class Controller {
	
private Model model;
private DataBase db;
private View view;
	
public Controller(View v,Model m,DataBase d) {
	
	view = v;
	model = m;
	db = d;
	
	
}

public void path() {
	model.folderPath();
}



public void addData() {
	view.addButton();
}


}
