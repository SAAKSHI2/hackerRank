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
     * Complete the 'gameOfThrones' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String gameOfThrones(String s) {
    // Write your code here
    char ch[]=s.toCharArray();
  Arrays.sort(ch);
  int a[]=new int[s.length()],x=0,c=1;
  for(int i=0;i<s.length();i++)
  {
      if(i<s.length()-1&&ch[i]==ch[i+1])
      c++;
      else
      {
          a[x]=c;
          c=1;
          x++;
      }
  }
  c=0;
  for(int i=0;i<x;i++)
  {
      if(a[i]%2!=0)
      c++;
  }
  if(c==1 || c==0)
  return "YES";
  return "NO";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
