import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import business_layer.ModelHighlights;

class ModelHighlightsTest {
@Test
	 void testCheck() {
	    // Create a test list of words
	    ArrayList<String> list = new ArrayList<>();
	    list.add("فرشتہ");
	    list.add("اور");

	    // Create a test array of strings
	    String[] words = {"فرشتہ", "فطرت"};

	    // Call the check method and save the result
	    ArrayList<String> result = ModelHighlights.check(list, words);

	    // Assert that the result is what we expect it to be
	    assertEquals("فرشتہ", result.get(0));
	}

	    @Test
	    void testCheck1() {
	        ModelHighlights model = new ModelHighlights();
	        
	        // Create an ArrayList of words
	        ArrayList<String> words = new ArrayList<String>(
	            Arrays.asList("فرشتہ", "اور", "فطرت", "moon")
	        );
	        
	        // Test the check method with different inputs
	        ArrayList<String> result1 = model.check(words, new String[]{"فرشتہ", "اور", "sun"});
	        assertEquals(1, result1.size());
	        assertEquals("sun", result1.get(0));
	        
	        ArrayList<String> result2 = model.check(words, new String[]{"فرشتہ", "اور", "فطرت", "moon"});
	        assertEquals(0, result2.size());
	        
	        ArrayList<String> result3 = model.check(words, new String[]{"فرشتہ", "اور", "فطرت", "moon", "planet"});
	        assertEquals(1, result3.size());
	        assertEquals("planet", result3.get(0));
	    }
	    
	    @Test
	    public void testCheck3() {
	        // Create an instance of the ModelHighlights class
	        ModelHighlights model = new ModelHighlights();

	        // Create a list of words to check against
	        ArrayList<String> wordList = new ArrayList<String>();
	        wordList.add("فرشتہ");
	        wordList.add("اور");
	        wordList.add("foobar");

	        // Create an array of words to check
	        String[] words = {"فرشتہ", "اور", "foo", "bar"};

	        // Call the check method and store the result in a list
	        ArrayList<String> result = model.check(wordList, words);

	        // Assert that the list contains the expected values
	        assertEquals(result.size(), 2);
	        assertTrue(result.contains("foo"));
	        assertTrue(result.contains("bar"));
	    }
	}

