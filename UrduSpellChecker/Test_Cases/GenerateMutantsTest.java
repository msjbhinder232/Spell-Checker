import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import business_layer.GenerateMutants;

class GenerateMutantsTest {

  @Test
  void test() {
    fail("Not yet implemented");
  }

  @Test
  public void testEmptyString() {
    GenerateMutants gm = new GenerateMutants("");
    assertEquals("[]", gm.implementGenerateMutants());
  }

  @Test
  public void testGenerateMutants() {
    GenerateMutants gm = new GenerateMutants("قارون");
    String mutants = gm.implementGenerateMutants();
    assertEquals("[کارون, قازون, قارون, قاسون, قارن, قارون, قارنو]", mutants);

  }

  @Test
  public void testGenerateMutants1() {
    // Create an instance of the GenerateMutants class
    GenerateMutants generator = new GenerateMutants("قلم");

    // Call the implementGenerateMutants method to generate the mutants
    String mutants = generator.implementGenerateMutants();

    // Assert that the generated mutants are as expected
    assertEquals("[قلم, کلم, لم, لآم, لءم]", mutants);
  }

  @Test
  public void testGenerateMutants2() {
    // Create a new GenerateMutants object with the input string "قفغقفغ"
    GenerateMutants gm = new GenerateMutants("قفغقفغ");

    // Call the implementGenerateMutants method and store the result in a variable
    String mutants = gm.implementGenerateMutants();

    // Assert that the set of mutants includes the strings "کفغکفغ" and "قفغکفغ"
    assertEquals(mutants.contains("کفغکفغ"), true);
    assertEquals(mutants.contains("قفغکفغ"), true);
  }

  @Test
  public void testGenerateMutants3() {
    // Set up the input string
    String inputString = "صصصص";

    // Create a new instance of the GenerateMutants class
    GenerateMutants gm = new GenerateMutants(inputString);

    // Call the implementGenerateMutants method
    String result = gm.implementGenerateMutants();

    // Create a set of expected mutants
    Set < String > expected = new HashSet < > ();
    expected.add("صصصص");
    expected.add("ثثثث");
    expected.add("شششش");
    expected.add("سسسس");

    // Check if the result is correct
    assertEquals(expected, result);
  }

  @Test
  public void testSingleCharacter() {
    String input = "ے";

    // Create a new instance of the GenerateMutants class
    GenerateMutants gm = new GenerateMutants(input);

    String expectedOutput = "[ےۓ۔ەۖۗۘۙۚۛۜ۝۞۟]";
    String actualOutput = gm.implementGenerateMutants();
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testMultipleCharacters() {
    String input = "ھے کیا ہوتا ہے؟";

    // Create a new instance of the GenerateMutants class
    GenerateMutants gm = new GenerateMutants(input);

    String expectedOutput = "[ھے کیا ہوتا ہے؟, ھٔ کیا ہوتا ہے؟, ھۓ کیا ہوتا ہے؟, ھ۔ کیا ہوتا ہے؟, ھە کیا ہوتا ہے؟, ھۖ کیا ہوتا ہے؟, ھۗ کیا ہوتا ہے؟, ھۘ کیا ہوتا ہے؟, ھۙ کیا ہوتا ہے؟, ھۚ کیا ہوتا ہے؟, ھۛ کیا ہوتا ہے؟, ھۜ کیا ہوتا ہے؟, ھ۝ کیا ہوتا ہے؟, ھ۞ کیا ہوتا ہے؟, ھ۟ کیا ہوتا ہے؟]";
    String actualOutput = gm.implementGenerateMutants();
    assertEquals(expectedOutput, actualOutput);
  }

  @Test
  public void testGenerateMutants4() {
    Set < String > mutants = new HashSet < > ();
    String inputString = "قصشظدٹہنرعخاتھٹھ";
    GenerateMutants.generateMutants(inputString, mutants);

    // Assert that the expected mutants are in the set
    assertTrue(mutants.contains("کثشضدٹھنڑاکھاتھٹھ"));
    assertTrue(mutants.contains("قصشظڈٹھنرعخاتھٹھ"));
    assertTrue(mutants.contains("قصشظدطہنرعخاتھطھ"));
    assertTrue(mutants.contains("قصشظدٹھنرعخاتہٹہ"));
    assertTrue(mutants.contains("قصشظدٹہنرعخاتھٹھ"));

    // Assert that there are no other elements in the set
    assertEquals(5, mutants.size());
  }

  @Test
  public void testGenerateMutants5() {
    Set < String > mutants = new HashSet < > ();
    String inputString = "طریقہ";

    // Generate mutants of the input string and add them to the set
    GenerateMutants.generateMutants(inputString, mutants);

    // Assert that the correct number of mutants are generated
    assertEquals(mutants.size(), 31);

    // Assert that all the expected mutants are present in the set
    assertTrue(mutants.contains("طریقہ"));
    assertTrue(mutants.contains("طریقه"));
    assertTrue(mutants.contains("طریقة"));
    assertTrue(mutants.contains("طریقح"));
    assertTrue(mutants.contains("طریقھ"));
    assertTrue(mutants.contains("طریقن"));
    assertTrue(mutants.contains("طریقں"));
    assertTrue(mutants.contains("طریقر"));
    assertTrue(mutants.contains("طریقڑ"));
    assertTrue(mutants.contains("طریقع"));
    assertTrue(mutants.contains("طریقا"));
    assertTrue(mutants.contains("طریقخا"));
    assertTrue(mutants.contains("طریقتھ"));
    assertTrue(mutants.contains("طریقٹھ"));
  }
}