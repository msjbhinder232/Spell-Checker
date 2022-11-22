// package
package com.mycompany.spellchecker;

// HashMap is similar to HashTable, but it is unsynchronized.
//It allows to store the null keys as well, but there should be 
//only one null key object and there can be any number of null values
import java.util.HashMap;
import java.util.Map;

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

// class GenerateMutants
public class GenerateMutants {
	
	

  private String inputString;

  // Create an empty hash map by declaring object
  // of Character and Character type
  public final static Map < Character, Character > map = new HashMap < Character, Character > () {

    {
      // Adding elements to the Map
      // using standard put() method
      put('ق', 'ک');
      put('ک', 'ق');

      put('ص', 'ث');
      put('ش', 'ث');
      put('س', 'ث');
      put('ث', 'ص');
      put('ش', 'ص');
      put('س', 'ص');
      put('ث', 'ش');
      put('ص', 'ش');
      put('س', 'ش');
      put('ث', 'س');
      put('ص', 'س');
      put('ش', 'س');

      put('ظ', 'ض');
      put('ذ', 'ض');
      put('ز', 'ض');
      put('ض', 'ظ');
      put('ذ', 'ظ');
      put('ز', 'ظ');
      put('ض', 'ذ');
      put('ظ', 'ذ');
      put('ز', 'ذ');
      put('ض', 'ز');
      put('ظ', 'ز');
      put('ذ', 'ز');

      put('د', 'ڈ');
      put('ڈ', 'د');

      put('ٹ', 'ط');
      put('ت', 'ط');
      put('ط', 'ٹ');
      put('ت', 'ٹ');
      put('ط', 'ت');
      put('ٹ', 'ت');

      put('ہ', 'ھ');
      put('ح', 'ھ');
      put('ھ', 'ہ');
      put('ح', 'ہ');
      put('ھ', 'ح');
      put('ہ', 'ح');

      put('ن', 'ں');
      put('ں', 'ن');

      put('ر', 'ڑ');
      put('ڑ', 'ر');

      put('و', 'ع');
      put('ے', 'ع');
      put('ی', 'ع');
      put('ا', 'ع');
      put('ع', 'و');
      put('ے', 'و');
      put('ی', 'و');
      put('ا', 'و');
      put('ع', 'ے');
      put('و', 'ے');
      put('ی', 'ے');
      put('ا', 'ے');
      put('ع', 'ی');
      put('و', 'ی');
      put('ے', 'ی');
      put('ا', 'ی');
      put('ع', 'ا');
      put('و', 'ا');
      put('ے', 'ا');
      put('ی', 'ا');

      // No homophone mappings
      put('آ', 'آ');
      put('غ', 'غ');
      put('چ', 'چ');
      put('ل', 'ل');
      put('پ', 'پ');
      put('ب', 'ب');
      put('ف', 'ف');
      put('گ', 'گ');
      put('ج', 'ج');
      put('م', 'م');
      put('خ', 'خ');
      put('ژ', 'ژ');

    }
  };

  // To fetch the value of the TupleClassObject from the index passed as the parameter
  public char getValue(char ch) {
    char value = map.get(ch);
    return value;
  }
  
  

  // Setter
  // It sets the value for inputString used in a class’s programs
  public GenerateMutants(String inputString) {
    this.inputString = inputString;
  }

  // method for implement Generate Mutants
  public String implementGenerateMutants() {

    // class used to create a mutable or a modifiable succession of characters
    StringBuilder sb = new StringBuilder(inputString);

    for (int i = 0; i < sb.length(); i++) {
      //currentChar = sb.charAt(i++);

      // Replace the character with their corresponding character
      // Do this for all characters
      sb.setCharAt(i, getValue(sb.charAt(i++)));
    }

    // return string
    String x = sb.toString();
    return (x);
  }

}