import java.util.*;

public class GrimshawABCD {
   public static void main(String[] args) {
      ArrayList<String> letterList = new ArrayList<String>();
      letterList.add("a");
      letterList.add("b");
      letterList.add("c");
      letterList.add("d");
      System.out.println(letterList);
      
      // Problem 1
      ArrayList<String> modifyBuffer = new ArrayList<String>();
      for (String s : letterList) {
         if (s != letterList.get(letterList.size()-1))
            modifyBuffer.add(s+" plus");
         else
            modifyBuffer.add(s);
      }

      letterList = modifyBuffer;
      System.out.println(letterList);
      
      // Problem 2
      for (int i = 0; i < letterList.size(); i++)
         letterList.set(i, letterList.get(i).substring(0, 1));
      System.out.println(letterList);
      
      // Problem 3
      for (int i = letterList.size()-1; i >=0; i--)
         if (!(letterList.get(i) == letterList.get(letterList.size()-1)))
            letterList.set(i, letterList.get(i)+" plus");
      System.out.println(letterList);
      
      // Problem 4
      for (int i = letterList.size()-1; i >= 0; i--)
         letterList.set(i, letterList.get(i).substring(0, 1));
      System.out.println(letterList);
   }
}