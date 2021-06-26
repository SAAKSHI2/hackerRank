import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(B.charAt(0)>=A.charAt(0))
        System.out.println("No");
        else
        System.out.println("Yes");
        String ss = A.substring(0,1);
        String s=ss.toUpperCase();
        A=A.replace(ss,s);
        ss=B.substring(0,1);
        s=ss.toUpperCase();
        B=B.replace(ss,s);
        System.out.println(A+" "+B);
        
    }
}



