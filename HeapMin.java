package Leetcode;

public class HeapMin {
    public static void main(String[] args) {

    }
    void heapify(int[] arr, int i,int n){
        int left=2*i+1;
        int right=2*i+2;
        int largest=i;
        if(left<n && arr[left]>arr[largest])
        {
            largest=left;
        }
        if(right<n && arr[right]>arr[largest])
        {
            largest=right;
        }
        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,largest,n);
        }
    }

}
