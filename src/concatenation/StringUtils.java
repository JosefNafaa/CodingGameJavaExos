package concatenation;

public class StringUtils {
	static String concatenation(String[] strings) {
		StringBuilder sb = new StringBuilder();
		 sb.append("");
		for (String s : strings) {
			sb.append(""+s);

		}
		return sb.toString();

	}

	public static void main(String[] args) {
		String[] strings= {"f","o","o","bar"};
		System.out.println("si");
	    System.out.println(concatenation(strings));
	}

}
