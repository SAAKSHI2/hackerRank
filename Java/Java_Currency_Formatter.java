import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.US);
        String us = f.format(payment);
         NumberFormat fi = NumberFormat.getCurrencyInstance(new Locale("en","in"));
         String india = fi.format(payment);
          NumberFormat fc = NumberFormat.getCurrencyInstance(Locale.CHINA);
          String china = fc.format(payment);
           NumberFormat ff = NumberFormat.getCurrencyInstance(Locale.FRANCE);
           String france = ff.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
