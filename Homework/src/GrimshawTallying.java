/*
 * Name:	___________________________
 * AP	Computer	Science	A	(Java)
 * Array Tallying	and	More	Practice	Problems
 * Complete	3 more	problems	selected	from	3	through	6	for	a	total	of	4
 * problems.
 * Note: Complete the	problems in	one	program	file	named	LastnameTallying.java	and	call	any	
 * requested	method	from	the main	method.	
 * Note: For	each	problem	in	your	program,	add	a	comment	at	the	beginning	stating	the	number	of	
 * the	problem.
 * 
 * 4. Write	a	method	called	range	that	returns	the	range	of	values	in	an	array	of	integers.	The	range	is	
 * defined	as	1	more	than	the	difference	between	the	maximum	and	minimum	values	in	the	array.	
 * For	example,	if	an	array	called	list	contains	the	values	[36,	12,	25,	19,	46,	31,	22],	the	call	of	
 * range(list)	should	return	35	(46	– 12	+	1).	You	may	assume	that	the	array	has	at	least	one	element.
 * From	main,	print	the	array	contents	and	the	range.
 * 5. Write	a	method	called	stdev	that	returns	the	standard	deviation	of	an	array	of	integers.	Standard	
 * deviation	is	computed	by	taking	the	square	root	of	the	sum	of	the	squares	of	the	differences	
 * between	each	element	and	the	mean,	divided	by	one	less	than	the	number	of	elements.	More	
 * concisely	and	mathematically,	the	standard	deviation	of	an	array	a	is	written	as	follows:
 * stdev(a)	=	square	root	(sum	from	i=	0	to	i	=	a.length -1	of	the	squares	of	(a[i]	– average	of	(a))	/	
 * (a.length	– 1))
 * For	example,	if	the	array	passed	contains	the	values	{1,	-2,	4,	-4,	9,	-6,	16,	-8,	25,	-10},	your	method	
 * should	return	approximately	11.237. From	main,	print	the	array	contents	and	the	standard	
 * deviation.
 * 6. Write	a	method	called	priceIsRight	that	mimics	the	guessing	rules	from	the	game	show	‘The	Price	
 * is	Right’.	The	method	accepts as	parameters	an	array	of	integers	representing the	contestants’	bids	and	an	integer	representing	a	correct	price.	The	method	returns	the	element	in	the	bids	array	that	
 * is	closest	in	value	to	the	correct	price	without	being	larger	than	that	price.	For	example,	if	an	array	
 * called	bids	stores	the	values	{200,	300,	250,	1,	950,	40},	the	call	of	priceIsRight(bids,	280)	should	
 * return	250,	since	250	is	the	bid	closest	to	280	without going	over	280.	If	all	bids	are	larger	than	
 * the	correct	price,	your	method	should	return	-1. From	main,	print	the	array	contents,	correct	price	
 * and	closest	bid.
 */
 
import java.util.Arrays;

public class GrimshawTallying {
   public static void main(String[] args) {
      int [] problem1 = {27, 15, 15, 11, 27};
      System.out.println("The mode of "+Arrays.toString(problem1)+" is "+mode(problem1)+".\n");
      
      int [] problem3 = {74, 85, 102, 99, 101, 85, 56};
      System.out.println("Before: "+Arrays.toString(problem3));
      System.out.println("The last index of value 85 in "+Arrays.toString(problem3)+" is "+lastIndexOf(problem3, 85));
      
      int [] problem4 = {36, 12, 25, 19, 46, 31, 22};
      System.out.println("\nThe range of "+Arrays.toString(problem4)+" is "+range(problem4));
   }
   
   public static int mode(int [] nums) {
      int [][] numbers = new int [nums.length][2];
      int next = 0;
      boolean found = false;
      for (int i : nums) {
         for (int [] j : numbers){
            if (j[0] == i){
               j[1]++;
               found = true;
            }
         }
         if (!found) {
            numbers[next][0] = i;
            numbers[next][1] = 1;
            next++;
         }
      }
      int max = 0;
      int maxCount = 0;
      for (int [] i : numbers){
         if (i[1] > maxCount){
            max = i[0];
            maxCount = i[1];
         } else if (i[1] == maxCount) {
            if (i[0] < max)
               max = i[0];
         }
      }
      return max;
   }
   
   public static int lastIndexOf(int [] arr, int num) {
      int index = -1;
      for (int i = 0; i < arr.length; i++)
         if (arr[i] == num) index = i;
      return index;
   }
}