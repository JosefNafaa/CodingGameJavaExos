package nodeExam;

class Node {

	// keep these fields
	Node left, right;
	int value;

	public Node() {

	}

	public Node(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	public Node find(int v) {
	    Node current = this;
	  
	    while (current != null && current.value != v) {
	        current = v < current.value ? current.left : current.right;
	    }
	    return current;
	}
	
}