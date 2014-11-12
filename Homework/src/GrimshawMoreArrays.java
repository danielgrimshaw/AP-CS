/*
 * 1.	What	is	the	output	of	the	following	program?
 * public	class	ReferenceMystery {
 *    public static	void	main(String[]	args) {
 *       int	x	=	1;
 *       int[]	a	=	new	int[2];
 *       mystery(x,	a);
 *       System.out.println(x	+	“	“	+	Arrays.toString(a));
 *       x--;
 *       a[1]	=	a.length;
 *       mystery(x,	a);
 *       System.out.println(x	+	“	“	+	Arrays.toString(a));
 *    }
 *    public	static	void	mystery(int	x,	int[]	list) {
 *       list[x]++;
 *       x++
 *       System.out.println(x	+	“	“	+	Arrays.toString(list));
 *    }
 * }
 * Output:
 * _2 [0,1]____________________________________
 * _1 [0,1]____________________________________
 * _1 [1,2]____________________________________
 * _0 [1,2]____________________________________
 * Note: Complete	the problems in	one	program	file	named	LastnameMoreArrays.java	and	call	any	
 * requested	method	from	the main	method.	
 * Note: For	each	problem	in	your	program,	add	a	comment	at	the	beginning	stating	the	number	of	the	
 * problem.
 *
 * 3. Write	a	method	called	isSorted	that	accepts	an	array	of	real	numbers	as	a	parameter	and	returns	true	
 * if	the	list	is	in	sorted	(nondecreasing)	order	and	false	otherwise.	For	example,	if	arrays	named	list1	
 * and	list2	store	{16.1,	12.3,	22.2,	14.4}	and	{1.5,	4.3,	7.0,	19.5,	25.1,	46.2}	respectively,	the	calls	
 * isSorted(list1)	and	isSorted(list2)	should	return	false	and	true	respectively.	Assume	that	the	array	has	
 * at	least	one	element.	A	one-element	array	is	considered	sorted.	From	main,	print	the	array	contents	
 * and	print	whether	the	array	is	sorted.
 *
 * 4. Write	a	method	called	isUnique	that	accepts	an	array	of	integers	as	a	parameter	and	returns	a	boolean
 * value	indicating	whether	or	not	the	values	in	the	array	are	unique	(true	for	yes,	false	for	no).	The	
 * values	in	the	list	are	considered	unique	if	there	is	no	pair	of	values	that	are	equal.	For	example,	if	
 * passed	an	array	containing	[3,	8,	12,	2,	9,	17,	43, -8,	46],	your	method	should	return	true,	but	if	passed	
 * [4,	7,	3,	9,	12,	-47,	3,	74],	your	method	should	return	false	because	the	value	3	appears	true.
 * 5. Write	a	method	of	your	choosing	which	uses	at	least	one	array.	Within	the	method	also	use	at	least	
 * one	of	the	following	structures:	if	/	else,	for,	for-each,	while.	Provide	a	comment	stating	what	your	
 * method	does.
 */
 
import java.util.*;

public class GrimshawMoreArrays {
   public static void main(String[] args) {
      String [] strs = {"belt",	"hat",	"jelly",	"bubble	gum"};
      double avgLength = avgLength(strs);
      System.out.println(avgLength);
      
      String [] palindrome = {"alpha",	"beta",	"gamma",	"delta",	"gamma",	"beta",	"alpha"};
      if (isPalindrome(palindrome))
         System.out.println(Arrays.toString(palindrome) + " is a palindrome");
         
      if isSorted({16.1,	12.3,	22.2,	14.4})
         System.out.println(Arrays.toString({16.1,	12.3,	22.2,	14.4})
   }
   
   public static double avgLength(String [] strings) {
      int elements = strings.length;
      int totalLength = 0;
      for (String s : strings)
         totalLength += s.length();
      return (double)totalLength/elements;
   }
   
   public static boolean isPalindrome(String [] strings) {
      for (int i = 0; i < strings.length; i++)
         if (!(strings[i].equals(strings[strings.length-1-i])))
            return false;
      return true;
   }
   
   public static boolean isSorted(double [] doubles) {
      if (doubles.length == 1) return true;
      for (int i = 1; i < doubles.length; i++)
         if (doubles[i-1] > doubles[i]) return false;
      return true;
}