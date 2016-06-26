package example.hello;

/**
 * Created by fcnc465 on 25-06-2016.
 */
public class QuickSort {

    public int Swap(int x, int y){
        return x;
    }

    public int Partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = low - 1;                                // Index of smaller element
        for (int j=low; j <= high-1; j++){
            if (arr[j] <= pivot){                       // If current element is smaller than or equal to PIVOT
                i++;
                arr[j] = Swap(arr[i], arr[i] = arr[j]);                   // SWAP values
            }
        }
        arr[high] = Swap(arr[i+1], arr[i+1] = arr[high]);
        return i+1;
    }

    public void Sort(int arr[], int low, int high){
        if (low < high){
            int pi = Partition(arr, low, high);
            Sort(arr, low, pi-1);
            Sort(arr, pi+1, high);
        }
    }
}
