import java.util.*;

public class GrimshawArrayListExample {
   public static void main(String[] args) {
      //Create an ArrayList of String objects
      
      ArrayList<String> strList = new ArrayList<>();
      List<String> strList2 = new ArrayList<>();
      ArrayList<ArrayList<String>> listList = new ArrayList<>();
      ArrayList<String> test1 = strList;
      ArrayList<String> test2 = new ArrayList<>();
      System.out.println(strList+"\n"+strList2 + "\n");
      
      // Add elements to the end
      strList.add("item 1");
      strList.add("item 2");
      strList2.add("item 1");
      strList2.add("item 2");
      System.out.println(strList+"\n"+strList2);
      
      listList.add(strList);
      listList.add((ArrayList<String>)strList2);
      System.out.println(listList+"\n");
      
      //remove elements
      strList.remove(0);
      strList.remove(0);
      strList2.remove(0);
      System.out.println(strList+"\n"+strList2);
      System.out.println(listList+"\n");
      
      strList.add("item 3");
      strList.add("item 4");
      strList2.add("item 3");
      strList2.add("item 4");
      System.out.println(strList+"\n"+strList2);
      System.out.println(listList+"\n");
      
      //Set an element at specified index
      strList.set(1, "item 5");
      strList2.set(1, "item 5");
      System.out.println(strList+"\n"+strList2);
      System.out.println(listList+"\n");
      
      for (int i = 0; i < strList.size(); i++)
         System.out.println(strList.get(i));
      
      System.out.println();
      for (String item : strList2)
         System.out.println(item);
         
      if (strList.contains("item 3"))
         System.out.println(strList.indexOf("item 3")+" "+strList.get(strList.indexOf("item 3")));
      
      if (listList.contains(strList))
         System.out.println(listList.indexOf(strList)+" "+listList.get(listList.indexOf(strList)));
      
      if (listList.contains(test1))
         System.out.println(listList.indexOf(test1)+" "+listList.get(listList.indexOf(test1)));
      
      if (listList.contains(test2))
         System.out.println(listList.indexOf(test2)+" "+listList.get(listList.indexOf(test2)));
         
         
      ArrayList<Integer> intList = new ArrayList<Integer>();
      ArrayList<Double> doubleList = new ArrayList<Double>();
      
      int i = 50;
      Integer j = i;
      Integer k = new Integer(i);
      intList.add(i);
      intList.add(j);
      intList.add(k);
      doubleList.add(5.0);
      System.out.println(intList + "\n" + doubleList);
      
      strList.add("item 6");
      strList.add("item 26");
      strList.add("item 16");
      strList2.add("item 6");
      strList2.add("item 26");
      strList2.add("item 16");
      System.out.println("List Before: " + strList);
      
      removeByLastChar("6", strList);
      System.out.println("List After: " + strList);
      
      ArrayList<String> newArrayList = newItems("test", "test2");
      System.out.println(newArrayList);
   }
   
   public static void removeByLastChar(String id, List<String> strList) {
      for (int i = 0; i < strList.size(); i++) {
         String element = strList.get(i);
         if (element.endsWith(id)) {
            strList.remove(i);
            i--;
         }
      }
   }
   
   public static ArrayList<String> newItems(String item1, String item2){
      ArrayList<String> generated = new ArrayList<String>();
      generated.add(item1);
      generated.add(item2);
      return generated;
   }
}