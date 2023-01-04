package Logic;

import java.util.ArrayList;
import java.util.Iterator;

import data.database;

public class Model {
 /*
     * author: Muhammad Atif Siddique
     * (20F-0106)
     * 
     * here is model class where login is included
     * */
	database dbLayer = new database();

	public ArrayList<String> getWord() {
		dbLayer.createConnection();
		ArrayList<String> list = new ArrayList<String>();
		return dbLayer.getWord();

	}

public ArrayList<String> check(ArrayList<String> List, String[] words) {
		ArrayList<String> wrongWord = new ArrayList<String>();
		boolean flag=true;
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			flag=false;
			for (Iterator iterator = List.iterator(); iterator.hasNext();) {
				String string = (String) iterator.next();
				if (word.equals(string)) {
					flag=true;
				}
			}
			if(flag==false) {				
				wrongWord.add(word);
			}
		}
		return wrongWord;


	}

}
