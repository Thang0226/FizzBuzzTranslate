import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTranslateTest {

	@Test
	@DisplayName("Output a String")
	public void testOutputAString() {
		// arrange
		int number = 12;
		String expected = "12";
		// action
		FizzBuzzTranslate translator = new FizzBuzzTranslate();
		String result = translator.translate(number);
		// assert
		assertEquals(expected, result);
	}
}