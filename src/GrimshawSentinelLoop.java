import java.util.Scanner;

public class GrimshawSentinelLoop {
   public static final int SENTINEL = -1;
   
   public static void main(String[] args) {
      int max = Integer.MIN_VALUE, numbers = 0, next = 0;
      String nums = new String();
      Scanner console = new Scanner(System.in);
      
      while (next != SENTINEL) {
         System.out.print("Type a number (or "+SENTINEL+" to end): ");
         next = console.nextInt();
         
         if (next > max && next != SENTINEL)
            max = next;
         if (next != SENTINEL){
            numbers++;
            nums += next+", ";
         } else if(!nums.equals(new String()))
            nums = nums.substring(0, nums.length()-2);
      }
      if (numbers != 0) {
         System.out.println(nums);
         System.out.println(max+" is the maximum of "+numbers+" numbers entered.");
      }
   }
}
         