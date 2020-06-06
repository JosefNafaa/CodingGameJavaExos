package sandPile;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	public static Integer[][] sandpile(Integer[][] pile, int n) {
		int size = pile[0].length;
		int middle = middleIndex(size);
		for (int i = 0; i < n; i++) {
			if (pile[middle][middle] != 4)
				pile[middle][middle] += 1;
			else {
				pile[middle][middle] = 0;
				addOne(middle, middle, pile, size);

				while (is_Four_Present(pile)) {
					remove_four(pile, size);

				}
			}
		}
		while (is_Four_Present(pile)) {
			remove_four(pile, size);

		}
		return pile;
	}

	/**
	 * 
	 * @param pile
	 * @param size
	 * @return pile without four in grid
	 */
	public static Integer[][] remove_four(Integer[][] pile, int size) {
		for (int k = 0; k < size; k++) {

			for (int l = 0; l < size; l++) {
				if (pile[k][l] == 4) {
					pile[k][l] = 0;
					addOne(k, l, pile, size);
				}
			}
		}

		return pile;
	}

	/**
	 * check if 4 is present in the grid
	 * 
	 * @param pile
	 * @return boolean
	 */
	public static boolean is_Four_Present(Integer[][] pile) {

		ArrayList<Integer> list = new ArrayList<>();
		for (Integer[] array : pile) {
			list.addAll(Arrays.asList(array));
		}

		return list.contains(4);

	}

	/**
	 * 
	 * @param i
	 * @param j
	 * @param pile
	 * @return pile with value +1 to neighbors
	 */
	public static Integer[][] addOne(int i, int j, Integer[][] pile, int size) {
		if (i - 1 >= 0) {
			pile[i - 1][j] += 1;
		}
		if (j - 1 >= 0) {
			pile[i][j - 1] += 1;
		}
		if (i + 1 < size) {
			pile[i + 1][j] += 1;
		}
		if (j + 1 < size) {
			pile[i][j + 1] += 1;
		}
		return pile;
	}

	/**
	 * 
	 * @param taille
	 * @return the index of the middle in the grid
	 */
	public static int middleIndex(int taille) {
		return (taille - 1) / 2;
	}

	public static void main(String[] args) {

		Integer[][] pile = new Integer[][] { { 0, 1, 0 }, { 0, 2, 3 }, { 1, 0, 1 } };

		System.out.println("before");
		System.out.print(pile[0][0]);
		System.out.print(pile[0][1]);
		System.out.println(pile[0][2]);
		System.out.print(pile[1][0]);
		System.out.print(pile[1][1]);
		System.out.println(pile[1][2]);
		System.out.print(pile[2][0]);
		System.out.print(pile[2][1]);
		System.out.println(pile[2][2]);

		sandpile(pile, 2);
		System.out.println("after");
		System.out.print(pile[0][0]);
		System.out.print(pile[0][1]);
		System.out.println(pile[0][2]);
		System.out.print(pile[1][0]);
		System.out.print(pile[1][1]);
		System.out.println(pile[1][2]);
		System.out.print(pile[2][0]);
		System.out.print(pile[2][1]);
		System.out.print(pile[2][2]);
	}
}
