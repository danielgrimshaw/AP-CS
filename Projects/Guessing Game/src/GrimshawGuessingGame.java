public class GrimshawGuessingGame {
   public final static int MAX_NUMBER = 100;
   public int gamesPlayed = 0, guessesMade = 0;
   public int avgGuesses = 0, maxGuesses = 0;
   
   public static void giveInstructions() {
      System.out.println("This program allows you to play a guessing game.");
      System.out.println("I will think of a number between 1 and "+MAX_NUMBER);
      System.out.println("and will allow you to guess until you get it.");
      System.out.println("For each guess, I will tell you whether the");
      System.out.println("right answer is higher or lower than your guess.");
   }
   
   public static int generateNumber() {
      System.out.println("I'm thinking of a number...");
      return (int)(Math.random()*MAX_NUMBER+1);
   }
   
   public static void playGame() {
      giveInstructions()
      int num = generateNumber();
   }
   
   public static void logStats(int guesses) {
      gamesPlayed++;
      guessesMade += guesses;
      avgGuesses = guessesMade/gamesPlayed;
      if (guesses > maxGuesses)
         maxGuesses = guesses;
   }
   
   public static void main(String[] args) {
      
   }
   
   public static boolean playAgain() {
      System.out.print("Play Again? ");
      String ans = console.next();
      while (true) {
         if (ans.startsWith("y") || ans.startsWith("Y"))
            return true;
         else if (ans.startsWith("n") || ans.startsWith("N"))
            return false;
         else {
            System.out.print("Play Again? ");
            ans = console.next();
         }
      }
   }
}