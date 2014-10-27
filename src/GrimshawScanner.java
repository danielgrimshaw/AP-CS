import java.io.*;
import java.util.Scanner;
//import java.util.*;

public class GrimshawScanner {
   public static int readInt(String message) throws IOException, NumberFormatException {
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
   
   public static void inputBirthday(Scanner console) throws IOException{
      //The parameter is only included to comply with the requirements of the question
      //and with getting the month.
      //The methods use a buffered reader to read what they read.
      int day = readInt("On what day of the month were you born? ");
      System.out.print("What is the name of the month in which you were born? ");
      String month = console.next();
      //The following comment could have been buggy if a user had entered multiple words
      //String month =1 readLine("What is the name of the month in which you were born? ");
      int year = readInt("During what year were you born? ");
      System.out.println("You were born on "+month+" "+day+ ", "+year+". You're mighty old!");
   }
   
   public static void processName(Scanner console) {
      System.out.print("Please enter your full name: ");
      String first = console.next();
      String last = console.next();
      System.out.println("Your name in reverse order is "+last+", "+first);
   }
   
   public static void main(String[] args) throws IOException {
      Scanner s;
      inputBirthday(s = new Scanner(System.in));
      processName(s);
   }
}