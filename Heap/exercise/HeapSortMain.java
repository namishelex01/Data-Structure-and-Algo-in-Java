package exercise;

public class HeapSortMain {
	
		public void implement(){
			HeapSort heap = new HeapSort(9);			
			heap.insert(45);
			heap.insert(27);
			heap.insert(85);
			heap.insert(25);
			heap.insert(65);
			heap.insert(78);
			heap.insert(41);
			heap.insert(01);
			heap.insert(89);
			heap.insert(4);
			heap.printHeap();
			heap.deleteMin();
			heap.printHeap();
			heap.delete(2);
			heap.printHeap();
			heap.delete(2);
			heap.printHeap();
			heap.makeEmpty();
			heap.printHeap();
			
		}

	public static void main(String[] args) {
		
		HeapSortMain heaps = new HeapSortMain();		
		heaps.implement();		
	}

}
