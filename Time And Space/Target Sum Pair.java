import java.io.*;
import java.util.*;

public class Main {

  public static void targetSumPair(int[] arr, int target){
    //write your code here
    Arrays.sort(arr);
    int lo=0;
    int hi=arr.length-1;

    while(lo<hi){
      if(arr[lo]+arr[hi]==target){
        System.out.println(arr[lo]+", "+arr[hi]);
        lo++;
        hi--;
      }else if(arr[lo]+arr[hi]>target){
        hi--;
      }else if(arr[lo]+arr[hi]<target){
        lo++;
      }
    }

  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    targetSumPair(arr,target);
  }

}