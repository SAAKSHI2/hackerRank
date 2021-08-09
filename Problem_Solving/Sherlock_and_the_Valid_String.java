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
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {
    // Write your code here
    char c;
    Map<Character,Integer> m = new TreeMap<>();
    for(int i=0;i<s.length();i++)
    {
        if(!m.containsKey(s.charAt(i)))
        m.put(s.charAt(i),1);
        else
        {
        m.put(s.charAt(i),m.get(s.charAt(i))+1);
        c=s.charAt(i);
        }
    }
   Map<Integer,Integer> m2=new TreeMap<>();
    Set<Character> st = m.keySet();
    int x=0;
    for(char k : st)
    {
       if(m2.containsKey(m.get(k)))
       m2.put(m.get(k),m2.get(m.get(k))+1);
       else
       {
       m2.put(m.get(k),1);
       x=m.get(k);
       }
    }
    if(m2.size()>2)
    return "NO";
    else if(m2.size()<2)
    return "YES";
    else if(m2.size()==2)
    {
     Set<Integer> ss = m2.keySet();
      for(int k : ss)
      {
       if(Math.abs(k-x)==1 && m2.get(k)==1||m2.get(x)==1)
       return "YES";
      }
     return "NO";
    }
    return "YES";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.isValid(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
