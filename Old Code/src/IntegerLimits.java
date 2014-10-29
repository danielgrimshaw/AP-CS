public class IntegerLimits {
   public static void disp(Object o) {
      System.out.println(o);
   }
   
   public static void disp() {
      System.out.println();
   }
   
   public static void main(String[] args) {
      int x = 5000;
      int y = Integer.MAX_VALUE;
      int z = Integer.MIN_VALUE;
      double a = 5.55;
      double b = 10.5;
      double c = a+b;
      disp("x= " + x + "\ty= "+y+"\tz= "+z);
      disp("a= " + a + "\tb= "+b+"\tc= "+c);
   }
}