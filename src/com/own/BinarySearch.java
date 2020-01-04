import java.util.*;
public class BinarySearch { 
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int counter, num, item, array[], first, last, middle;
      System.out.println("Enter the number of elements: ");
      num = in.nextInt();
      
      array = new int[num];
      
      for(counter=0;counter<num;counter++){
          array[counter] = in.nextInt();
      }
      
      System.out.println("Enter the search value: ");
      item = in.nextInt();
      
      first = 0;
      last = num-1;
      middle = (first+last)/2;
      
      while(first<=last){
          if(array[middle]<item){
              first = middle+1;
          } else if(array[middle] == item){
              System.out.println("We found the item at location : "+ (middle+1));
              break;
          } else{
              last = middle-1;
          }
          
          middle = (first+last)/2;
      }
      if(first>last){
          System.out.println("Item not found!");
      }
   }
   
} 
 