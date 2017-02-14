package LernPaket.BinarySearchTree;

public class BinarySearchTreeAusDemKopfVersuch3<Key extends Comparable<Key>,Value> {

	private Node root;	
	private class Node{
		private Node left,right;
		private int count;
		private Key key;
		private Value value;	
		public Node(Key key, Value value, int count){
			this.value = value;
			this.key = key;
			this.count = count;
		}
	}

	//wichtig ist der einzelne returnerei
	//wichtig auch noch, das er den linken size returned
	public int rank(Node root,Key key){
		 if(root == null) return 0;
		int cmp = key.compareTo(root.key);
		 if(cmp<0) 
			 return rank(root.left,key);
		 else if(cmp>0) 
			 return 1+size(root.left) +rank(root.right,key);
	
		 else return size(root.left);
		 
	}
	//GRÖßte SCHWIERIGKEIT
	//Node x abspeichern
	public Key floor(Key key){
		Node x = floor(root,key);
		if(x == null) return null;
		else return x.key;
	}
	//GRÖßTE SCHWIERIGKEIT!
	//spezieller fall fürs rechte teilhäflte
	public Node floor(Node root, Key key){
	if(root == null) 
		return null;
	int cmp = key.compareTo(root.key);
	if(cmp == 0)
		return root;
	else if(cmp<0) 
		return floor(root.left,key);
	
	Node t = floor(root.right,key);
	if(t == null) 
		return root;
	else return t;
	
	}
	public void delete(Key key){
		root = delete(root,key);
	}
	// hat eine while schleife, geht
		public Value get(Key key){
			while(root != null){
				int cmp = key.compareTo(root.key);
				if(cmp<0) root = root.left;
				else if(cmp>0) root = root.right;
				else return root.value;
			}
			return root.value;
		}
	//es geht.. könnte besser sein!
	public Node delete(Node root, Key key){
		if(root == null) return null;
		int cmp = key.compareTo(root.key);
		if(cmp<0) delete(root.left,key);
		else if(cmp>0) delete(root.right,key);
		else if(cmp == 0){
			Node t = root;
			root = searchMinNode(t.right);
			root.right = deleteMin(t.right);
			root.left = t.left;
		}
		root.count = 1+size(root.left) +size(root.right);
		return root;
	}
	public void deleteMin(){
		root = deleteMin(root);
	}
	// eine große schwierigkeit!
	public Node deleteMin(Node root){
		if(root.left == null) return root.right;
		root.left = deleteMin(root.left);
		root.count = 1+size(root.left) + size(root.right);
		return root;
		
	}
	//SCHWIERIGKEIT
	public int size(){
		return size(root);
	}
	//SCHWIERIGKEIT
	public int size(Node root){
		if(root == null) return 0;
		else return root.count;
	}
	
	
	
	//sachen die ich irgendwie aus meinem kopf implementieren konnte:
	public Node searchMinNode(Node root){
		if(root.left == null) return root;
		else return searchMinNode(root.left);
		
	}
	public void put(Key key, Value value){
		root = put(root,key,value);
	}
	public Node put(Node root, Key key, Value value){
		if(root == null) 
			root = new Node(key,value,1);
		
		int cmp = key.compareTo(root.key);
		if(cmp<0) 
			root.left = put(root.left,key,value);
		else if(cmp>0) 
			root.right = put(root.right,key,value);
		else if( cmp == 0)
			root.value = value;
		
		root.count = 1+ size(root.left) + size(root.right);
			return root;
		
	}
	








}
