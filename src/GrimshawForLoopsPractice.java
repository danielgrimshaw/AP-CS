/*
1)
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

2)
i        j        output
------------------------
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


3)
15*(i-1)+4
-10*(4-i)
-4*i-3
100-3*i

*/
public final class GrimshawForLoopsPractice {
   public static void main(String[] args) {
      int sum = 0;
      byte i;
      for (i = 1; i < 6; i++)
         sum += i;
         
      System.out.println(sum+i);
      System.out.println("\n");
      
      double knowledge = 0;
      for (i = 1; i <= 20; i++)
         knowledge += (100-knowledge)/10;
      System.out.println(knowledge);
      System.out.println("\n");
      
      int first = 1, second = 1;
      sum = 0;
      System.out.print(first+" "+second+" ");
      for (i = 1; i < 11; i++) {
         sum = first+second;
         first = second;
         second = sum;
         System.out.print(sum+" ");
      }
      System.out.println("\n");
      
      for (i = 0; i < 3; i++) {
         for (byte j = 0; j < 5; j++)
            System.out.print("*");
         System.out.println();
      }
      
      System.out.println("\n");
      
      for (i = 1; i <= 7; i++) {
    	    for (int j = 1; j <= i; j++)
              System.out.print(i);
          System.out.println();
      }
   }
}
