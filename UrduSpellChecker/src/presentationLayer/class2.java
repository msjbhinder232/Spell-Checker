package lab5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import mutantpackage.GenerateMutants;

public class class2 {
	private GenerateMutants model;
	private IdealWeight view;
	private Connection con;
	public class2(GenerateMutants m, IdealWeight v) {
		model = m;
		view = v;
	}

	public void conec() {
		try {

			int i = 1;
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "");
			System.out.println("Connected");

		}
		catch (Exception e) {

			System.out.println(e.getMessage());
		}
	}


	public void wordAction() {
		view.getBtnNewButton().addActionListener(e -> {
			try {
				String textWord = "";
				textWord = view.getTextFieldtext().toString();
				if (textWord == null || textWord.equals(" ") || textWord.equals("  ") || textWord.equals("   "))
				{
					view.showException("Invalid Input");
				} else {
					ButtonClick(textWord);
				}
			} catch (Exception e1) {
 				System.out.println(e1);
			}
		});
	}

	private void ButtonClick(String s) {

	}
}