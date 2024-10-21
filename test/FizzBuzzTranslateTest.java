import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTranslateTest {

	@Test
	@DisplayName("Return 'Fizz' when divisible by 3")
	public void testReturnFizzWhenDivisibleBy3() {
		// arrange
		int number = 12;
		String expected = "Fizz";
		// action
		FizzBuzzTranslate translator = new FizzBuzzTranslate();
		String result = translator.translate(number);
		// assert
		assertEquals(expected, result);
	}

	
}