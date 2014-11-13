public class GrimshawRhymeAlliterate {
   public static void main(String[] args) {
      String word1 = "fare";
      String word2 = "flare";
      if (areRhyming(word1, word2))
         System.out.println("They rhyme!");
      // < place alliterate code here >
      if (areAlliterating(word1, word2))
         System.out.println("They alliterate!");
   }
   
   // Returns true if s1 and s2 end with the same two letters.
   public static boolean areRhyming(String s1, String s2){
      return (s1.length() >= 2 && s2.length() >= 2 && s1.endsWith(s2.substring(s2.length() - 2)));
   }
   
   // Returns true if s1 and s2 start with the same letter.
   public static boolean areAlliterating(String str1, String str2) {
      return (str1.startsWith(str2.substring(0,1)));
   } 
}