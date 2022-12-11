// package
package business_layer;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Use Case No 1:
* 
* Generate Mutants of Each Word Automatically:
* -> Mutants to cross varify the actual words
* -> Cat Mutates into Kat
* -> Site Mutates into Sit
* 
* ********************************************
* 
* Use Case No 2:
* 
* Mutants should be according to Phonetics
* -> Remove Redundant Mutants
*-> Mutants should have similar sound
*-> Shift    ->   Swift      -> Gift
*
*
* @author  Muhammad Saad Javed (20F-0349)
* @version 1.2
* @since   2022-12-10 
*/

public class GenerateMutants {
	public static void main(String[] args) {
		
	    String inputString = "اصل";

	    // Create a regular expression that matches the characters you want to replace
	    Pattern pattern = Pattern.compile("[(ے|ی|ھ|ہ|و|ں|ن|م|ل|گ|ک|ق|ف|غ|ع|ظ|ط|ض|ص|ش|س|ژ|ز|ڑ|ر|ذ|ڈ|د|خ|ح|چ|ج|ث|ٹ|ت|پ|ب|آ|ا|ء)]");
	    Matcher matcher = pattern.matcher(inputString);

	    // Use a Set to store the unique mutants
	    Set<String> mutants = new HashSet<>();

	    // Loop through all the matches and replace them with the corresponding character
	    while (matcher.find()) {
	        String character = matcher.group();
	        // Use a regular expression to match the character and replace it with the corresponding character

	        // Generate mutants and add them to the Set
	        mutants.add(inputString.replaceAll("ق", "ک"));
	        mutants.add(inputString.replaceAll("ک", "ق"));
	        
	        mutants.add(inputString.replaceAll("ص", "ث"));
	        mutants.add(inputString.replaceAll("ش", "ث"));
	        mutants.add(inputString.replaceAll("س", "ث"));
	        mutants.add(inputString.replaceAll("ث", "ص"));
	        mutants.add(inputString.replaceAll("ش", "ص"));
	        mutants.add(inputString.replaceAll("س", "ص"));
	        mutants.add(inputString.replaceAll("ث", "ش"));
	        mutants.add(inputString.replaceAll("ص", "ش"));
	        mutants.add(inputString.replaceAll("س", "ش"));
	        mutants.add(inputString.replaceAll("ث", "س"));
	        mutants.add(inputString.replaceAll("ص", "س"));
	        mutants.add(inputString.replaceAll("ش", "س"));
	        
	        mutants.add(inputString.replaceAll("ظ", "ض"));
	        mutants.add(inputString.replaceAll("ذ", "ض"));
	        mutants.add(inputString.replaceAll("ز", "ض"));
	        mutants.add(inputString.replaceAll("ض", "ظ"));
	        mutants.add(inputString.replaceAll("ذ", "ظ"));
	        mutants.add(inputString.replaceAll("ز", "ظ"));
	        mutants.add(inputString.replaceAll("ض", "ذ"));
	        mutants.add(inputString.replaceAll("ظ", "ذ"));
	        mutants.add(inputString.replaceAll("ز", "ذ"));
	        mutants.add(inputString.replaceAll("ض", "ز"));
	        mutants.add(inputString.replaceAll("ظ", "ز"));
	        mutants.add(inputString.replaceAll("ذ", "ز"));
	        
	        mutants.add(inputString.replaceAll("د", "ڈ"));
	        mutants.add(inputString.replaceAll("ڈ", "د"));
	        
	        mutants.add(inputString.replaceAll("ٹ", "ط"));
	        mutants.add(inputString.replaceAll("ت", "ط"));
	        mutants.add(inputString.replaceAll("ط", "ٹ"));
	        mutants.add(inputString.replaceAll("ت", "ٹ"));
	        mutants.add(inputString.replaceAll("ط", "ت"));
	        mutants.add(inputString.replaceAll("ٹ", "ت"));
	        
	        mutants.add(inputString.replaceAll("ہ", "ھ"));
	        mutants.add(inputString.replaceAll("ح", "ھ"));
	        mutants.add(inputString.replaceAll("ھ", "ہ"));
	        mutants.add(inputString.replaceAll("ح", "ہ"));
	        mutants.add(inputString.replaceAll("ھ", "ح"));
	        mutants.add(inputString.replaceAll("ہ", "ح"));
	        
	        mutants.add(inputString.replaceAll("ن", "ں"));
	        mutants.add(inputString.replaceAll("ں", "ن"));
	        
	        mutants.add(inputString.replaceAll("ر", "ڑ"));
	        mutants.add(inputString.replaceAll("ڑ", "ر"));
	        
	        mutants.add(inputString.replaceAll("ع", "ا"));
	        mutants.add(inputString.replaceAll("ا", "ع"));
	        
	        mutants.add(inputString.replaceAll("خا", "کھا"));
	    }

	    // Print the unique mutants
	    for (String mutant : mutants) {
	        System.out.println(mutant);
	    }
	}

}