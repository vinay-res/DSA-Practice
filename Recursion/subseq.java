import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        ArrayList<String> fres=gss(str);
        System.out.println(fres);

    }

    public static ArrayList<String> gss(String str) {

        if(str.length()==0)
        {
            ArrayList<String> r=new ArrayList<>();
            r.add("");
            return r;
        }

     
     char ch=str.charAt(0);
     String ros=str.substring(1);

     ArrayList<String> ires=gss(ros);

     ArrayList<String> res=new ArrayList<>();

     for(String r:ires)
     {
        res.add("" + r);
     }
     for(String r:ires)
     {
        res.add(ch + r);
     }


      return res;
    }

}
