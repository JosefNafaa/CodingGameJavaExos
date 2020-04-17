package largestNumberArray;

import java.util.Arrays;

public class LargestArrayNumber {
	
	int tableauEntier[]= {1,5,5,39,9};
	static int findLargest(int[] numbers) {
		if(numbers.length==1)
			return numbers[0];
		else {
		Arrays.sort(numbers);
		return numbers[numbers.length-1];
 		
		}		
	}
	public static void main(String[] args) {

        int[] data = {2,3,-2,1,-1};
     //  add this
        System.out.println(LargestArrayNumber.findLargest(data));        

		
	}
}
