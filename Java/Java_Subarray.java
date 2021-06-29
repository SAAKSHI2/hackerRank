import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sr=new Scanner(System.in);
        int n=sr.nextInt();
        int a[]=new int[n];
        int c=0,sum=0;
        for(int i=0;i<n;i++)
         a[i]=sr.nextInt();
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=a[j];
                if(sum<0)
                 c++;
            }
            
        }

        System.out.println(c);
    }
}
