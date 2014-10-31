import java.util.Scanner;

public class GrimshawGuess {
   //constant for maximum
   public final static int MAX_NUMBER = 100;
   //globals for keeping track of runtime stats
   public static int gamesPlayed = 0, guessesMade = 0, maxGuesses = 0;
   public static double avgGuesses = 0.;
   
   public static void giveInstructions() {
      //prints the instructions
      System.out.println("This program allows you to play a guessing game.");
      System.out.println("I will think of a number between 1 and "+MAX_NUMBER);
      System.out.println("and will allow you to guess until you get it.");
      System.out.println("For each guess, I will tell you whether the");
      System.out.println("right answer is higher or lower than your guess.");
      System.out.println();
   }
   
   public static int generateNumber() {
      //generates a random number answer
      System.out.println("I'm thinking of a number...");
      return (int)(Math.random()*MAX_NUMBER+1);
   }
   
   public static int getGuess(Scanner cnsl) {
      //reads the guess from the console
      System.out.print("Your guess? ");
      return cnsl.nextInt();
   }
   
   public static void playGame(Scanner console) {
      //plays the overall game
      
      //get the random number, and set locals to show that nothing has
      //happened yet.
      int num = generateNumber();
      int guess = -1, numGuess = 0;
      
      while (guess != num) {
         //loop until the guess is correct
         guess = getGuess(console);
         numGuess++;
         //check if higher or lower (not executed if guess == num)
         if (guess > num)
            System.out.println("lower");
         else if (guess < num)
            System.out.println("higher");
      }
      //print the game stats
      System.out.println("You got it right in "+numGuess+" guesses\n");
      //add this games stats to the global stats
      logStats(numGuess);
   }
   
   public static void logStats(int guesses) {
      //updates the global statistics
      //TODO: find a way to make it so that only this method can access the globals
      //      without having a ton of parameters (arrays?)
      gamesPlayed++;
      guessesMade += guesses;
      avgGuesses = (double)guessesMade/gamesPlayed;
      if (guesses > maxGuesses)
         maxGuesses = guesses;
   }
   
   public static void main(String[] args) {
      //runs the games until the user says to stop.
      giveInstructions();
      Scanner console = new Scanner(System.in);
      playGame(console);
      while (playAgain(console))
         playGame(console);
      //print their statistics after they finish playing
      printStats();
   }
   
   public static boolean playAgain(Scanner cnsl) {
      //ask if the user would like to play again.
      //get user input
      System.out.print("Play Again? ");
      String ans = cnsl.next();
      while (true) {
         //loops infinately until answer either starts with Y, y, n, or N
         cnsl.nextLine(); //clears the buffer (if user enters a multi-token
         // answer, such as "Yes I would like to play again!", then the input 
         // stream would already be filled when we next call cnsl.nextInt() in
         // playGame(), which would cause an exception.
         if (ans.startsWith("y") || ans.startsWith("Y"))
            return true;
         else if (ans.startsWith("n") || ans.startsWith("N"))
            return false;
         else {
            //input was not valid, ask again.
            System.out.print("Play Again? ");
            ans = cnsl.next();
         }
      }
   }
   
   public static void printStats() {
      System.out.println("\nOverall results:");
      System.out.println("\ttotal games\t= "+gamesPlayed);
      System.out.println("\ttotal guesses\t= "+guessesMade);
      System.out.println("\tguesses/game\t= "+avgGuesses);
      System.out.println("\tmax guesses\t= "+maxGuesses);
   }
}