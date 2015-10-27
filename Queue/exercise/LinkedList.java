package exercise;

public class LinkedList {
	private Node front, rear;
	private int size;
	public LinkedList() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return front==rear;
	}
	public int getsize(){
		return size;
	}
	public void insert(int data){
		Node ptr = new Node(data,null);
		if (rear==null){
			front = ptr;
			rear = ptr;
		}
		else{
			rear.setnext(ptr);
			rear = rear.getnext();
		}
		size++;
	}
	public int remove(){
		if(isEmpty()){
			System.out.println("Empty Queue");
			return 0;
		}
		Node ptr = front;
		front = ptr.getnext();
		if(front==null)
			rear =null;
		size--;
		return ptr.getinfo();
	}
	public int peek(){
		if(isEmpty()){
			System.out.println("Empty Queue");
			return 0;
		}
		return front.getinfo();
	}
	public void display(){
		System.out.println("\nQueue : ");
		if (size==0){
			System.out.println("Empty\n");
			return;
		}
		Node ptr = front;
		while(ptr!=rear.getnext()){
			System.out.print(ptr.getinfo()+"--");
			ptr = ptr.getnext();
		}
		System.out.print("!");
	}
}
