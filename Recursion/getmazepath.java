import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        
        int dr=sc.nextInt();
        int dc=sc.nextInt();

        ArrayList<String> ans=getMazePaths(1,1,dr,dc);
        System.out.println(ans);

    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {


         if(sr==dr && sc==dc)
         {
             ArrayList<String> bres=new ArrayList<>();
             bres.add("");
             return bres;
         }

        ArrayList<String> vpath=new ArrayList<>();
        ArrayList<String> hpath=new ArrayList<>();
        
        if(sr<dr)
        {
           vpath= getMazePaths(sr + 1,sc,dr,dc);

        }

        if(sc<dc)
        {
           hpath= getMazePaths(sr,sc + 1,dr,dc);

        }
        ArrayList<String> paths=new ArrayList<>();
        for(String val:hpath )
        {
            paths.add("h" +  val);
        }



        for(String val:vpath )
        {
            paths.add("v" + val);
        }
         

        return paths;
    }

}
