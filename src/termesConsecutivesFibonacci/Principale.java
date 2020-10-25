package termesConsecutivesFibonacci;

public class Principale {

	public static void main(String[] args) {
		System.out.println("starting ...");
		int result = 0;
		int n = 21;
		int m = 34;
		int i = 0;
		int j = 0;
		if (!isFibonacci(n) || !isFibonacci(m))
			result = 0;

		else {
			while (fibOptimized(i) < n) {
				if (fibOptimized(i) != n) {
					i++;
				}
				if (fibOptimized(i) == n)
					break;
			}

			while (fibOptimized(j) < m) {
				{
					if (fibOptimized(j) != m)

						j++;
				}
				if (fibOptimized(j) == m)
					break;
			}

			if ((i + 1 == j || i == j) && i != 0)
				result = 1;
		}
		System.out.println("le resultat est :" + result);
	}

	public static int fibOptimized(int n) {
		if (n == 0)
			return 0;
         if(n==1)
        	 return 1;
		int prev = 0, res = 1, next;
		for (int i = 1; i < n; i++) {
			next = res + prev;
			prev = res;
			res = next;
		}
		return res;
	}

	
	
	/**
	 * 
	 * @param w
	 * @return boolean value : true if w is in fibonacci false if it's not
	 */
	static boolean isFibonacci(int w) {
		double X1 = 5 * Math.pow(w, 2) + 4;
		double X2 = 5 * Math.pow(w, 2) - 4;

		long X1_sqrt = (long) Math.sqrt(X1);
		long X2_sqrt = (long) Math.sqrt(X2);

		return (X1_sqrt * X1_sqrt == X1) || (X2_sqrt * X2_sqrt == X2);
	}

}
