/**
 * grimshawSong.java :: outputs song lyrics
 * @author "Daniel Grimshaw"
 * @version "0.0.1"
 *
 */

public class GrimshawSong {
   public static void main(String[] args) {
      printSongOne();
      //The following execute the code for the more complex version
      GrimshawSong Song1 = new GrimshawSong("old_lady");
      GrimshawSong Song2 = new GrimshawSong(2);
   }
   
   public GrimshawSong() {
      //default constructor
      this(1);
   }
   
   public GrimshawSong(int id) {
      //specialized constructor
      this.printSong(id);
   }
   
   public GrimshawSong(String name) {
      //specialized constructor
      switch (name) {
         case "old_lady":
            this.printSong(1);
         default:
            this.printSong(2);
      }
   }
   public void printSong(int id) {
      //selects the song that has an identical id number and prints it
      //Complains if there are no songs that have that id number
      //ID's:
      //1: Song one
      //2: Song two
      switch (id) {
         case 1:
            swallowPer("fly");
            endVerse();
            swallow("spider");
            System.out.println("That wriggled and iggled and jiggled inside her.");
            because("spider", "fly");
            endVerse();
            swallow("bird");
            System.out.println("How absurd to swallow a bird.");
            because("bird", "spider");
            because("spider", "fly");
            endVerse();
            swallow("cat");
            System.out.println("Imagine that to swallow a cat.");
            because("cat", "bird");
            because("bird", "spider");
            because("spider", "fly");
            endVerse();
            swallow("dog");
            System.out.println("What a hog to swallow a dog.");
            because("dog", "cat");
            because("cat", "bird");
            because("bird", "spider");
            because("spider", "fly");
            endVerse();
            swallow("horse");
            System.out.println("She died of course.\n\n\n");
            break;
         case 2:
            opener("cat");
            System.out.println("Cat goes fiddle-i-fee.\n");
            opener("hen");
            System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
            System.out.println("Cat goes fiddle-i-fee.\n");
            opener("duck");
            System.out.println("Duck goes quack, quack,");
            System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
            System.out.println("Cat goes fiddle-i-fee.\n");
            opener("goose");
            System.out.println("Goose goes hissy, hissy,");
            System.out.println("Duck goes quack, quack,");
            System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
            System.out.println("Cat goes fiddle-i-fee.\n");
            opener("sheep");
            System.out.println("Sheep goes baa, baa,");
            System.out.println("Goose goes hissy, hissy,");
            System.out.println("Duck goes quack, quack,");
            System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
            System.out.println("Cat goes fiddle-i-fee.\n");
            opener("pig");
            System.out.println("Pig goes oink, oink,");
            System.out.println("Sheep goes baa, baa,");
            System.out.println("Goose goes hissy, hissy,");
            System.out.println("Duck goes quack, quack,");
            System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
            System.out.println("Cat goes fiddle-i-fee.");
            break;
         default:
            System.out.println("\n\nError: Unknown ID number!\n");
      }
   }
   
   public static void printSongOne() {
      //prints the six verses of the first song
      printVerseOne();
      printVerseTwo();
      printVerseThree();
      printVerseFour();
      printVerseFive();
      printVerseSix();
   }
   private void swallow(String animal) {
      //make an old woman swallow specified animal
      System.out.println("There was an old woman who swallowed a "+animal+",");
   }
   
   private void swallowPer(String animal) {
      //make an old woman swallow specified animal, but this time prints a period at the end
      System.out.println("There was an old woman who swallowed a "+animal+".");
   }
   
   private void endVerse() {
      //prints the final two lines of each verse in song one
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.\n");
   }
   
   private void because(String animal, String reason) {
      //prints the reason why the old woman swallowed 
      //specifed animal (animal because reason)
      System.out.println("She swallowed the "+animal+" to catch the "+reason+",");
   }
   
   private void opener(String animal) {
      //prints the opener of each verse in song two
      //makes someone buy, feed, and be pleased by specified animal
      System.out.println("Bought me a "+animal+" and the "+animal+" pleased me,");
      System.out.println("I fed my "+animal+" under yonder tree.");
   }
   
   public static void printEndVerse() {
      //prints the end of each verse in song one
      System.out.println("I don't know why she swallowed that fly,");
      System.out.println("Perhaps she'll die.\n");
   }
   
   public static void printVerseOne() {
      //prints verse one
      System.out.println("There was an old woman who swallowed a fly.");
      printEndVerse();
   }
   
   public static void printVerseTwo() {
      //prints verse two
      System.out.println("There was an old woman who swallowed a spider,");
      System.out.println("That wriggled and iggled and jiggled inside her.");
      System.out.println("She swallowed the spider to catch the fly,");
      printEndVerse();
   }
   
   public static void printVerseThree() {
      //prints verse three
      System.out.println("There was an old woman who swallowed a bird,");
      System.out.println("How absurd to swallow a bird.");
      System.out.println("She swallowed the bird to catch the spider,");
      System.out.println("She swallowed the spider to catch the fly,");
      printEndVerse();
   }
   
   public static void printVerseFour() {
      //prints verse four
      System.out.println("There was an old woman who swallowed a cat,");
      System.out.println("Imagine that to swallow a cat.");
      System.out.println("She swallowed the cat to catch the bird,");
      System.out.println("She swallowed the bird to catch the spider,");
      System.out.println("She swallowed the spider to catch the fly,");
      printEndVerse();
   }
   
   public static void printVerseFive() {
      //prints verse five
      System.out.println("There was an old woman who swallowed a dog,");
      System.out.println("What a hog to swallow a dog.");
      System.out.println("She swallowed the dog to catch the cat,");
      System.out.println("She swallowed the cat to catch the bird,");
      System.out.println("She swallowed the bird to catch the spider,");
      System.out.println("She swallowed the spider to catch the fly,");
      printEndVerse();
   }
   
   public static void printVerseSix() {
      //prints verse six
      System.out.println("There was an old woman who swallowed a horse,");
      System.out.println("She died of course.\n\n");
   }
}