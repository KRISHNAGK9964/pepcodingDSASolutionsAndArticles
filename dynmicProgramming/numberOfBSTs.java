import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn  = new Scanner(System.in);
    int n = scn.nextInt();
    int []dp = new int[n+1];
    dp[0] = dp[1] = 1;
    for(int i = 2 ; i <= n ;i++){
        int l = 0 , r = i-1;
        int num = 0;
        while(l<r){
           num = num+( dp[l]*dp[r]);
           l++;
           r--;
        }
        num*=2;
        if(l==r)num+=dp[l]*dp[l];
        dp[i] = num;
    }
    
    System.out.println(dp[n]);
    // System.out.println(Arrays.toString(dp));
 }

}