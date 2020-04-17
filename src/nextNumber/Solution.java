package nextNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public static int next(int n) {
		if (n < 10)
			return n + 1;
		else {
			int res = n;
			
			while (res < Math.pow(2, 31) && ! diff(digits(res), digits(n))) {
				res++;
			}
			if (res > Math.pow(2, 31))
				return -1;
			else
				return res;
		}

	}

	public static void main(String[] args) {
      System.out.println(next(654321));
	}

	public static List<Integer> digitsNumber(int n) {
		List<Integer> digits = new ArrayList<>();
		int res = n % 10;
		digits.add(res);
		n = n / 10;
		while (n >= 10) {
			res = n % 10;
			digits.add(res);
			n = n / 10;

		}
		digits.add(n);
		return digits;
	}

	public static Set<Integer> digits(int n) {
		Set<Integer> digits = new HashSet<Integer>();
		int res = n % 10;
		digits.add(res);
		n = n / 10;
		while (n >= 10) {
			res = n % 10;
			digits.add(res);
			n = n / 10;

		}
		digits.add(n);
		return digits;
	}

	public static boolean diff(Set<Integer> set1, Set<Integer> set2) {

		if (set1 == null || set2 == null) {
			return false;
		}

		for(Integer elt:set2) {
			
		   if(set1.contains(elt))
			  return false;
		}
		
		
		return true;

	}
}
