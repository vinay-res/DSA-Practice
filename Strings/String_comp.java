import java.io.*;
import java.util.*;

public class Main {
    
    
	public static String compression1(String str){
		// write your code here
		String ans=str.charAt(0) +  "";
		for(int i=1;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    if(ch!=str.charAt(i-1))
		    {
		        ans=ans+ch;
		    }
		    
		    
		    
		}

		return ans;
	}


	public static String compression2(String str){
		// write your code here
		String ans=str.charAt(0) +"";
		int count=1;
		for(int i=1;i<str.length();i++)
		{
		    char ch1=str.charAt(i);
		    
		    if(ch1==str.charAt(i-1))
		    {
		        count++;
		    }
		    else
		    {
		        if(count>1)
		        {
		           ans=ans + count; 
		           count=1;
		        }
		    
		    ans=ans+ch1;
		    }
		}
		
		if(count>1)
		{
		    ans=ans+count;
		    count=1;
		    
		}
		
		

		return ans;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}