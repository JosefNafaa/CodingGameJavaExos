package exo.find.endpoint;

public class Endpoint {

	public static void main(String[] args) {
		int[] fromIds= {1,7,3,2,4,6,9};
		int[] toIds= {3,3,4,6,6,9,5};
		System.out.println("result is: "+ findNetworkEndPoint(3, fromIds, toIds));
	}
	
	public static int findNetworkEndPoint(int startNodeId, int[] fromIds, int[] toIds) {
		
		int index = getIndex(startNodeId, fromIds);
		int suivant = 0;
		
		while(index != -1) {
			suivant = toIds[index];
			index = getIndex(suivant, fromIds);
			if(index == -1) {
				return suivant;
			}
		}
		return -1;
	}

	public static int getIndex(int node, int[] array) {
		for (int i=0;  i<array.length; i++) {
			if(node == array[i]) return i;
		}
		return -1;
	}

}
