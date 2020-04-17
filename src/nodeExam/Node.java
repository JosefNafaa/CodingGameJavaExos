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

	public Node find (int v){
	    
	    Node n = new Node();
	    if(v == this.value) {return this;}
	    
	    if (v < this.value && this.left != null) {
	        if(n.value == v) return n;
	        n =  this.left.find(v);
	    }
	    
	    if (v > this.value && this.right != null) {
	        if(n.value == v) return n;
	        n = this.right.find(v);
	        
	    }
	    
	    return n;
	    
	}
	
}