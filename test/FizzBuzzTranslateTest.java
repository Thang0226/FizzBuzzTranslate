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
		String result = translator.FizzBuzztranslate(number);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Return 'Buzz' when divisible by 5")
	public void testReturnFizzWhenDivisibleBy5() {
		// arrange
		int number = 25;
		String expected = "Buzz";
		// action
		FizzBuzzTranslate translator = new FizzBuzzTranslate();
		String result = translator.FizzBuzztranslate(number);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Return 'FizzBuzz' when divisible by 3 and 5")
	public void testReturnFizzBuzzWhenDivisibleBy3And5() {
		// arrange
		int number = 30;
		String expected = "FizzBuzz";
		// action
		FizzBuzzTranslate translator = new FizzBuzzTranslate();
		String result = translator.FizzBuzztranslate(number);
		// assert
		assertEquals(expected, result);
	}

//	@Test
//	@DisplayName("Return 'number' when not divisible by 3 or 5")
//	public void testReturnStringWhenNotDivisibleBy3Or5() {
//		// arrange
//		int number = 29;
//		String expected = "29";
//		// action
//		FizzBuzzTranslate translator = new FizzBuzzTranslate();
//		String result = translator.FizzBuzztranslate(number);
//		// assert
//		assertEquals(expected, result);
//	}

	@Test
	@DisplayName("Return 'Fizz' when number includes digit 3")
	public void testReturnFizzWhenIncludeDigit3() {
		// arrange
		int number = 23;
		String expected = "Fizz";
		// action
		FizzBuzzTranslate translator = new FizzBuzzTranslate();
		String result = translator.FizzBuzztranslate(number);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Return 'Buzz' when number includes digit 5")
	public void testReturnBuzzWhenIncludeDigit5() {
		// arrange
		int number = 52;
		String expected = "Buzz";
		// action
		FizzBuzzTranslate translator = new FizzBuzzTranslate();
		String result = translator.FizzBuzztranslate(number);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Return 'FizzBuzz' when number includes digit 5 and 3")
	public void testReturnFizzBuzzWhenIncludeDigit5And3() {
		// arrange
		int number = 523;
		String expected = "FizzBuzz";
		// action
		FizzBuzzTranslate translator = new FizzBuzzTranslate();
		String result = translator.FizzBuzztranslate(number);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Return number pronunciation with non-Fizz/Buzz case 1")
	public void testReturnNumberPronunciationWithNonFizzBuzzCase1() {
		// arrange
		int number = 11;
		String expected = "muoi mot";
		// action
		FizzBuzzTranslate translator = new FizzBuzzTranslate();
		String result = translator.FizzBuzztranslate(number);
		// assert
		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Return number pronunciation with non-Fizz/Buzz case 2")
	public void testReturnNumberPronunciationWithNonFizzBuzzCase2() {
		// arrange
		int number = 89;
		String expected = "tam chin";
		// action
		FizzBuzzTranslate translator = new FizzBuzzTranslate();
		String result = translator.FizzBuzztranslate(number);
		// assert
		assertEquals(expected, result);
	}
}