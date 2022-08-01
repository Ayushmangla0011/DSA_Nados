import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();

        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hm.containsKey(ch)){
                int of=hm.get(ch);
                int nf=of+1;
                hm.put(ch,nf);
            }else{
                hm.put(ch,1);
            }
        }

        char maxc=str.charAt(0);
        int maxf=hm.get(str.charAt(0));

        for(Character key:hm.keySet()){
            if(hm.get(key)>maxf){
                maxf=hm.get(key);
                maxc=key;
            }
        }

        System.out.println(maxc);

    }

}