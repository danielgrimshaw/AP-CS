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
 * ____________________________________________
 * ____________________________________________
 * ____________________________________________
 * ____________________________________________
 * Note: Complete	the problems in	one	program	file	named	LastnameMoreArrays.java	and	call	any	
 * requested	method	from	the main	method.	
 * Note: For	each	problem	in	your	program,	add	a	comment	at	the	beginning	stating	the	number	of	the	
 * problem.
 * 1. Write	a	piece	of	code	that	computes	the	average	String	length	of	the	elements	of	an	array	of	Strings.	
 * For	example,	if	the	array	contains	{“belt”,	“hat”,	“jelly”,	“bubble	gum”},	the	average	length	is	5.5. Print	
 * the	array	contents and	average	length	from	main.
 * 2. Write	a	method that	accepts	an	array	of	Strings	as	its	parameter	and	indicates	whether	that	array	is	a	
 * palindrome	– that	is,	whether	it	reads	the	same	forwards	as	backwards.	For	example,	the	array	
 * {“alpha”,	“beta”,	“gamma”,	“delta”,	“gamma”,	“beta”,	“alpha”}	is	a	palindrome. Print	the	array	contents	
 * from main	and	print	whether	it	is	a	palindrome.
 * 3. Write	a	method	called	isSorted	that	accepts	an	array	of	real	numbers	as	a	parameter	and	returns	true	
 * if	the	list	is	in	sorted	(nondecreasing)	order	and	false	otherwise.	For	example,	if	arrays	named	list1	
 * and	list2	store	{16.1,	12.3,	22.2,	14.4}	and	{1.5,	4.3,	7.0,	19.5,	25.1,	46.2}	respectively,	the	calls	
 * isSorted(list1)	and	isSorted(list2)	should	return	false	and	true	respectively.	Assume	that	the	array	has	
 * at	least	one	element.	A	one-element	array	is	considered	sorted.	From	main,	print	the	array	contents	
 * and	print	whether	the	array	is	sorted.4. Write	a	method	called	isUnique	that	accepts	an	array	of	integers	as	a	parameter	and	returns	a	boolean
 * value	indicating	whether	or	not	the	values	in	the	array	are	unique	(true	for	yes,	false	for	no).	The	
 * values	in	the	list	are	considered	unique	if	there	is	no	pair	of	values	that	are	equal.	For	example,	if	
 * passed	an	array	containing	[3,	8,	12,	2,	9,	17,	43, -8,	46],	your	method	should	return	true,	but	if	passed	
 * [4,	7,	3,	9,	12,	-47,	3,	74],	your	method	should	return	false	because	the	value	3	appears	true.
 * 5. Write	a	method	of	your	choosing	which	uses	at	least	one	array.	Within	the	method	also	use	at	least	
 * one	of	the	following	structures:	if	/	else,	for,	for-each,	while.	Provide	a	comment	stating	what	your	
 * method	does.
 */

public class GrimshawMoreArrays {

}