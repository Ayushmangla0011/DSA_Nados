import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        ArrayList<String> gss = getStairPaths(n);
        System.out.println(gss);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        if(n==0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }else if(n<0){
            ArrayList<String> bres = new ArrayList<String>();
            return bres;
        }

        ArrayList<String> paths1 = getStairPaths(n-1);
        ArrayList<String> paths2 = getStairPaths(n-2);
        ArrayList<String> paths3 = getStairPaths(n-3);

        ArrayList<String> paths = new ArrayList<String>();   

        for(String path:paths1){
            paths.add("1"+path);
        }
        
        for(String path:paths2){
            paths.add("2"+path);
        }

        for(String path:paths3){
            paths.add("3"+path);
        }

        return paths;
    }

}