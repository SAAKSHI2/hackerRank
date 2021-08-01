import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=s.nextInt();
        for(int i=1;i<n;i++)
        {
            int x = a[i];
            int j=i-1;
            while(j>=0 && a[j]>x)
            {
                a[j+1]=a[j];
                j=j-1;
            }
            a[j+1]=x;
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
        System.out.println();
    }
}