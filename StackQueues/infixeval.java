import java.io.*;
import java.util.*;

public class Main{

    public static int precedence(char optor)
    {
        if(optor=='+' || optor=='-')
        {
            return 1;
        }
        else
        {
            return 2;
        }
        
    }
     public static int operation(char optor,int val1,int val2)
    {
        if(optor=='+')
        {
            return val1+val2;

        }
        else if(optor=='-')
        {
            return val1-val2; 
        }
        else if(optor=='*')
        {
            return val1*val2;

        }
        else
        return val1/val2;    
        
    }
  

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String exp = br.readLine();


    Stack<Integer> operands=new Stack<>();
    Stack<Character> operators=new Stack<>();
    
    for(int i=0;i<exp.length();i++)
    {
       char ch=exp.charAt(i);
       if(ch=='(') 
       {
           operators.push(ch);

       } 
       else if(Character.isDigit(ch))
       {
           operands.push(ch-'0'); //convert to int and then push
       }
       else if(ch==')')
       {
           while(operators.peek()!='(')
           {
               char optor=operators.pop();
               int val2=operands.pop();
               int val1=operands.pop();

               int val=operation(optor,val1,val2);
               operands.push(val);
           }

           operators.pop();

       }
       else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
       {
           while(operators.size()>0 && operators.peek()!='(' && precedence(ch) <=precedence(operators.peek()))
           {
               char optor=operators.pop();
               int val2=operands.pop();
               int val1=operands.pop();

               int val=operation(optor,val1,val2);
               operands.push(val);
           }

           operators.push(ch);

       }



    }

    while(operators.size()!=0)
           {
               char optor=operators.pop();
               int val2=operands.pop();
               int val1=operands.pop();

               int val=operation(optor,val1,val2);
               operands.push(val);
           }

           System.out.println(operands.peek());





    

    // code
 }
}
