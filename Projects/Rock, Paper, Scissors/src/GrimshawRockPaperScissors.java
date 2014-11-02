import java.util.Scanner;

public class GrimshawRockPaperScissors {
   public static int totalGames = 0;
   public static void giveInstructions() {
      System.out.println("This program plays games of Rock-Paper-Scissors");
      System.out.println("against the computer. You'll type in your guess");
      System.out.println("of (R)ock, (P)aper, or (S)cissors and try to");
      System.out.println("beat the computer as many times as you can.");
   }
   
   public static int getGames(Scanner cnsl) {
      System.out.print("Best out of how many games (must be odd)? ");
      totalGames = cnsl.nextInt();
      if (totalGames % 2 == 0 || totalGames <= 0) {
         System.out.println("Invalid number of games. Type a positive odd number!");
         return getGames(cnsl);
      }
      return totalGames;
   }
   
   public static boolean isAnotherGame(int game) {
      return game <= totalGames;
   }
   
   public static int getWeapon(Scanner cnsl) {
	  System.out.print("Choose your weapon? ");
	  String weapon = cnsl.next();
	  return -1;
   }
	  
   public static void playGame(int game, Scanner console) {
      int weapon = getWeapon(console);
   }
   
   public static void logStats() {
      
   }
   
   public static int getLevel(Scanner cnsl) {
      return -1;
   }
   
   public static void printStats() {
      
   }
   
   public static boolean playAgain(Scanner console) { 
	   return false;  
   }
   
   public static void play() {
      Scanner console = new Scanner(System.in);
      giveInstructions();
      getGames(console);
      int game = 1;
      while (isAnotherGame(game))
         playGame(game, console);
      while (playAgain(console)) {
         game = 1;
         while (isAnotherGame(game))
            playGame(game, console);
      }
      
      
   }
   
   public static void main(String[] args) {
      play();
   }
}
