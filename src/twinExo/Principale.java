package twinExo;

import java.util.Arrays;

public class Principale {

	public static void main(String[] args) {
		String a="Marion";
		String b="Romain";
		System.out.println(isTwin(a, b));

	}

	public static boolean isTwin(String a, String b) {
		a = a.toLowerCase();
		b = b.toLowerCase();
		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		a = Arrays.toString(ch1);
		b = Arrays.toString(ch2);
		return a.equals(b);
	}
}
