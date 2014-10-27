/*
1 3 5 7 9 
1 * 3 * 11 * 
1 3   1 2   1 1   
2 3   2 2   2 1   
3 3   3 2   3 1   

4 0   4 3   
5 0   5 3   

1 3 0   1 3 1   
1 2 0   1 2 1   
1 1 0   1 1 1   

2 3 0   2 3 1   
2 2 0   2 2 1   
2 1 0   2 1 1 


public class Loops {
   public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

i        j        output
1        1        ' '
1        2        ' '
1        3        ' '
1        4        
1        1        '*'
1        2
2        1        ' '
2        2        ' '
2        3        
2        1        '*'
2        2        '*'
2        3        '*'
3        1        ' '
3        2        
3        1        '*'
3        2        '*'
3        3        '*'
3        4        '*'
3        5        '*'



15*(i-1)+4
-10*(4-i)
-4*i-3
100-3*i

*/
public class GrimshawForLoopsPractice {
   public static void main(String[] args) {
      int sum = 0, i;
      for (i = 1; i <= 6; i++) {
         System.out.println(sum+i);
         sum += i;
      }
   }
}
