import java.io.*;
	import java.util.*;

	public class Main {

	    public static void main(String[] args) throws Exception {
			Scanner scn=new Scanner(System.in);
			int n=scn.nextInt();

			int[] vals=new int[n];
			for(int i=0;i<n;i++){
				vals[i]=scn.nextInt();
			}

			int[] wts=new int[n];
			for(int i=0;i<n;i++){
				wts[i]=scn.nextInt();
			}

			int cap=scn.nextInt();

			int[] dp=new int[cap+1];
			dp[0]=0;

			for(int bagc=1;bagc<=cap;bagc++){
				int max=0;
				for(int i=0;i<n;i++){

					if(wts[i]<=bagc){
						int rembc=bagc-wts[i];
						int rembv=dp[rembc];
						int tbagv=rembv+vals[i];

						if(tbagv>max){
							max=tbagv;
						}
					}
				}

				dp[bagc]=max;
			}

			System.out.println(dp[cap]);
	    }
	}