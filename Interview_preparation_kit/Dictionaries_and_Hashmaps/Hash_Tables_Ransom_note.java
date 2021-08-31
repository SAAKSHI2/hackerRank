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
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here
      Hashtable<String,Integer> h1=new Hashtable<>();
      Hashtable<String,Integer> h2=new Hashtable<>();
      for(int i=0;i<magazine.size();i++)
      {
          if(h1.containsKey(magazine.get(i)))
          {
              h1.put(magazine.get(i),h1.get(magazine.get(i))+1);
          }
          else
          h1.put(magazine.get(i),1);
      }
      for(int i=0;i<note.size();i++)
      {
          if(h2.containsKey(note.get(i)))
          {
              h2.put(note.get(i),h2.get(note.get(i))+1);
          }
          else
          h2.put(note.get(i),1);
      }
      for(int i=0;i<note.size();i++)
      {
          if(h1.containsKey(note.get(i)) && h1.get(note.get(i))>=h2.get(note.get(i)))
          continue;
          else
          {
              System.out.println("No");
              return;
          }
      }
      System.out.println("Yes");
      
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(firstMultipleInput[0]);

        int n = Integer.parseInt(firstMultipleInput[1]);

        List<String> magazine = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        List<String> note = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .collect(toList());

        Result.checkMagazine(magazine, note);

        bufferedReader.close();
    }
}
