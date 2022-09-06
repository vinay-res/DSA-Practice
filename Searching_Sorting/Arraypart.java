import java.io.*;
import java.util.*;

public class Main {

  public static void partition(int[] arr, int pivot){
    //write your code here
    int i=0;
    int j=0; //intially both will be pointing to zero
    
    while(i<arr.length)//traverse whole array
    {
        if(arr[i]>pivot)
        {
            i++; //this block will check if elemnt is greater than pivot
        }
        else
        {
            swap(arr,i,j); //if ith elemrnt is smaller than pivot it will be swapped with jth element of array,which is always greater than pivot
            i++;
            j++;
        }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping " + arr[i] + " and " + arr[j]);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = scn.nextInt();
    partition(arr,pivot);
    print(arr);
  }

}
