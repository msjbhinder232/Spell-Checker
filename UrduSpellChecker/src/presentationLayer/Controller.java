package presentationLayer;
import presentationLayer.View;
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
	try {
		model.countWord();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}

public void path() {
	view.browseButton();
}


public void addData() {
	view.addButton();
}



}
