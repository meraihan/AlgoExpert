public class BubboleSort {
    
    void bubbleSort(int arr[]){
        int n = arr.length;
        for (int i=0;i<n-1;i++){
            for (int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    void printArray(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String args[]) {
      BubbleSort b = new BubbleSort();
      int arr[] = {5,6,1,2,7,3,4};
      b.bubbleSort(arr);
      System.out.println("Sorted Array: ");
      b.printArray(arr);
    }
}