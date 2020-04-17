/**
 * 
 */
package findJoinPoint;

import java.util.HashSet;
import java.util.Set;

/**
 * @author TALBI
 *
 */
public class FindJoinPoint {

	final static long LIMIT = 20000000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int s1 = 11;
		int s2 = 13;

		long debut = System.currentTimeMillis();
		System.out.println(findJointure(s1, s2));
		long fin = System.currentTimeMillis();

		System.out.println("executé en " + (fin - debut) + " milisecondes.");
		System.out.println("opération");
		System.out.println(01 | 11);

	}

	public static long findJointure(int s1, int s2) {

		Set<Integer> suite1 = new HashSet<Integer>();
		Set<Integer> suite2 = new HashSet<Integer>();
		suite1.add(s1);
		suite2.add(s2);
		int tmp = 0;
		if (s1 > s2) {
			tmp = s1;
			s1 = s2;
			s2 = tmp;
		}
		Integer suivantSuite1 = new Integer(s1), suivantSuite2 = new Integer(s2);

		for (; suite1.retainAll(suite2) && suivantSuite1 <= LIMIT && suivantSuite2 <= LIMIT;) {
			suivantSuite1 = calculSuite(suivantSuite1);
			suivantSuite2 = calculSuite(suivantSuite2);
			suite1.add(suivantSuite1);
			suite2.add(suivantSuite2);
		}

		for (Integer elt : suite1) {
			return elt.longValue();
		}

		return -1;
	}

	private static Integer calculSuite(Integer suivantSuite) {
		String text = suivantSuite.toString();
		int somme = 0;
		for (int index = 0; index < text.length(); index++) {
			char aChar = text.charAt(index);
			int digit = Character.getNumericValue(aChar);
			somme += digit;
		}
		return suivantSuite + somme;
	}

	public static boolean intersection(Set<Integer> suite1, Set<Integer> suite2) {
		return suite1.retainAll(suite2);
	}

}
