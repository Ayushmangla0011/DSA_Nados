import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn=new Scanner(System.in);
    int n1=scn.nextInt();
    int[] arr1=new int[n1];

    for(int i=0;i<n1;i++){
        arr1[i]=scn.nextInt();
    }

    int n2=scn.nextInt();
    int[] arr2=new int[n2];

    for(int i=0;i<n2;i++){
        arr2[i]=scn.nextInt();
    }

    HashMap<Integer,Integer> fmap=new HashMap<>();
    for(int val:arr1){
        if(fmap.containsKey(val)==true){
            int of=fmap.get(val);
            int nf=of+1;
            fmap.put(val,nf);
        }else{
            fmap.put(val,1);
        }
    }

    for(int val:arr2){
        if(fmap.containsKey(val)==true){
            System.out.println(val);
            fmap.remove(val);
        }
    }
 }

}