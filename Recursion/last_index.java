import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        arr[i]=sc.nextInt();
        int x=sc.nextInt();

        int ans=lastIndex(arr,0,x);
        System.out.println(ans);
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx==arr.length-1)
        return -1;
       
       int lindex=lastIndex(arr,idx+1,x);
       if(lindex==-1)
       {
           if(arr[idx]==x)
           
            return idx;
            
            else
            return lindex;
           
           
       }    
           
           
     
       else
       return lindex;
       
       
        
        
    }

}