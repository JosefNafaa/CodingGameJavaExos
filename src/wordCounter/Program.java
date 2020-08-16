package wordCounter;

public class Program {

	String exec(String command, String text) {
		if (!"CountWord".equals(command)) {
			throw new IllegalArgumentException(command);
		}

		return WordCounter.count(text);

	}

}
