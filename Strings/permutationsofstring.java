import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		// write your code here
		
		
		int l=str.length();
		int fact=factorial(l);
		
		
		for(int i=0;i<fact;i++)
		{
		    StringBuilder s=new StringBuilder(str);
		    int temp=i;
		    int j=l;
		    while(j>0)
		    {
		        
		        int rem=temp%j;
		        
		        
		        System.out.print(s.charAt(rem));
		        s.deleteCharAt(rem);
		        temp=temp/j;
		        j--;
		        
		        
		    }
		    System.out.println();
		}
		
	}
	
	
	public static int factorial(int l)
	{
	    int fact=1;
	    int i=2;
	    while(i<=l)
	    {
	        fact=fact*i;
	        i++;
	    }
	    
	    return fact;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}