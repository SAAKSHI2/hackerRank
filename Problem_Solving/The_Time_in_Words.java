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
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
    // Write your code here
    String s1[] = {"one","two","three","four","five","six","seven","eigth","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    String s2[]={"twenty","thirty","fourty","fifty","sixty"};
    if(m==0)
    {
        return s1[h-1]+" o' clock";
    }
    else if(m>=1 && m<=30)
    {
       if(m<20)
       {
           if(m==15)
           return "quarter past "+s1[h-1];
           else if(m==1)
           return s1[m-1]+" minute past "+s1[h-1];
           return s1[m-1]+" minutes past "+s1[h-1];
       }
       else
       {
           if(m==30)
           {
               return "half past "+s1[h-1];
           }
          String s=s2[m/10-2];
         if(m%10>0)
          s=s+" "+s1[m%10-1];
          return s+" minutes past "+s1[h-1];
       }
    }
    else
    {
         if(60-m<20)
         {
           if(m==45)
           return "quarter to "+s1[h];
           else if(60-m==1)
           return s1[m-1]+" minute past "+s1[h-1];
           return s1[60-m-1]+" minutes to "+s1[h];
         }
       else if((60-m>20))
       {
          String s=s2[(60-m)/10-2];
         if(m%10>0)
          s=s+" "+s1[m%10-1];
          return s+" minutes to "+s1[h];
       }
        
    }
    
    return "";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int h = Integer.parseInt(bufferedReader.readLine().trim());

        int m = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.timeInWords(h, m);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
