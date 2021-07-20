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
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
    int y = 215;   //sum of days of month till less than 256
    if(year>=1700 && year<=1917)
    {
        if(year%4==0)
            y+=29;
        else
           y+=28;
    }
    else if(year==1918)
    y+=(28-13);
    else if(year>=1919)
    {
        if(year%100==0)
        {
            if(year%400==0)
            y+=29;
            else
            y+=28;
            
        }
        else
        {
            if(year%4==0)
            y+=29;
            else
            y+=28;
        }
    }
    String s=String.valueOf(256-y)+".09."+String.valueOf(year);
    return s;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
