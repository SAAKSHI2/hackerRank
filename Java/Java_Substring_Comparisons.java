import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        String st[]=new String[s.length()];
        smallest = s.substring(0,k);
        largest = s.substring(s.length()-k,s.length());
        for(int i=0;i<=s.length()-k;i++)
        {
                st[i]=s.substring(i,i+k);
                if(st[i].compareTo(largest)>1)
                largest = st[i];
                else if(st[i].compareTo(smallest)<0)
                smallest = st[i];
        }
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}