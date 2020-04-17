package findJoinPoint;

public class A {

	public static void main(String[] args) {
	String art=AsciiArt.printChar('A');
	System.out.println(art);
	char c=A.scanChar(art);
	System.out.println(c);
	}   

	public static char scanChar(String s) {
	    	int hashcodeS = s.hashCode();
		for (char c = 'A'; c <= 'Z'; c++) {
			// Check to see if the character corresponds with the ASCII art.
			
			int ascii = c;
			if (ascii == hashcodeS) {
				// Return the character if it does.
				return c;
			}
		}

		return (char) '?';

	}

}

class AsciiArt {
	public static String printChar(char s) {
		String c = Character.toString(s);
		return c;
	}
}