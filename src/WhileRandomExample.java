public class WhileRandomExample {
   public static void main(String[] args) {
      int die = 0;
      while (die != 5) {
         die = (int)(Math.random()*6 + 1);
         if (die == 5) {
            System.out.println(die);
            continue;
         }
         System.out.print(die + ", ");
      }
      System.out.println();
   }
}