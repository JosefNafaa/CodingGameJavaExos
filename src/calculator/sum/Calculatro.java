package calculator.sum;

import java.math.*;

class Calculator {

    /**
     * Sums an array of​​​​​​‌​​​‌‌‌​‌​​​​‌​‌​​​‌‌​​‌​ numbers.
     *
     * @return the exact sum of the given numbers
     */
	static String sum(String... numbers) {
		BigDecimal  total = new BigDecimal(0);

		for (String number : numbers) {
			BigDecimal  parserValue =new BigDecimal(number);
			total =total.add(new BigDecimal(number));
		}

		return String.valueOf(total);
	}
	
}