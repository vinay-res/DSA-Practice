import java.io.*;
import java.util.*;

public class Main {
    public static boolean charhandling(Stack<Character> st,char corrch)
    {
       if(st.size()==0)
       {
           return false;
        }

       else if(st.peek()!=corrch)
       {
           return false;

       }
       else
       {

       st.pop();
       return true;
       }
    }
    

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);

            }
            else if(ch==')')
            {
               boolean val=charhandling(st,'(');
               if(val==false)
               {
                   System.out.println("false");
                   return;
               }
            }
            else if(ch=='}')
            {
                boolean val=charhandling(st,'{');
               if(val==false)
               {
                   System.out.println("false");
                   return;
               }


            }
            else if(ch==']')
            {
                boolean val=charhandling(st,'[');
               if(val==false)
               {
                   System.out.println("false");
                   return;
               }

            }

        }

        if(st.size()==0)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }


    }

}
