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
      if (games % 2 == 0 || games <= 0) {
         System.out.println("Invalid number of games. Type a positive odd number!");
         return getGames(cnsl);
      }
   }
   
   public static boolean isAnotherGame(int game) {
      return game <= totalGames;
   }
   
   public static void playGame(int game) {
      String wea
   }
   
   public static void logStats() {
      
   }
   
   public static int getLevel(Scanner cnsl) {
      
   }
   
   public static void printStats() {
      
   }
   
   public static void play() {
      Scanner console = new Scanner(System.in);
      giveInstructions();
      getGames(console);
      int game = 1;
      while (isAnotherGame(game))
         playGame(game);
      while (playAgain(console)) {
         game = 1;
         while (isAnotherGame(game))
            playGame(game);
      }
      
      
   }
   
   public static void main(String[] args) {
      play();
   }
}