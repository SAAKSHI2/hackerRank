import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        int a[][] = new int[6][6];
        Scanner sr = new Scanner(System.in);
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                a[i][j]=sr.nextInt();
            }
        } 
        int sum=0,max=a[0][0]+a[0][1]+a[0][2]+a[1][1]+a[2][0]+a[2][1]+a[2][2];
        for(int i=0;i<=3;i++)
        {
            for(int j=0;j<=6-3;j++)
            {
                sum=0;
                for(int k=j;k<j+3;k++)
                {
                  sum+=a[i][k]+a[i+2][k]; 
                  if(k==j+1)
                   sum+=a[i+1][k]; 
                }
                if(sum>max)
                  max=sum;
            }
        }
        System.out.println(max);
    }
}
