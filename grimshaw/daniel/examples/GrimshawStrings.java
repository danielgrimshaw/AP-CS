/**
 * GrimshawStrings.java - shows use of parameters and returns in
 * methods and usage of Java's String class. 
 */

import java.util.*;

public class GrimshawStrings {
   public static final boolean DEBUG = true;
   public static void main(String[] args) {
      System.out.println(padString("hello", 8));
      System.out.println(padString("congratulations", 10));
      vertical("hey now");
      printReverse("hello there!");
   }
   
   public static String padString(String str, int len) {
      for (int i = str.length(); i < len; i++) {
         //these if statements were for debugging purposes
         if (DEBUG)
            str = str.concat("_");
         else
            str = str.concat(" ");
      }
      return str;
   }
   
   public static printSpaces(int num) {
      padString(new String(), num);
   }
   
   public static void vertical(String str) {
      for (char c : str.toCharArray())
         System.out.println(c);
   }
   
   public static void printReverse(String str) {
      for (int i = str.length()-1; i>=0; i--)
         System.out.print(str.substring(i, i+1));
      System.out.println();
   }
}