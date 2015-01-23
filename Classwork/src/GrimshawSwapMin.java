import java.util.*;

public class GrimshawSwapMin {
   public static void swapPairs(ArrayList<String> strs) {
      for (int i = 0; i < strs.size()-1; i+=2) {
         String s = strs.get(i);
         strs.set(i, strs.get(i+1));
         strs.set(i+1, s);
      }
   }
   
   public static void minToFront(ArrayList<Integer> ints) {
      if (ints.size() == 0) 
         return;
      ArrayList<Integer> indeces = new ArrayList<Integer>(ints.size());
      ArrayList<Integer> updated = new ArrayList<Integer>(ints.size());
      
      for (int i = 0; i < ints.size(); i++)
         indeces.add(i);
      
      int min = Integer.MAX_VALUE;
      int minIndex = -1;
      int index = 0;
      
      for (int i : ints) {
         if (i < min) {
            min = i;
            minIndex = index;
         }
         index++;
      }
      
      indeces.remove(minIndex);
      updated.add(0);
      
      for (int i = 0; i < indeces.size(); i++)
         updated.add(ints.get(indeces.get(i)));
         
      updated.set(0, min);
      
      for (int i = 0;i < updated.size(); i++)
         ints.set(i, updated.get(i));
   }
   
   public static void main(String[] args) {
      ArrayList<String> list1 = new ArrayList<>();
      ArrayList<Integer> list2 = new ArrayList<>();
      
      list1.add("to");
      list1.add("be");
      list1.add("or");
      list1.add("not");
      list1.add("to");
      list1.add("be");
      list1.add("hamlet");
      
      list2.add(3);
      list2.add(8);
      list2.add(92);
      list2.add(4);
      list2.add(2);
      list2.add(17);
      list2.add(9);
      
      swapPairs(list1);
      minToFront(list2);
      
      System.out.println(list1);
      System.out.println(list2);
   }
}
      
