import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.next();
        ArrayList<String> ans = getKPC(str);
        System.out.println(ans);
    }

    public static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static ArrayList<String> getKPC(String str) {
        
        if(str.length()==0){
            ArrayList<String> bres = new ArrayList<String>();
            bres.add("");
            return bres;
        }

        char ch=str.charAt(0);
        String ros=str.substring(1);
        ArrayList<String> rres = getKPC(ros);
        
        ArrayList<String> myres = new ArrayList<String>();
        
        int li=ch-48;
        String chforcode=codes[li];

        for(int i=0;i<chforcode.length();i++){

            char chcode=chforcode.charAt(i);
            for(String rstr: rres){
                myres.add(chcode+rstr);
            }
        }
        return myres;
        

    }

}