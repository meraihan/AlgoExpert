package com.own.sort;

public class HeapSort {
    
    public void sort(int arr[]){
        int n = arr.length;
        for(int i=n/2-1; i>=0; i--){
            heapify(arr, n, i);
        }
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr, i, 0);
        }
    }
    
    void heapify(int arr[], int n, int loopValue){
          int largest = loopValue;
          int left = 2 * loopValue + 1;
          int right = 2 * loopValue + 2;
          
          if(right<n && arr[right]>arr[largest]){
              largest = right;
          }
          if(largest != loopValue){
              int swap = arr[loopValue];
              arr[loopValue] = arr[largest];
              arr[largest] = swap;
              
              heapify(arr, n, largest);
          }
      }
      
      static void printArray(int arr[]){
          int n = arr.length;
          for(int i=0;i<n;i++){
              System.out.print(arr[i]+ " ");
          }
          System.out.println();
      }
    
    public static void main(String args[]) {
        int arr[] = {12,11,13,5,6,7};
        int n = arr.length;
        HeapSort hp = new HeapSort();
        hp.sort(arr);
        
        System.out.println("Sorted Array: ");
        printArray(arr);
    }
}