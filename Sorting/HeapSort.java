public class HeapSort {

    public int Swap(int x, int y)  { return x;  }

    public void Sort(int arr[]){

        int length = arr.length;
        // Building Heap
        for (int i = (length/2)-1; i >= 0 ; i--){
            Heapify(arr, length, i);
        }
        // Extract all element one-by-one from the heap
        for (int i = length-1; i >= 0; i--){
            arr[0] = Swap(arr[i], arr[i] = arr[0]);

            Heapify(arr, i, 0);
        }
    }

    public void Heapify(int arr[], int length, int root){

        int largest = root;                                // Initialize largest as root
        int left = root*2+1;                               // Left Branch
        int right = root*2+2;                              // Right Branch

        // If left side is larger that the root
        if( left < length && arr[left] <= arr[largest]){
            largest = left;
        }
        // If right side is larger than the largest so far
        if( right < length && arr[right] <= arr[largest]){
            largest = right;
        }
        // If largest is not Root
        if(largest != root){
            arr[largest] = Swap(arr[root], arr[root] = arr[largest]);
            Heapify(arr, length, largest);
        }
    }
}
