package exercise;

import java.util.Arrays;

public class HeapSort {
	
	// The number of children each node will have
	private static final int childnode = 2;
	private int heapSize;
	private int[] heap;			// preferred for Java 
	
	public HeapSort(int capacity){
		heapSize = 0;
		heap = new int[capacity+1];
		Arrays.fill(heap, -1);
	}
	
	public boolean isEmpty(){
		return heapSize == 0;
	}
	
	public boolean isFull(){
		return heapSize == heap.length;
	}
	
	public void makeEmpty(){
		heapSize = 0;
	}
	
	private int parent(int index){
		return (index - 1) / childnode;
	}
	
	private int kthChild(int index, int kth){
		return childnode * index + kth;
	}
	
	public void insert(int x){
		if (isFull()){
			System.out.println("Overflow!!");
			return;
		} else {
			heap[heapSize++] = x;
			heapifyUP(heapSize - 1);
		}
	}
	
	public int findMin(){
		if (isEmpty()){
			System.out.println("Empty Heap!!");
			return 0;
		} else 
			return heap[0];
	}
	
	public int deleteMin(){
		int keyItem = heap[0];
		delete (0);
		return keyItem;
	}
	
	public int delete(int index){
		if (isEmpty()){
			System.out.println("Empty Heap!!");
			return 0;
		} else {
			int keyItem = heap[index];
			heap[index] = heap [heapSize-1];
			heapSize--;
			heapifyDOWN(index);
			return keyItem;
		}
	}
	
	private void heapifyUP(int childind){
		int temp = heap[childind];
		while (childind > 0 && temp < heap[parent(childind)]) {
			heap[childind] = heap[parent(childind)];
			childind = parent(childind);
		}
		heap[childind] = temp;
	}
	
	private void heapifyDOWN(int childind){
		int child;
		int temp = heap[ childind ];
		while (kthChild(childind, 1) < heapSize) {
			child = minChild(childind);
			if (heap[child] < temp)
				heap [childind] = heap[child];
			else
				break;
			childind = child;
		}
		heap [childind] = temp;
	}
	
	private int minChild(int index){
		int bestChild = kthChild(index,1);
		int k = 2;
		int pos = kthChild(index,k);
		
		while ( (k <= childnode) && (pos < heapSize)) {
			if (heap[pos] < heap[bestChild])
				bestChild = pos;
			pos = kthChild(index, k++);
		}
		return bestChild;
	}
	
	public void printHeap() {
		System.out.println("\nHeap : ");
		for(int i = 0; i < heapSize; i++)
			System.out.print(heap[i]+"  ");
		System.out.println();
	}
}
