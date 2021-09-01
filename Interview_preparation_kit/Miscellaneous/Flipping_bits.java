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
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
    // Write your code here
    long c=0;
    String s="";
    for(int i=0;n>0;i++)
    {
        long v = n%2;
        s=s+v;
        n=n/2;
    }
    for(int i=0;s.length()<32;i++)
    {
        s=s+"0";
    }
    StringBuffer sb=new StringBuffer(s);
    sb.reverse();
   
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='0')
        sb.setCharAt(i,'1');
        else
        sb.setCharAt(i,'0');
    }
     s=sb.toString();
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='1')
        c+=(Math.pow(2,i));
    }
    return c;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                long n = Long.parseLong(bufferedReader.readLine().trim());

                long result = Result.flippingBits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
