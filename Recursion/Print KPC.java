import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        printKPC(str,"");
    }

    static String[] codes={".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void printKPC(String str, String asf) {
        
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        
        char ch = str.charAt(0);
        String ros = str.substring(1);

        String chforcodes=codes[ch-48];
        for(int i=0;i<chforcodes.length();i++){
            char cho=chforcodes.charAt(i);
            printKPC(ros,asf+cho);
        }
    }

}