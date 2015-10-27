package exercise;

public class LinkedListStack {
	
	public void functionalStack(){
		LinkedList stack = new LinkedList();
		stack.display();
		stack.peek();
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.peek();
		stack.display();
		System.out.println("Size : "+stack.getsize());
		System.out.println("Pop Out : "+stack.pop());
		stack.display();
	}

	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack();
		stack.functionalStack();
	}

}
