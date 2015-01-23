import java.util.*;

public class GrimshawArrayListPractice {
   public static void main(String[] args) {
      ArrayList<String> list1 = new ArrayList<>();
      ArrayList<Integer> list2 = new ArrayList<>();
      ArrayList<Integer> list3 = new ArrayList<>();
      
      list1.add("be");
      list1.add("be");
      list1.add("is");
      list1.add("not");
      list1.add("or");
      list1.add("question");
      list1.add("that");
      list1.add("the");
      list1.add("to");
      list1.add("to");
      
      list2.add(0);
      list2.add(7);
      list2.add(2);
      list2.add(0);
      list2.add(0);
      list2.add(4);
      list2.add(0);
      
      list3.add(3);
      list3.add(8);
      list3.add(19);
      list3.add(42);
      list3.add(7);
      list3.add(26);
      list3.add(19);
      list3.add(-8);
      // ^^^ Is there a faster way to do this than with the add function?
      
      removeDuplicates(list1);
      removeZeroes(list2);
      reverse3(list3);
      
      System.out.println(list1+"\n"+list2+"\n"+list3);
   }
   
   public static void removeDuplicates(ArrayList<String> strs) {
      for (int i = 0; i < strs.size(); i++) 
         while (i+1 < strs.size() && strs.get(i) == strs.get(i+1))
            strs.remove(i+1); // ^^^ It would be slower to use an if to do this 
   }
   
   public static void removeZeroes(ArrayList<Integer> ints) {
      for (int i = 0; i < ints.size(); i++)
         while (i < ints.size() && ints.get(i) == 0)
            ints.remove(i); // ^^^ Also, using a while doesn't require modifying the count
   }
   
   public static void reverse3(ArrayList<Integer> ints) {
      for (int i = 0; i < ints.size()-2; i += 3) {
         // Basic swapping
         int tmp = ints.get(i);
         ints.set(i, ints.get(i+2));
         ints.set(i+2, tmp);
      }
   }  
}