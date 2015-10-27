package exercise;

public class LinkedListQueue {

	public void queueimplementation(){
		LinkedList queue = new LinkedList();
		queue.display();
		queue.insert(1);
		queue.insert(2);
		queue.insert(3);
		queue.insert(4);
		queue.insert(5);
		queue.insert(6);
		System.out.println("Size: "+queue.getsize());
		queue.display();
		System.out.println("\nPeek: "+queue.peek());
		System.out.println("Removed: "+queue.remove());
		queue.display();
	}
	public static void main(String[] args) {
		
		LinkedListQueue queue = new LinkedListQueue();
		queue.queueimplementation();
		
	}

}
