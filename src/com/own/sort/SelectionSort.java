package com.own.sort;

public class SelectionSort {
    
    void sort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1; j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
    
    void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    
    public static void main(String args[]) {
      SelectionSort st = new SelectionSort();
      int arr[] = {65,25,12,22,11};
      st.sort(arr);
      System.out.println("Sorted Array: ");
      st.printArray(arr);
    }
}

// Time Complexity O(n2) as there are two nested loops.
// https://www.geeksforgeeks.org/wp-content/uploads/Selection-sort-flowchart.jpg


// arr[] = 64 25 12 22 11

// Find the minimum element in arr[0...4]
// and place it at beginning
// 11 25 12 22 64

// Find the minimum element in arr[1...4]
// and place it at beginning of arr[1...4]
// 11 12 25 22 64

// Find the minimum element in arr[2...4]
// and place it at beginning of arr[2...4]
// 11 12 22 25 64

// Find the minimum element in arr[3...4]
// and place it at beginning of arr[3...4]
// 11 12 22 25 64 