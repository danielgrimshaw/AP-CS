import java.io.*;
import java.util.Scanner;

class Input {
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

public class Grimshaw_Grades {
   public static final String CURVED = "\tWas there a curve?";
   public static final String TAKEN = "\tHave you taken the final exam yet?";
   public static final String WEIGHT = "\tWhat is its weight (0-100)";
   public static final String CURVE = "\tHow much was the curve";
   public static final String DESIRED_SCORE = "\tWhat percentage would you like to earn in the course";
   
   public static void printIntro() {
      System.out.println("This program accepts your homework and exam");
      System.out.println("scores as input, and computes your grade in");
      System.out.println("the course or indicates what grade you need");
      System.out.println("to earn on the final exam.");
      System.out.println();
   }
  
   public static double printWeightedScore(String catagory, double totalScore, int maxScore, double weight) {
      double score = totalScore/maxScore;
      score *= weight;
      System.out.printf("\tWeighted %s score: %.2f\n\n", catagory, score);
      return score;
   }
   
   public static double getHomework(Input console) throws IOException{
      double totalScore = 0., weight = 0.;
      int  maxScore = 0, assnNum = 0;
      System.out.println("Homework:");
      weight = get(WEIGHT, console);
      assnNum = console.readInt("\tHow many homework assignments were there? ");
      for (int i = 1; i <= assnNum; i++) {
         Scanner tmp = new Scanner(System.in);
         System.out.print("\tHomework "+i+" score and max score: ");
         totalScore += tmp.nextDouble();
         maxScore += tmp.nextInt();
      }
      return printWeightedScore("homework", totalScore, maxScore, weight);
   }
   
   public static double get(String question, Input console)throws IOException {
      return console.readDouble(question+"? ");
   }
   
   public static boolean isIt(String question, Input console) throws IOException{
      return console.readInt(question+" (1 for yes, 2 for no) ") ==  1 ? true : false;
   }
   
   public static double getExam(Input console) throws IOException{
      double weight = 0., score = 0., curve = 0.;
      int maxScore = 100;
      weight = get(WEIGHT, console);
      score = console.readDouble("\tExam score: ");
      if (isIt(CURVED, console))
         curve = get(CURVE, console);
      return printWeightedScore("exam", (score+curve>=maxScore ? 100 : score+curve), maxScore, weight);  
   }
   
   public static double getMidterm(Input console) throws IOException {
	  System.out.println("Midterm exam:");
      return getExam(console);
   }
   
   public static double getFinal(double grade, Input console) throws IOException{
      double weight = 0., endGrade = 0., ans;
      int maxScore = 100;
      System.out.println("Final exam:");
      if (isIt(TAKEN, console))
         return getExam(console);
      weight = get(WEIGHT, console);
      endGrade = get(DESIRED_SCORE, console);
      double weightedScore = endGrade-grade;
      ans = weightedScore/weight;
      ans *= 100;
      System.out.printf("\n\tYou need a score of %.2f on the final exam.\n", ans);
      if (ans > 100.) {
	     System.out.println("\tSorry, it is impossible to achieve this percentage.");
         System.out.printf("\tThe highest percentage you can get is %.2f\n", (grade+weight));
	  }
      System.exit(0);
      return weight;
   }
   
   public static double calculateGrade() throws IOException{
      double grade = 0.;
      Input console = new Input();
      grade += getHomework(console);
      grade += getMidterm(console);
      grade += getFinal(grade, console);
      return grade;
   }
   
   public static void main(String[] args) throws IOException {
	  printIntro();
      double grade = calculateGrade();
      System.out.printf("\tYour course grade is %.2f\n", grade);
   }
}
