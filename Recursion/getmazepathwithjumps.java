import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        int dr=sc.nextInt();
        int dc=sc.nextInt();
        ArrayList<String> ans= getMazePaths(1,1,dr,dc);
        System.out.println(ans);



    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
          //Base Case
          if(sc==dc && sr==dr)
          {
              ArrayList<String> bres=new ArrayList<>();
              bres.add("");
              return bres;

          }


         
         ArrayList<String> paths=new ArrayList<>();

        //for horizontal moves
        for(int hms=1;hms<=dc-sc;hms++)
        {
            ArrayList<String> hpath=getMazePaths(sr,sc+hms,dr,dc);

            for(String hp:hpath)
            {
                paths.add("h" + hms + hp);

            }
        }

        //for vertical moves

        for(int vms=1;vms<=dr-sr;vms++)
        {
            ArrayList<String> vpath=getMazePaths(sr+vms,sc,dr,dc);

            for(String vp:vpath)
            {
                paths.add("v" + vms + vp);

            }
        }

        for (int dms = 1; dms <= dr - sr && dms <= dc - sc; dms++)
        {
            ArrayList<String> dpath=getMazePaths(sr+dms,sc+dms,dr,dc);

            for(String dp:dpath)
            {
                paths.add("d" + dms + dp);

            }
        }





        return paths;
    }

}
