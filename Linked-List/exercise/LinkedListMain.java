package linkedList;

public class SingleLinkedList extends Llist {
		
		public void ListOperations(){
			Llist list = new Llist();
			System.out.println("Check for Empty!!");
			list.isEmpty();
			System.out.println("Print empty");
			list.printList();
			System.out.println("Add values");
			list.addStart(15);
			list.addStart(78);
			list.addStart(12);
			list.addStart(56);
			list.addStart(34);
			list.addStart(56);
			list.addStart(12);		
			System.out.println("Now Check for Empty!!");
			list.isEmpty();
			System.out.println("Print the list!!");
			list.printList();
			list.append(list.mergeSortList(list.returnHead()));
			list.printList();
			System.out.println();
			list.append(list.EraseDuplicates(list.returnHead()));
			list.printList();
			System.out.println();
		}
		
		public void ListAlgorithms(){
			
		}
	public static void main(String[] args) {
		SingleLinkedList Obj = new SingleLinkedList();
		Obj.ListOperations();
		
	}

}
