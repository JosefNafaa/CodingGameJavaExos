package wordCounter;

public class WordCounter {
	public static String count(String input) {
		if (input == null || input.isEmpty()) {
			return 0 + "";
		}
		String[] words = input.split("\\s+");
		return words.length + "";
	}

}
