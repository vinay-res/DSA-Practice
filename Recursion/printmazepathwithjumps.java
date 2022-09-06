import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int dr=sc.nextInt();
        int dc=sc.nextInt();
        printMazePaths(1,1,dr,dc,"");




    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {
     
     if(sr==dr && sc==dc)
     {
         System.out.println(ans);
         return ;
     }

     if(sr>dr || sc>dc)
     {
         return ;
     }
     //for horizontal moves
      for(int hms=1;hms<=dc-sc;hms++)
     {
         printMazePaths(sr,sc+hms,dr,dc,ans+'h'+hms);
     }
     //for vertical moves
     for(int vms=1;vms<=dr-sr;vms++)
     {
         printMazePaths(sr+vms,sc,dr,dc,ans+'v'+vms);
     }
     
    
     //for diagonal moves
     for(int dms=1;dms<=dr-sr && dms<=dc-sc ;dms++)
     {
         printMazePaths(sr+dms,sc+dms,dr,dc,ans+'d'+dms);
     }



    }

}
