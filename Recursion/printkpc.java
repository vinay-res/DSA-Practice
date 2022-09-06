import java.io.*;
import java.util.*;

public class Main {
    static String alpha[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {

        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printKPC(str,"");

    }

    public static void printKPC(String str, String asf) {

        if(str.length()==0)
        {
            System.out.println(asf);
            return ;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);
        String store=alpha[ch-'0'];

        for(int i=0;i<store.length();i++)
        {
            char ch1=store.charAt(i);
            printKPC(ros,asf+ch1);
        }

        
    }

}
