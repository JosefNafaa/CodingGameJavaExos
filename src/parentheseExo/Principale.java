package parentheseExo;

import java.util.Stack;

public class Principale {
	public static void main(String... args) {

		String phrase = "je suis (rafael [nadal]de mallorca)";
		System.out.println(Principale.estParenthese(phrase));
	}

	public static boolean estParenthese(String phrase) {
		Stack<String> stack = new Stack<>();

		for (int i = 0; i < phrase.length(); i++) {
			if (phrase.charAt(i) == '(') {
				stack.push(")");
			} else if (phrase.charAt(i) == '[') {
				stack.push("]");
			}

			else if (phrase.charAt(i) == ')' && stack.peek().equals(")")) {
				stack.pop();
			} else if (phrase.charAt(i) == ']' && stack.peek().equals("]")) {
				stack.pop();
			}

		}
		if (!stack.empty() || stack.size() != 0) {
			return false;
		}
		return true;
	}
}
