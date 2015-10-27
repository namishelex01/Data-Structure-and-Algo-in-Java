package exercise;

public class LinkedList {
	private Node top;
	private int size;
	public LinkedList() {
		top = null;
		size = 0;
	}
	public boolean isEmpty(){
		return top == null;
	}
	public int getsize(){
		return size;
	}
	public void push(int n){
		Node ptr = new Node(n,null);
		if(top==null){
			top = ptr;
		} else {
			ptr.setnext(top);
			top = ptr;
		}
		size++;
	}
	public int pop(){
		if (isEmpty()){
			System.out.println("Empty Stack");
			return 0;}
		Node ptr;
		ptr = top;
		top = ptr.getnext();
		return ptr.getinfo();
	}
	public int peek(){
		if (isEmpty()){
			System.out.println("Empty Stack");
			return 0;}
		return top.getinfo();
	}
	public void display(){
		if (size==0){
			System.out.println("Stack Empty");
			return;}
		Node ptr = top;
		while (ptr!=null){
			System.out.println(" | "+ptr.getinfo()+" | ");
			ptr = ptr.getnext();
		}
	}
}
