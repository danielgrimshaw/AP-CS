/*
 * AP	Computer	Science	A	(Java)
 * 2-Dimensional	Arrays
 * Note: Complete	the problems	in	one	program	file	named	LastnameArray2D.java	and	call	any	requested	method	
 * from	the	main	method.	
 * Note: For	each	problem	in	your	program,	add	a	println	statement at	the	beginning	stating	the	number	of	the	
 * problem.
 *
 * 2. Write	a	piece	of	code	that	constructs	a	two-dimensional	array	of	integers	called	grid	with	4	rows	and	6	
 * columns.	Write	a	loop	to	set	the	values	in the	second	row (index	position	1) to	integers	starting	with	2	at	index	
 * position	0	and	incrementing	by	3	for	each	element	in	the	row.		Specifically,	the	second	row	would	contain	
 * values	2,	5,	8,	11,	14,	17.	Print	the	resulting	array	with	a	tab	after	each	value	using	a	nested	for	each	loop.	You	
 * may	write	this	code	in	your	main	method. See	sample	output	below.
 * Problem 2
 * [0 0 0 0 0 0 ]
 * [2 5 8 11 14 17 ]
 * [0 0 0 0 0 0 ]
 * [0 0 0 0 0 0 ]
 *
 * 3. Write	a	method	called	matrixAdd	that	accepts	a	pair of	two-dimensional	arrays	of	integers as	parameters,	
 * treats	the	arrays	as	two-dimensional	matrixes,	and	returns	a	new	array	with	their	sum.	The	sum	of	two	
 * matrixes	A	and	B	is	a	matrix	C,	where	for	every	row	i,	and	column	j,	Cij,	=	Aij +	Bij.	You	may	assume	that	the	
 * arrays	passed	as	parameters	have	the	same	dimensions.	From	main,	print	the	two	arrays	prior	to	the	method	
 * call	and	the	new	array	after	the	method	call. See	sample	output	below.
 * Problem 3
 * [[1, 2], [3, 4]]
 * [[5, 6], [7, 8]]
 * [[6, 8], [10, 12]]
 * 4. Write	a	piece	of	code	that	constructs a	two-dimensional	array	of	doubles	called	exp	with	10	rows	and	4
 * columns.	Fill the	array	with	exponential	values starting	with	11,	so	that	element [i][j]	contains	the	value	ij
 * .	Use	nested	for	loops	to	build	the	array.		Print	the	resulting	array as	shown	below	with	a	tab	between	each	value
 * using	a	nested	for	loop.	You	may	write	this	code	in	your	main	method.	The	array	would	contain:
 *  Problem 4
 * [1.0 1.0 1.0 1.0 ]
 * [2.0 4.0 8.0 16.0 ]
 * [3.0 9.0 27.0 81.0 ]
 * [4.0 16.0 64.0 256.0 ]
 * [5.0 25.0 125.0 625.0 ]
 * [6.0 36.0 216.0 1296.0 ]
 * [7.0 49.0 343.0 2401.0 ]
 * [8.0 64.0 512.0 4096.0 ]
 * [9.0 81.0 729.0 6561.0 ]
 * [10.0 100.0 1000.0 10000.0 ]
 * 5. Write	a	piece	of	code	that	constructs	and	prints	a	basic	tic-tac-toe	board	on	the	console	with	the	X’s	and	O’s	in	
 * the	positions	as	shown	below.	You	may	write	this	code	in	your	main	method.
 * a. Declare	and	initialize	a	2-dimensional	array	of	Strings	named	board	with	3	rows	and	3	columns	that	
 * contains	the	X’s	and	O’s	in	the	locations	as	noted	below.	
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
       for (int [] row : matrix){
          row[4] = row[1];
       }
       for (int [] i : matrix)
         System.out.println(Arrays.toString(i));
       System.out.println();
   } 
}