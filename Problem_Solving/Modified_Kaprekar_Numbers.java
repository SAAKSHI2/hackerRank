import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

    public static void kaprekarNumbers(int p, int q) {
    // Write your code here
        int d,flag=0;
         for(int i=p;i<=q;i++)
            {
                String ss=(Integer.toString(i));
                d=ss.length();
                long x =(long)i*i;
                long a = x%(int)Math.pow(10,d);
                long b = x/(int)Math.pow(10,d);
                if((a+b)==i)
                {
                 System.out.print(i+" ");
                 flag++;
                }
            }
            if(flag==0)
            System.out.println("INVALID RANGE");

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int p = Integer.parseInt(bufferedReader.readLine().trim());

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        Result.kaprekarNumbers(p, q);

        bufferedReader.close();
    }
}
