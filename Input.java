/**
 * Input.java - A class for getting input of all types
 * @author "Daniel Grimshaw"
 * @version "0.0.1"
 */
 
package Grimshaw.Daniel.Util;

import java.io.*;
import java.util.Scanner;

public class Input {
   public Input() {
   }
   
   public int readInt(String message) throws IOException {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.print(message);
         int i = Integer.parseInt(br.readLine());
         return i;
      } catch (IOException e) {
         System.out.println("Error: Input Output Error!\nAbort.");
         System.exit(1);
      }//error handling
      return 1;
   }//readInt
   
   public int readInt() throws IOException {
      return readInt("Number: ");
   }
   
    public String readLine(String message) throws IOException {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.print(message);
         String i = br.readLine();
         return i;
      } catch (IOException e) {
         System.out.println("Error: Input Output Error!\nAbort.");
         System.exit(1);
      }//error handling
      return "Error!";
   }//readLine
   
   public String readLine() throws IOException {
      return readLine("Word: ");
   }
   
    public double readDouble(String message) throws IOException {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.print(message);
         double i = Double.parseDouble(br.readLine());
         return i;
      } catch (IOException e) {
         System.out.println("Error: Input Output Error!\nAbort.");
         System.exit(1);
      }//error handling
      return -1.;
   }//readDouble
   
   public double readDouble() throws IOException {
      return readDouble("Number: ");
   }

   public String readWord() {
      return readWord("Word: ");
   }
   
   public String readWord(String message) {
      System.out.print(message);
      Scanner console = new Scanner(System.in);
      return console.next();
   }
}