public	class	ForOutputProblems	{
   public	static	void	main(String[]	args)	{
      for	(int	i	=	1;	i	<=	10;	i	+=	2)	{
         System.out.print(i	+	" ");
         }
      System.out.println();
      System.out.println();
   					
      for	(int	i	=	1;	i	<	20;	i +=	3	*	i	- 1)
         System.out.print(i	+	" * ");
      System.out.println();
      System.out.println();
   					
      for	(int	i	=	1;	i	<	4;	i++)	{
         for	(int	j	=	3;	j	>=	1;	j--)	{
            System.out.print(i	+	" "	+	j	+	"   ");
            }
         System.out.println();
         }
      System.out.println();
   					
      for	(int	i	=	4;	i	<	6;	i++)	{
         for	(int	j	=	0;	j	<	4;	j	+=	i	/	2	+	1)	{
            System.out.print(i	+	" "	+	j	+	"   ");
            }
         System.out.println();
         }
      System.out.println();
   					
      for	(int	i	=	1;	i	<	3;	i++)	{
         for	(int	j	=	3;	j	>=	1;	j--)	{
            for	(int	k	=	0;	k	<	2;	k++)	{
               System.out.print(i	+	" "	+	j	+	" "	+	k	+	"   ");
               }
            System.out.println();
            }
         System.out.println();
         }
      }
   }