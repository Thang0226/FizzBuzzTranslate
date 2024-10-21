public class FizzBuzzTranslate {
	public String translate(int number) {
		boolean divisibleBy3 = number % 3 == 0;
		boolean divisibleBy5 = number % 5 == 0;
		if (divisibleBy3 && divisibleBy5) {
			return "FizzBuzz";
		} else if (divisibleBy3) {
			return "Fizz";
		} else if (divisibleBy5) {
			return "Buzz";
		}
		return "" + number;
	}
}
