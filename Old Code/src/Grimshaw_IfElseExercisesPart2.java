public class Grimshaw_IfElseExercisesPart2 {
   public static String repl(String str, int reps) {
      String ans = new String();
      if ((reps <= 0)|| (str.equals("")))
         return ans;
      for (int i = 1; i <= reps; i++)
         ans += str;
      return ans;
   }
   
   public static void printTriangleType(int x, int y, int z) {
      if (x >= y) {
         if (x >= z) {
            if (x > y+z){
               throw new IllegalArgumentException();
            }
         }
      } else if (y >= z) {
         if (y > x+z) {
            throw new IllegalArgumentException();
         }
      } else {
         if (z > x+y) {
            throw new IllegalArgumentException();
         }
      }
      
      if (x == y && y == z) {
         System.out.println("equalateral");
         return;
      }
      else if ((x == y ^ x == z) ^ y == z) {
         System.out.println("isosceles");
         return;
      }
      else {
         System.out.println("scalene");
         return;
      }
   }
   
   public static String season(int month, int day) {
      if (month < 3 ) {
         return "winter";
      }else if (month == 3) {
         if (day < 16) {
            return "winter";
         }
         else {
            return "spring";
         }
      }else if (month < 6) {
         return "spring";
      }else if (month == 6) {
         if (day < 16) {
            return "spring";
         }
         else {
            return "summer";
         }
      }else if (month < 9){
         return "summer";
      }else if (month == 9) {
         if (day < 16) {
            return "summer";
         }
         else {
            return "fall";
         }
      }else if ((month < 12) ^ (day < 16)) {
         return "fall";
      }else {
         return "winter";
      }
   }
   
   public static String swapPairs(String str) {
      String ans = new String();
      if (str.length()%2==0) {
         for (int i = 0; i < str.length()-1; i += 2) {
            String tmp = new String();
            tmp = str.substring(i, i+2);
            ans += tmp.substring(1);
            ans += tmp.substring(0,1);
         }
      } else {
         for (int i = 0; i < str.length()-2; i += 2) {
            String tmp = new String();
            tmp = str.substring(i, i+2);
            ans += tmp.substring(1);
            ans += tmp.substring(0,1);
         }
         ans += str.substring(str.length()-1);
      }
      return ans;
   }
         
   public static void main(String[] args) {
      int errCode = 0;
      try {
         System.out.println(repl("hello", 3));
         printTriangleType(5, 7, 7);
         printTriangleType(6, 6, 6);
         printTriangleType(5, 7, 8);
         //printTriangleType(2, 18, 2);
         System.out.println(season(3,15));
         System.out.println(swapPairs("hello there"));
         System.out.println(swapPairs("example"));
      } catch (IllegalArgumentException e) {
         e.printStackTrace();
         System.err.println(e);
         errCode = -1;
      } catch (Exception e) {
         e.printStackTrace();
         System.err.println(e);
         errCode = -2;
      } finally {
         if (errCode != 0) System.err.println("abort.");
         System.exit(errCode);
      }
   }
}

      