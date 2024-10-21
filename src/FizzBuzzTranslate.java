public class FizzBuzzTranslate {
	public String translate(int number) {
		boolean divisibleBy3 = number % 3 == 0;
		boolean divisibleBy5 = number % 5 == 0;

		String number_str = "" + number;
		boolean contain3 = number_str.indexOf('3') > -1;
		boolean contain5 = number_str.indexOf('5') > -1;

		if (divisibleBy3 && divisibleBy5) {
			return "FizzBuzz";
		} else if (divisibleBy3 || contain3) {
			return "Fizz";
		} else if (divisibleBy5 || contain5) {
			return "Buzz";
		}
		return number_str;
	}
}
