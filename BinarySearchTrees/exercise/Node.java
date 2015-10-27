package exercise;

public class Node {
	
	private Node left, right;
	private int data;
	
	Node(int n){
		left = null;
		right = null;
		data = n;
	}
	
	public void setLeft(Node link){
		left = link;
	}
	public void setRight(Node link){
		right = link;
	}
	public Node getLeft(){
		return left;
	}
	public Node getRight(){
		return right;
	}
	public void setData(int n){
		data = n;
	}
	public int getData(){
		return data;
	}
}
