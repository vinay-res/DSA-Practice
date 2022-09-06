import java.io.*;
import java.util.*;

public class Main {
    static String alpha[]={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> ans=getKPC(str);
        System.out.println(ans);


    }

    public static ArrayList<String> getKPC(String str) {

        //BASE CASE
        if(str.length()==0)
        {
            ArrayList<String> r=new ArrayList<>();
            r.add("");
            return r;
        }



        char ch=str.charAt(0);
        String ros=str.substring(1);

        ArrayList<String> ires=getKPC(ros);

        ArrayList<String> res=new ArrayList<>();

        String s=alpha[ch-'0'];

        for(int i=0;i<s.length();i++)
        {
            char ch1=s.charAt(i);
            for(String val:ires)
            {
                res.add(ch1+val);
            }

        }





        return res;
    }

}
