package computeGameState;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Solution {

	public static void main(String[] args) {
		// génération d'un nombre >= 0 et < 5
		Random r = new Random();
		int n = r.nextInt(5);
		int m = r.nextInt(5);

		// int m = n;
		System.out.println("P1 " + n);
		System.out.println("P2 " + m);

		String resultat = "";
		if (n == m) {
			resultat = egalite(n, "P1", "P2");
		}

		resultat = res("P1", n, "P2", m);

		System.out.println(resultat);

	}

	public static String egalite(int n, String nameP1, String nameP2) {
		String resultat = "";
		switch (n) {
		case 0:
			resultat = nameP1 + " " + "0" + " - " + nameP2 + " " + "0";
		case 1:
			resultat = "15a";
			break;
		case 2:
			resultat = "30a";
			break;
		case 3:
			resultat = "DEUCE";
			break;
		default:
			resultat = "DEUCE";
			break;
		}
		return resultat;
	}

	public static String res(String nameP1, int n, String nameP2, int m) {
		Map<Integer, String> res = new HashMap<>();
		res.put(0, "0");
		res.put(1, "15");
		res.put(2, "30");
		res.put(3, "40");
		if (n <= 3 && m <= 3) {
			return nameP1 + " " + res.get(n) + " - " + nameP2 + " " + res.get(m);
		}
		if (n > m) {
			if (n - m == 1)
				return nameP1 + " ADVANTAGE";
			else
				return nameP1 + " WINS";
		} else {
			if (m - n == 1)
				return nameP2 + " ADVANTAGE";
			else
				return nameP2 + " WINS";
		}
	}

}
