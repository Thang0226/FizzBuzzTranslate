public class FizzBuzzTranslate {
	public String translate(int number) {
		if (number % 3 == 0) {
			return "Fizz";
		}
		return "" + number;
	}
}
