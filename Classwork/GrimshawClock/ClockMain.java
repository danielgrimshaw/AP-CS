import java.util.*;

public class ClockMain {
   public static void main(String[] args) {
      ArrayList<ClockTime> times = new ArrayList<ClockTime>();
         
      times.add(new ClockTime(12, 00, "AM"));
      
      times.add(new ClockTime(12, 59, "AM"));
      times.add(new ClockTime(1, 00, "AM"));
      
      times.add(new ClockTime(11, 59, "AM"));
      times.add(new ClockTime(12, 00, "PM"));
      
      times.add(new ClockTime(12, 59, "PM"));
      times.add(new ClockTime(1, 00, "PM"));
      
      times.add(new ClockTime(11, 59, "PM"));
      
      for (int i = 0; i < times.size(); i++) {
         System.out.println("index: " + i + ", time: " + times.get(i));
      }
      System.out.println();
      
      for (ClockTime time1 : times) {
         for (ClockTime time2 : times) {
            System.out.print(time1 + " compared to " + time2 + " is: ");
            System.out.println(time1.compareTo(time2));
         }
         System.out.println();
      }
      
   }
}