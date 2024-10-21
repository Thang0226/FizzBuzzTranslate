public class FizzBuzzTranslate {
	public String FizzBuzztranslate(int number) {
		final String CONCAT_STR = " ";
		boolean divisibleBy3 = number % 3 == 0;
		boolean divisibleBy5 = number % 5 == 0;

		String number_str = "" + number;
		boolean contain3 = number_str.indexOf('3') > -1;
		boolean contain5 = number_str.indexOf('5') > -1;

		if ((divisibleBy3 || contain3) && (divisibleBy5 || contain5)) {
			return "FizzBuzz";
		} else if (divisibleBy3 || contain3) {
			return "Fizz";
		} else if (divisibleBy5 || contain5) {
			return "Buzz";
		}

		if (number < 10) {
			return translate(number_str.charAt(0));
		} else if (number < 20) {
			return "muoi" + CONCAT_STR + translate(number_str.charAt(1));
		} else if (number < 100) {
			String firstWord = translate(number_str.charAt(0));
			String secondWord = translate(number_str.charAt(1));
			return firstWord + CONCAT_STR + secondWord;
		} else {
			return "";
		}
	}

	private String translate(char numChar) {
		return switch (numChar) {
			case '0' -> "muoi";
			case '1' -> "mot";
			case '2' -> "hai";
			case '3' -> "ba";
			case '4' -> "bon";
			case '5' -> "nam";
			case '6' -> "sau";
			case '7' -> "bay";
			case '8' -> "tam";
			case '9' -> "chin";
			default -> "";
		};
	}
}
