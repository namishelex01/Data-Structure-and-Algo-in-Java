public class MergeSort {

    public void MS(int arr[], int l, int r){
        if (l<r){
            int m = (l+r)/2;    # middle term of the array

            MS(arr, l, m);      # 1st part of the array
            MS(arr, m+1, r);    # 2nd part of the array
            merge(arr, l, m, r);# Merge all the parts into one
        }
    }

    public void merge(int arr[],int l ,int m, int r){
        int n1 = m + 1 - l;
        int n2 = r - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0; i < n1; i++){
            L[i] = arr[l + i];
        }

        for(int j=0; j < n2; j++){
            R[j] = arr[m + j + 1];
        }

        int i=0, j=0, k=l;

        while ( i<n1 && j<n2 ){
            if (L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while ( i < n1 ){
            arr[k] = L[i];
            i++; k++;
        }

        while ( j < n2 ){
            arr[k] = R[j];
            j++; k++;
        }

    }

}
