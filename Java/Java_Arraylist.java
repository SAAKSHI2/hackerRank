import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sr =new Scanner(System.in);
        int n = sr.nextInt();
         ArrayList<List> a = new ArrayList<List>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> a1 = new ArrayList<Integer>();
            int x1 = sr.nextInt();
            for(int j=0;j<x1;j++)
              {
                  int y1=sr.nextInt();
                  a1.add(y1);
              }
              a.add(a1);
        }
        int q = sr.nextInt();
        
        for(int i=0;i<q;i++)
        {
            int x = sr.nextInt();
            int y=sr.nextInt();
            try
            {
                 System.out.println(a.get(x-1).get(y-1));
            }
            catch(Exception e)
               {
                 System.out.println("ERROR!");
               }
                
                
        }
    }
}
