// Program to print palindromic strings
import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		//write your code here
		for(int i=0;i<str.length();i++)
		{
		    for(int j=i+1;j<=str.length();j++)
		    {
		        String ss=str.substring(i,j);
		        if(checkpali(ss)==true)
		        {
		            System.out.println(ss);
		        }
		    }
		}
		
		
	}
	
	public static boolean checkpali(String ss)
	{
	    int i=0,j=ss.length()-1;
	    
	    while(i<=j)
	    {
	        if(ss.charAt(i)==ss.charAt(j))
	        {
	       
	        i++;
	        j--;
	        }
	        
	        else
	        {
	            return false;
	        }
	        
	        
	        
	    }
	    
	    return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}