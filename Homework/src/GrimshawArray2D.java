/*
 * AP	Computer	Science	A	(Java)
 * 2-Dimensional	Arrays
 * Note: Complete	the problems	in	one	program	file	named	LastnameArray2D.java	and	call	any	requested	method	
 * from	the	main	method.	
 * Note: For	each	problem	in	your	program,	add	a	println	statement at	the	beginning	stating	the	number	of	the	
 * problem.
 *
 * 5. Write	a	piece	of	code	that	constructs	and	prints	a	basic	tic-tac-toe	board	on	the	console	with	the	X's	and	O's	in	
 * the	positions	as	shown	below.	You	may	write	this	code	in	your	main	method.
 * a. Declare	and	initialize	a	2-dimensional	array	of	Strings	named	board	with	3	rows	and	3	columns	that	
 * contains	the	X's	and	O's	in	the	locations	as	noted	below.	
 * b. Print	the	2-dimensional	array	using	a	nested	for	loop	structure
 * c. Note	that	the	rows	of	dashes	(	- )	and	the	vertical	bar	characters	(	|	)	are	not	part	of	the	array,	but	
 * are	printed	as	part	of	the	print	statements.	
 * d. The	output	of	the	tic-tac-toe	board	is shown	below.	
 * Problem 5
 * -------------
 * | X | O | O |
 * -------------
 * | | X | |
 * -------------
 * | | | O |
 * -------------
 */

import java.util.Arrays;

public class GrimshawArray2D {
   public static void main(String[] args) {
      int [][] matrix = {{1, 2, 3, 4, 5, 6, 7, 8},
                         {1, 2, 3, 4, 5, 6, 7, 8},
                         {1, 2, 3, 4, 5, 6, 7, 8},
                         {1, 2, 3, 4, 5, 6, 7, 8},
                         {1, 2, 3, 4, 5, 6, 7, 8},
                         {1, 2, 3, 4, 5, 6, 7, 8}};
       for (int [] i : matrix)
         System.out.println(Arrays.toString(i));
       System.out.println();

       for (int [] row : matrix)
          row[4] = row[1];

       for (int [] i : matrix)
         System.out.println(Arrays.toString(i));
       System.out.println();

      int [][] problem2 = new int[4][6];
      for (int i = 0; i < problem2[1].length; i++)
         problem2[1][i] = 3*i+2;
      for (int [] i : problem2)
         System.out.println(Arrays.toString(i));
       System.out.println();

      int [][] matrix1 = {{1,2,3},
                          {4,5,6}};
      int [][] matrix2 = {{6,5,4},
                          {3,2,1}};
      int [][] ansMatrix = addMatrices(matrix1, matrix2);
      for (int i = 0; i < matrix1.length; i++)
         System.out.println(Arrays.toString(matrix1[i]) + "+" + Arrays.toString(matrix2[i]) + " = " + Arrays.toString(ansMatrix[i]));
       System.out.println();

      double [][] exp = new double [10][4];
      for (int i = 0; i < exp.length; i++)
         for (int j = 0; j < exp[i].length; j++)
            exp[i][j] = (double)Math.pow(i+1,j+1);
      for (double [] i : exp) {
         System.out.print("[");
         for (double j : i)
            System.out.print(j+"\t");
         System.out.println("]");
      }

      String [][] board = {{"X","O","O"},
                           {" ","X"," "},
                           {" "," ","O"}};
      System.out.println("------------");
      for (String [] row : board) {
         for (String i : row)
            System.out.print("| "+i+" ");
         System.out.println("|\n-------------");
      }
   }

   public static int [][] addMatrices(int [][] matrix1, int [][]matrix2) {
      int [][] ansMatrix = new int [matrix1.length][matrix1[0].length];
      for (int i = 0; i < ansMatrix.length; i++)
         for (int j = 0; j < ansMatrix[0].length; j++)
            ansMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
      return ansMatrix;
   }
}
