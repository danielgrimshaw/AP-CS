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
      
   }
}