import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        List<Integer> li = new ArrayList<Integer>();  
        for(int i=0;i<n;i++)
        {
           int s = sr.nextInt();
           li.add(s);
        }
        int q = sr.nextInt();
        for(int i=0;i<q;i++)
        {
            String s = sr.next();
            if(s.equals("Insert"))
            {
                int index=sr.nextInt();
                int ele=sr.nextInt();
                li.add(index,ele);
            }
            else
            {
                int index = sr.nextInt();
                li.remove(index);
            }
        }
        for(int i: li)
        {
            System.out.print(i+" ");
        }
        
    }
}