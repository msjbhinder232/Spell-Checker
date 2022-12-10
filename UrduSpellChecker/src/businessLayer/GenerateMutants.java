// package
package businessLayer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
* Generate Mutants of Each Word Automatically:
* -> Mutants to cross varify the actual words
* -> Cat Mutates into Kat
* -> Site Mutates into Sit
*
* @author  Muhammad Saad Javed (20F-0349)
* @version 1.1
* @since   2022-12-10 
*/

public class GenerateMutants {
  public static void main(String[] args) {
	  
    String inputString = "";

    // Create a regular expression that matches the characters you want to replace
    Pattern pattern = Pattern.compile("[(ے|ی|ھ|ہ|و|ں|ن|م|ل|گ|ک|ق|ف|غ|ع|ظ|ط|ض|ص|ش|س|ژ|ز|ڑ|ر|ذ|ڈ|د|خ|ح|چ|ج|ث|ٹ|ت|پ|ب|آ|ا|ء)]");
    Matcher matcher = pattern.matcher(inputString);

    // Use a StringBuilder to store the resulting text
    StringBuilder result = new StringBuilder();

    // Loop through all the matches and replace them with the corresponding character
    while (matcher.find()) {
      String character = matcher.group();
      switch (character) {
      case "ک":
        matcher.appendReplacement(result, "ق");
        break;
      case "ق":
        matcher.appendReplacement(result, "ک");
        break;
      case "ث":
        // Replace "ث" with "ص"
        result.setLength(0);
        result.append("ص");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ث" with "ش"
        result.setLength(0);
        result.append("ش");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ث" with "س"
        result.setLength(0);
        result.append("س");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ص":
        // Replace "ص" with "ث"
        result.setLength(0);
        result.append("ث");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ص" with "ش"
        result.setLength(0);
        result.append("ش");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ص" with "س"
        result.setLength(0);
        result.append("س");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ش":
        // Replace "ش" with "ث"
        result.setLength(0);
        result.append("ث");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ش" with "ص"
        result.setLength(0);
        result.append("ص");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ش" with "س"
        result.setLength(0);
        result.append("س");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "س":
        // Replace "س" with "ث"
        result.setLength(0);
        result.append("ث");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "س" with "ص"
        result.setLength(0);
        result.append("ص");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "س" with "ش"
        result.setLength(0);
        result.append("ش");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ض":
        // Replace "ض" with "ظ"
        result.setLength(0);
        result.append("ظ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ض" with "ذ"
        result.setLength(0);
        result.append("ذ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ض" with "ز"
        result.setLength(0);
        result.append("ز");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ظ":
        // Replace "ظ" with "ض"
        result.setLength(0);
        result.append("ض");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ظ" with "ذ"
        result.setLength(0);
        result.append("ذ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ظ" with "ز"
        result.setLength(0);
        result.append("ز");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ذ":
        // Replace "ذ" with "ض"
        result.setLength(0);
        result.append("ض");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ذ" with "ظ"
        result.setLength(0);
        result.append("ظ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ذ" with "ز"
        result.setLength(0);
        result.append("ز");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ز":
        // Replace "ز" with "ض"
        result.setLength(0);
        result.append("ض");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ز" with "ظ"
        result.setLength(0);
        result.append("ظ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ز" with "ذ"
        result.setLength(0);
        result.append("ذ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ڈ":
        matcher.appendReplacement(result, "د");
        break;
      case "د":
        matcher.appendReplacement(result, "ڈ");
        break;
      case "ط":
        // Replace "ط" with "ٹ"
        result.setLength(0);
        result.append("ٹ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ط" with "ت"
        result.setLength(0);
        result.append("ت");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ٹ":
        // Replace "ٹ" with "ط"
        result.setLength(0);
        result.append("ط");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ٹ" with "ت"
        result.setLength(0);
        result.append("ت");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ت":
        // Replace "ت" with "ط"
        result.setLength(0);
        result.append("ط");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ت" with "ٹ"
        result.setLength(0);
        result.append("ٹ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ھ":
        // Replace "ھ" with "ہ"
        result.setLength(0);
        result.append("ہ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ھ" with "ح"
        result.setLength(0);
        result.append("ح");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ہ":
        // Replace "ہ" with "ھ"
        result.setLength(0);
        result.append("ھ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ہ" with "ح"
        result.setLength(0);
        result.append("ح");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ح":
        // Replace "ح" with "ھ"
        result.setLength(0);
        result.append("ھ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);

        // Replace "ح" with "ہ"
        result.setLength(0);
        result.append("ہ");
        result.append(inputString.substring(matcher.end()));
        System.out.println(result);
        break;
      case "ں":
        matcher.appendReplacement(result, "ن");
        break;
      case "ن":
        matcher.appendReplacement(result, "ں");
        break;
      case "ڑ":
        matcher.appendReplacement(result, "ر");
        break;
      case "ر":
        matcher.appendReplacement(result, "ڑ");
        break;
      case "ا":
        matcher.appendReplacement(result, "ع");
        break;
      case "ع":
        matcher.appendReplacement(result, "ا");
        break;
      }
    }

    // Append the remaining text to the result
    matcher.appendTail(result);

    System.out.println(result); // Outputs
  }
}