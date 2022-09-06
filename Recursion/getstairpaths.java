import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    ArrayList<String> ans=getStairPaths(n);
    System.out.println(ans);

    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0)
        {
            ArrayList<String> bres=new ArrayList<>();
            bres.add("");
            return bres;
            
        }
        else if(n<0)
        {
            ArrayList<String> bres=new ArrayList<>();
            return bres;
        }


        ArrayList<String> path1=getStairPaths(n-1);
        ArrayList<String> path2=getStairPaths(n-2);
        ArrayList<String> path3=getStairPaths(n-3);

        ArrayList<String> paths=new ArrayList<>();

        for(String p1:path1)
        {
            paths.add("1" + p1);
        }

        for(String p2:path2)
        {
            paths.add("2" + p2);
        }

        for(String p3:path3)
        {
            paths.add(3 + p3);
        }

        



        return paths;
    }

}
