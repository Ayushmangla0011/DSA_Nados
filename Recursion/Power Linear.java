import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn= new Scanner(System.in);
        int x=scn.nextInt();
        int n=scn.nextInt();
        int xn=power(x,n);
        System.out.println(xn);
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int xpn1=power(x,n-1);
        int xpn = xpn1*x;
        
        return xpn;
    }

}