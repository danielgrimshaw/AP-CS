import java.util.*;

public class GrimshawWhile {
   public static void main(String[] args) {
      //Scanner console = new Scanner(System.in);
      //printAverage(console);
      //printFactors(72);
      randomX();
      randomWalk();
   }

/* Place your methods' body below. */ 
   public static void printAverage(Scanner console) {	
   }

   public static void printFactors(int n) {
   }

   public static void randomX() {
	  int number = 0;
      while (number < 16) {
		 number = (int)(Math.random()*16)+5;
         for (int i = number; i > 0; i--)
			 System.out.print('x');
		 System.out.println();
	  }
   }

   public static void randomWalk(){
	  int pos = 0, maxPos = 0;
	  while (Math.abs(pos) != 3) {
		 if (pos > maxPos)
			maxPos = pos;
		 System.out.println("position = "+pos);
		 if ((int)(Math.random()*2) == 1)
			pos++;
		 else
			pos--;
	  }
	  System.out.println("position = "+pos);
	  System.out.println("max position = "+maxPos);
   }
}
