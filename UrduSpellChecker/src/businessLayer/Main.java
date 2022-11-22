package com.mycompany.spellchecker;

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

public class Main {
	
	public static void main(String[] args) {
		
		// take input
		GenerateMutants gm = new GenerateMutants("موصول");
        System.out.println(gm.implementGenerateMutants());
    }

}