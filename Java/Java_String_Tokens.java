import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       
        String s = scan.nextLine();
        // Write your code here.
        if(s.trim().length()==0 || s.trim().length()>400000)
        {
          System.out.println(0);
          return;
        }
         s=s.trim();
        String sp[]=s.split("[\\s-.'?,_@!]+");
        System.out.println(sp.length);
        for(String i :sp)
        {
            System.out.println(i);
        }
        scan.close();
    }
}

