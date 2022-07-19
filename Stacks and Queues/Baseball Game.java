import java.io.*;
import java.util.*;

public class Main {
  public static int calPoints(String[] ops) {
    Stack<Integer> points=new Stack<>();
    int sum=0;

    for(int i=0;i<ops.length;i++){
      if(ops[i].equals("C")){
        points.pop();
      }else if(ops[i].equals("D")){
        int val=points.peek();
        points.push(2*val);
      }else if(ops[i].equals("+")){
        int val1=points.pop();
        int val2=points.peek();
        points.push(val1);
        points.push(val1+val2);
      }else{
        int val=Integer.parseInt(ops[i]);
        points.push(val);
      }
    }

    while(points.size()>0){
      int val=points.pop();
      sum=sum+val;
    }
    return sum;
  }

  public static void main(String[] args) throws Exception {
    BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    int result = calPoints(read.readLine().split(" "));
    System.out.println(result);

  }
}
