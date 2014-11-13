import java.io.*;
import java.util.Scanner;
//import java.util.*;

public class ScannerExample {
   public static int readInt(String message) throws IOException {
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
   
   public static int readInt() throws IOException {
      return readInt("Number: ");
   }
   
    public static String readLine(String message) throws IOException {
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
   
   public static String readLine() throws IOException {
      return readLine("Word: ");
   }
   
    public static double readDouble(String message) throws IOException {
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
   
   public static double readDouble() throws IOException {
      return readDouble("Number: ");
   }
   
   public static void inputBirthday(Scanner console) {
      System.out.print("On what day of the month wrer you born? ");
      

   public static void main(String[] args) throws IOException {
      //Create scanner object
      Scanner console = new Scanner(System.in);
      
      //Scanner with one integer input
      //class example
      System.out.print("How old are you? ");
      //user input
      double age =  console.nextDouble();
      System.out.println(age+"\n");
      
      //my method
      System.out.println(readInt("How old are you? "));
      
      
      //Scanner with two inputs
      System.out.print("Enter two real numbers: ");
      double n1 = console.nextDouble();
      double n2 = console.nextDouble();
      System.out.println("n1: "+n1+" n2: "+n2);
      
      //Read Words
      System.out.print("Whar is your name? ");
      System.out.println(console.next());
      
      //Read Line
      //class implementation
      String n = console.nextLine();
      System.out.println("What is your address?");
      String address = console.nextLine();
      System.out.println(address);
      //my implementation
      System.out.println(readLine("What is your address?\n"));
   }
}