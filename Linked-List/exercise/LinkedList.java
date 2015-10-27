package linkedList;

public class Llist {
	
	private Node head;
	private int count;
	
	public Llist(){									// Constructor to put values to NULL
		head = null;
		count = 0;
	}
	
	public boolean isEmpty(){						// Check for Empty List
		if (head == null){
			System.out.println("It is Empty!!\n");
			return true;
		}else{
			System.out.println("Not Empty!!\n");		
			return false;
		}
	}
	
	public int getSize(){							// Return the size of List
		return count;
	}
	
	public void addStart(int n){					// Add the data at the starting of the Linked List
		Node ptr = new Node(n,null);
		count++;
		if (head==null){
			head = ptr;
		}
		else{
			ptr.setNext(head);
			head = ptr;		
		}
	}
	
	public Node returnHead(){						// Return the head of the list
		return head;
	}
													// Append the result to current list's head
	public void append(Node result){
		head = result;
	}
													// Return the Node of current index
	public Node getNode(int i){
		if (i>=count)	{
			System.out.println("Error");
			return null;
			}
		Node ptr = head;
		for (int k=0;k<i;k++)	{	ptr = ptr.getNext();	}
		return ptr;
	}
													//Print the Linked List
	public void printList(){
		System.out.println("\nLinked List - \n");
		if (head==null){
			System.out.println("Empty");
			return;
		}
		Node ptr;
		ptr = head;
		while(ptr!=null){
			System.out.print(ptr.info);
			System.out.print(" -> ");
			ptr = ptr.getNext();
		}
		System.out.println("-!");
	}
	////////////////////////////////////////------------MERGE SORT--------------////////////////////////////////////////////
	public Node mergeSortList(Node head) {
		 
		if (head == null || head.next == null)			// Check if list is empty or having only one element
			return head;
 														// Count total number of elements
														int count = 0;
														Node p = head;
														while (p != null) {
															count++;
															p = p.next;
														}
 							// Break up to two list
							int middle = count / 2;
					 
							Node l = head, r = null;
							Node p2 = head;
							int countHalf = 0;
								while (p2 != null) {
									countHalf++;
									Node next = p2.next;
						 
									if (countHalf == middle) {
										p2.next = null;
										r = next;
									}
									p2 = next;
								}
 
														// Now we have two parts l and r, recursively sort them
														Node h1 = mergeSortList(l);
														Node h2 = mergeSortList(r);
 
							// merge together
							Node merged = merge(h1, h2);
 
		return merged;
	}
	////////////////////////////////////////------------MERGING THE SORTED LISTS--------------////////////////////////////////////////////

	public Node merge(Node l, Node r) {
		Node p1 = l;
		Node p2 = r;
 
		Node fakeHead = new Node(100,null);
		Node pNew = fakeHead;				// FakeHead is a fake List used to add the newly Sorted List
											// At the end we are returning the list except this fake value i.e. by returning "fakeHead.next"
 
		while (p1 != null || p2 != null) {
 
										if (p1 == null) {						// if P1 becomes NULL
											pNew.next = new Node(p2.getinfo());	// Insert P2 in P-NEW
											p2 = p2.next;
											pNew = pNew.next;
											
			} else if (p2 == null) {				// if P2 becomes NULL
				pNew.next = new Node(p1.getinfo());	// Insert P1 in P-NEW
				p1 = p1.next;
				pNew = pNew.next;
				
										} else {
											if (p1.getinfo() < p2.getinfo()) {	// Now if P1 < P2 i.e. P1 is Smaller
												// if(fakeHead)					// Then insert P1 to P-NEW
												pNew.next = new Node(p1.getinfo());
												p1 = p1.next;
												pNew = pNew.next;
					
				} else if (p1.getinfo() == p2.getinfo()) {	
					
					pNew.next = new Node(p1.getinfo());		 	// Now if both P1 and P2 are EQUAL
					pNew.next.next = new Node(p1.getinfo());	// Insert both Next to Each Other
					pNew = pNew.next.next;						// USE either P1 OR P2 as both are SAME
					p1 = p1.next;
					p2 = p2.next;
 
										} else {								// Now if P1 > P2 i.e. P2 is Smaller
											pNew.next = new Node(p2.getinfo());	// Then insert P2 to P-NEW	
											p2 = p2.next;
											pNew = pNew.next;
										}
			}
		} 
		// printList(fakeHead.next);
		return fakeHead.next;
	}
	////////////////////////////////////////------------REMOVE DUPLICATES FROM "SORTED" LIST--------------////////////////////////////////////////////
	public Node EraseDuplicates(Node head){
		if (head==null || head.getNext()==null)
			return head;
		Node prev = head;
		Node temp = head.getNext();
		while(temp != null){
			if (temp.getinfo() == prev.getinfo()){
				prev.next = temp.next;
				temp = temp.next;
			} else {
				prev = temp;
				temp = temp.next;
			}
		}
		return head;
	}
}
