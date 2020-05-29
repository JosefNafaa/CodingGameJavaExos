package sum.range;

public class Solution {
	
/**
 * 
 * @param array
 * @param n1
 * @param n2
 * @return la somme des elements du tableau entre les indices n1 et n2 
 * on suppose ici que n1<= n2 et n2< array.length
 */
	public static int calc(int[] array , int n1 , int n2) {
		int somme=0; 
		if(n1==n2) 
			return array[n1];
		else {
			for(int i=n1;i<=n2;i++) {
				somme+=array[i];
			}
		return somme;
		}
	}
	public static void main(String[] args) {
		int tableauEntier[] = {0,1,2,3,4,5,6,7,8,9};
		
		System.out.println(calc(tableauEntier,0,9));

	}

}
