package closedToZero;

import java.util.Arrays;

public class ArrayClosestElementToZero {

	
	public static void main(String[] args) {
		
		int[] tableau = {8,2,-2,-15};
		int[] tableau2 = {0,2,3,15};
		int[] tableau3 = {-5,-8,3,15};
		int[] tableau4 = {-5,-8,-12,-15};
		
		System.out.println("closest element to zero from tablea 1 :"+ closestToZero(tableau));
		System.out.println("closest element to zero from tablea 2 :"+ closestToZero(tableau2));
		System.out.println("closest element to zero from tablea 3 :"+ closestToZero(tableau3));
		System.out.println("closest element to zero from tablea 4 :"+ closestToZero(tableau4));
	}
	
	private static int closestToZero(int[] arrayOfInts) {
		
		if(arrayOfInts.length>0) {
			// sort of the arrayOfInts
			Arrays.sort(arrayOfInts);
			
			int indexOfNegativeValues = -1;

			for (int i=0; i<arrayOfInts.length; i++) {
				if(arrayOfInts[i] == 0 ) {
					return 0;
				}else if(arrayOfInts[i]<0) {
					indexOfNegativeValues = i;
				}
			}
			if(indexOfNegativeValues == -1) {
				return arrayOfInts[0];
			}else {
				if( indexOfNegativeValues < arrayOfInts.length-1 ) {
					if(Math.abs(arrayOfInts[indexOfNegativeValues]) - Math.abs(arrayOfInts[indexOfNegativeValues+1]) < 0) {
						return arrayOfInts[indexOfNegativeValues];
					}else {
						return arrayOfInts[indexOfNegativeValues+1];
					}
				}else {
					return arrayOfInts[indexOfNegativeValues];
				}
				
			}
		}
		return -1;
	}
}
