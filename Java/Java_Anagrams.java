import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()==b.length())
        {
        a=a.toLowerCase();
        b=b.toLowerCase();
        char s1[]=a.toCharArray();
        char s2[]=b.toCharArray();
        for(int i=0;i<a.length();i++)
        {
            for(int j=0;j<a.length();j++)
            {
                if(s1[i]>s1[j])
                {
                    char t=s1[i];
                    s1[i]=s1[j];
                    s1[j]=t;
                }
                  if(s2[i]>s2[j])
                {
                    char t=s2[i];
                    s2[i]=s2[j];
                    s2[j]=t;
                }
            }
        }
       // java.util.Arrays.sort(s1);
      //  java.util.Arrays.sort(s2);
        a =String.valueOf(s1);
        b=String.valueOf(s2);
        if(a.equals(b))
         return true;
        }
        return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}