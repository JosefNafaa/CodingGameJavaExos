/**
 * 
 */
package nombreDePaires;

/**
 * @author TALBI
 *
 */
public class NombrePaires {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final int base1 = 6, base2 = 30000;
		System.out.println("nombre de paires possibles pour N=" + base1 + " est: " + count(base1));
		System.out.println("nombre de paires possibles pour N=" + base2 + " est: " + count(base2));

	}

	public static long count(int base) {
		return base * (base - 1) / 2;
	}

}
