// Exam 3 Question 4

import java.util.ArrayList;

public class FloorPlan
{
  /** The number of rows in this floor plan */
  private final int ROWS;

  /** The number of columns in this floor plan */
  private final int COLS;

  /** room[r][c] == 0 means the cell at location (r, c)
   *  is empty and available for placing furniture;
   *  room[r][c] == 1 means the location is not available
   */
  private int[][] room;

  /********************** Extra **********************/

  /** Constructs a two-dimensional array with given
   *  dimensions, filled with zeroes
   */
  public FloorPlan(int rows, int cols)
  {
      ROWS = rows;
      COLS = cols;
      room = new int[rows][cols];
  }

  /********************** Part (a) **********************/

  /** Returns true if the rectangular region between top and
   *  bottom and between left and right, including the borders,
   *  contains only zeroes; otherwise returns false.
   *  Precondition: top <= bottom, left <= right;
   *                the entire region is within room limits
   */
  private boolean isEmptyRegion(int top, int bottom, int left, int right)
  {
	for (int i = top; i <= bottom; i++)
		for (int j = left; j <= right; j++)
			if (room[i][j] != 0)
				return false;
	return true;
  }

  /********************** Part (b) **********************/

  /** Returns true if a piece of furniture with given dimensions
   *  fits into this floor plan at a specified location.
   *  To fit, all the cells under the piece  must be within the
   *  room and all the cells within a slightly larger region
   *  must be empty. The larger region consists of all the cells
   *  under the piece plus all the adjacent cells that are
   *  within the room limits.
   *  @param width the horizontal dimension of the piece
   *  @param height the vertical dimension of the piece
   *  @param ulCorner location of the upper left corner of
   *         the piece
   */
  public boolean fits(int width, int height, Location ulCorner)
  {
	int top = ulCorner.getRow() - 1;
	int bottom = ulCorner.getRow() + height + 1;
	int left = ulCorner.getCol() - 1;
	int right = ulCorner.getCol() + width + 1;
	if (top < 0)
		top = 0;
	if (bottom > ROWS -1)
		bottom  = ROWS - 1;
	if (left < 0)
		left = 0;
	if (right > COLS -1)
		right = COLS -1;
	return isEmptyRegion(top, bottom, left, right);	
  }

  /********************** Part (c) **********************/
  
  /** Returns a list of all locations where a piece of furniture
   *  with given dimensions can fit.
   *  @param width the horizontal dimension of the piece
   *  @param height the vertical dimension of the piece
   */
  public ArrayList<Location> whereFits(int width, int height)
  {
    ArrayList<Location> fits = new ArrayList<>();
    for (int i = 0; i < ROWS; i++)
		for (int j = 0; j < COLS; j++)
			if (this.fits(width, height, new Location(i, j)))
				fits.add(new Location(i, j);
	return fits;
  }

  /********************** Test **********************/

  public static void main(String[] args)
  {
    /*
        0xx000000
        000000000
        00000000x
        00000000x
        00000000x
        00000000x
        000000000
        00000xxx0
    */

    FloorPlan plan = new FloorPlan(8, 9);
    plan.room[0][1] = 1;
    plan.room[0][2] = 1;
    plan.room[0][6] = 1;
    plan.room[2][8] = 1;
    plan.room[3][8] = 1;
    plan.room[4][8] = 1;
    plan.room[5][8] = 1;
    plan.room[7][5] = 1;
    plan.room[7][6] = 1;
    plan.room[7][7] = 1;

    System.out.println(plan.whereFits(4, 2));
    System.out.println(plan.whereFits2(4, 2));
  }
}
