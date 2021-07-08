import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sr = new Scanner(System.in);
        String a = sr.next();
        String b = sr.next();
        BigInteger A = new BigInteger(a);
             BigInteger B = new BigInteger(b);
        BigInteger c = A.add(B);

         System.out.println(c+"\n"+A.multiply(B));
    }
}
