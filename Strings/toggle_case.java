import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String str){
		//write your code here
		StringBuilder s=new StringBuilder();
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    //for lowercase
		    if((int)(ch)>=97 && (int)(ch)<=122)
		    {
		        char ch1=(char)('A' + ch - 'a');
		        s.append(ch1);
		        
		    }
		    else
		    {
		    char ch2=(char)('a' - 'A' + ch);
		    s.append(ch2);
		    }
		    
		    
		}
		
		

		return s.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}

}