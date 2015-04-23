import java.util.List;
import java.util.ArrayList;

public class FancyWord {
   public static String scrambleWord(String word) {
      for (int i = 0; i < word.length()-1; i++) {
         String char1 = word.substring(i, i+1);
         String char2 = word.substring(i+1, i+2);
         if (char1.equals("A") && !(char2.equals("A"))) {
            word = word.substring(0, i)+char2+char1+word.substring(i+2);
            i++;
         }
      }
      return word;
   }
    
   public static void scrambleOrRemove(List<String> wordList) {
      List<String> newList = new ArrayList<>();
      for (int i = 0; i < wordList.size(); i++) {
         String word = wordList.get(i);
         if (!(scrambleWord(word).equals(word)))
            newList.add(scrambleWord(word));
      }
      
      while (wordList.size() != 0)
         wordList.remove(0);
   
      for (String word : newList)
         wordList.add(word);
   }
}
