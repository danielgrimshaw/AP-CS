import java.io.*;
import java.util.Scanner;

class Input {
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

public class CompareObjects {
   public static void main(String[] args) throws IOException {
      Input cnsl = new Input();
      String city = cnsl.readWord("Enter the name of your city: ");
      //This shows that a switch case statement does not work like an if statement
      switch (city) {
         case "Vancouver" : System.out.println(0);
      }
      if (city == "Vancouver")
         System.out.println(1);
      if (city.equals("Vancouver"))
         System.out.println(2);
      if (city.compareTo("Vancouver") == 0)
         System.out.println(3);
         
      String first = cnsl.readWord("First Name: ");
      String last = cnsl.readWord("Last Name: ");
      int order = first.compareTo(last);
      System.out.println(order);
      if (order < 0)
         System.out.println("Your first name is alphabetically earlier than your last name.");
      else if (order > 0)
         System.out.println("Your last name is alphabetically earlier than your first name.");
      else
         System.out.println("You have identical first and last names.");
   }
}