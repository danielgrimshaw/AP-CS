import java.awt.*;

public class TimeSpanMain
{
   public static void main(String[] args)
   {
      TimeSpan t1 = new TimeSpan(3, 45);
      System.out.println("t1: " + t1 + " is " + t1.getTotalHours() + " hours");
      
      t1.add(2, 30);
      System.out.println("t1: " + t1 + " is " + t1.getTotalHours() + " hours");
      
      TimeSpan t2 = new TimeSpan(1, 55);
      System.out.println("t2: " + t2 + " is " + t2.getTotalHours() + " hours");
      t1.add(t2);
      System.out.println("t1 + t2: " + t1 + " is " + t1.getTotalHours() + " hours");
      
      TimeSpan t3 = new TimeSpan(5, 70);
      System.out.println("t3: " + t3 + " is " + t3.getTotalHours() + " hours");
      TimeSpan t4 = new TimeSpan(5, 70);
      System.out.println("t4: " + t4 + " is " + t4.getTotalHours() + " hours");
      
      if (t3.equals(t4)) System.out.println("Time " + t3 + " equals Time " + t4);
      else System.out.println("Time " + t3 + " does not equal Time " + t4);
      if (t1.equals(t2)) System.out.println("Time " + t1 + " equals Time " + t2);
      else System.out.println("Time " + t1 + " does not equal Time " + t2);
      if (t3.equals("Time")) System.out.println("Time " + t3 + " equals Time");
      else System.out.println("Time " + t3 + " does not equal Time");
      
      Point p = new Point(10, 20);
      if (t3.equals(p)) System.out.println("Time " + t3 + " equals " + p);
      else System.out.println("Time " + t3 + " does not equal " + p);
      
   	
   }
}
