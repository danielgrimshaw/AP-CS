// Exam 3 Question 4

public class Location
{
   private int row, col;
   private int direction;
   
   public Location(int r, int c)
   {
      row = r;
      col = c;
   }

   public Location(int r, int c, int dir)
   {
      row = r;
      col = c;
      direction = dir;
   }

   public int getRow()
   {
      return row;
   }

   public int getCol()
   {
      return col;
   }

   public int getDirection()
   {
      return direction;
   }

   public String toString()
   {
      return "(" + row + ", " + col + " | " + direction + ")";
   }
}
