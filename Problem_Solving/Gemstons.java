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
     * Complete the 'gemstones' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING_ARRAY arr as parameter.
     */

    public static int gemstones(List<String> arr) {
    // Write your code here
    boolean b = true;
    int c=0;
    char ch[]=arr.get(0).toCharArray();
    Arrays.sort(ch);
    String ss="";
    for(int i=1;i<arr.get(0).length();i++)
    {
        if(ch[i]==ch[i-1])
        continue;
       ss=ss+Character.toString(ch[i-1]); 
    }
    ss=ss+Character.toString(ch[arr.get(0).length()-1]);
    for(int i=0;i<ss.length();i++)
    {
        b=true;
        String s = Character.toString(ss.charAt(i));
        for(int j=1;j<arr.size();j++)
        {
            if(!arr.get(j).contains(s))
            {
                b=false;
                break;
            }  
        }
        if(b==true)
        c++;
    }
    
    return c;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> arr = IntStream.range(0, n).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        int result = Result.gemstones(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
