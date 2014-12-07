public class Rectangle {
   private int x,y; //deprecated
   private int width, height;
   
   //the following are additional
   private Point topRight, topLeft, bottomLeft, bottomRight;
   private Line top, bottom, left, right;
   
   //class constants
   private final static int defaultX = 0, defaultY = 0, defaultWidth = 10, defaultHeight = 10;
   
   //constructors
   public Rectangle() {
      setPos(defaultX, defaultY, defaultWidth, defaultHeight);
   }
   
   public Rectangle(int x) {
      //this actually makes a square
      setPos(x, defaultY, defaultWidth, defaultHeight);
   }
   
   public Rectangle(int x, int y) {
      setPos(x, y, defaultWidth, defaultHeight);
   }
   
   public Rectangle(int x, int y, int sides) {
      setPos(x, y, sides, sides);
   }
   
   public Rectangle(int x, int y, int width, int height) {
      setPos(x, y, width, height);
   }
   
   public Rectangle(Point bottomLeft, int sides) {
      this(bottomLeft.getX(), bottomLeft.getY(), sides, sides);
   }
   
   public Rectangle(Point topLeft, int width, int height) {
      this(topLeft.getX(), topLeft.getY()-height, width, height);
   }
   
   public Rectangle(Point bottomLeft, Point topRight) {
      setPos(bottomLeft, topRight);
   }
   
   public Rectangle(Line bottom, int height) {
      setPos(bottom, height);
   }
   
   public Rectangle(Line posSlopeDiagonal) {
      setPos(posSlopeDiagonal);
   }
   
   //getters
   public int getHeight() {
      return this.height;
   }
   
   public int getWidth() {
      return this.width;
   }
   
   
   public int getX() {
      //returns the x coordinate of the bottom left corner
      return this.bottomLeft.getX();
   }
   
   public int getY() {
      //returns the y coordinate of the bottom left corner
      return this.bottomLeft.getY();
   }
   
   public Point getBottomLeft() {
      return this.bottomLeft;
   }
   
   public Point getBottomRight() {
      return this.bottomRight;
   }
   
   public Point getTopLeft() {
      return this.topLeft;
   }
   
   public Point getTopRight() {
      return this.topRight;
   }
   
   public Line getTop() {
      return this.top;
   }
   
   public Line getBottom() {
      return this.bottom;
   }
   
   public Line getLeft() {
      return this.left;
   }
      
   public Line getRight() {
      return this.right;
   }
   
   public boolean contains(int x, int y) {
      return (x > this.getX() && y < this.getHeight());
   }
   
   public boolean contains(Point p) {
      int [] point = p.toArray();
      return contains(point[0], point[1]);
   }
   
   public boolean contains(Rectangle rect) {
      for (Point point : rect.toArray())
         if (!this.contains(point))
            return false;
      return true;
   }
   
   public int area(Line posSlopeDiagonal) {
      return (posSlopeDiagonal.getX2()-posSlopeDiagonal.getX1())*(posSlopeDiagonal.getY2()-posSlopeDiagonal.getY1());
   }
   
   public int getArea() {
      Line posSlopeDiagonal = new Line(this.bottomLeft, this.topRight);
      return area(posSlopeDiagonal);
   }
   
   public Rectangle intersection(Rectangle rect) {
      if (this.contains(rect) || rect.contains(this))
         return new Rectangle(0,0,0,0);
      
      if (this.contains(rect.getBottomLeft())) {
         if (rect.contains(this.getTopRight()))
            return new Rectangle(rect.getBottomLeft(), this.getTopRight());
         else {
            if (this.contains(rect.getTopLeft()))
               return new Rectangle(rect.getBottomLeft(), this.right.intersect(rect.getTop())); 
            else
               return new Rectangle(rect.getBottomLeft(), this.top.intersect(rect.getRight()));
         }
      } 
      else if (this.contains(rect.getBottomRight())) {
         if (rect.contains(this.getTopLeft()))
            return new Rectangle(this.left.intersect(rect.getBottom()), this.top.intersect(rect.getRight()));
         else {
            if (this.contains(rect.getTopRight()))
               return new Rectangle(this.left.intersect(rect.getBottom()), rect.getTopRight()); 
         }
      } 
      else if (this.contains(rect.getTopRight())) {
         if (rect.contains(this.getBottomLeft()))
            return new Rectangle(this.getBottomLeft(), rect.getTopRight());
         else {
            if (this.contains(rect.getTopLeft()))
               return new Rectangle(this.bottom.intersect(rect.getLeft()), rect.getTopRight()); 
         }
      }
      if (rect.contains(this.getBottomRight()))
         return new Rectangle(this.bottom.intersect(rect.getLeft()), this.right.intersect(rect.getTop()));
      if (this.contains(rect.getBottomLeft()))
         return new Rectangle(rect.getBottomLeft(), this.right.intersect(rect.getTop())); 
      return new Rectangle();
   }

   //setters
   public void setX(int x) {
      //set the bottom left x
      setPos(x, this.getY(), this.getWidth(), this.getHeight());
   }
   
   public void setY(int y) {
      //sets the bottom left y
      setPos(this.getX(), y, this.getWidth(), this.getHeight());
   }
   
   public void setWidth(int width) {
      setPos(this.getX(), this.getY(), width, this.getHeight());
   }
   
   public void setHeight(int height) {
      setPos(this.getX(), this.getY(), this.getWidth(), height);
   }
   
   public void setPos(int x, int y, int width, int height) {
      this.x = x;
      this.y = y;
      this.width = width;
      this.height = height;
      
      this.topRight = new Point(x + width, y + height);
      this.topLeft = new Point(x, y + height);
      this.bottomLeft = new Point(x, y);
      this.bottomRight = new Point(x + width, y);
      
      this.top = new Line(this.topLeft, this.topRight);
      this.bottom = new Line(this.bottomLeft, this.bottomRight);
      this.left = new Line(this.bottomLeft, this.topLeft);
      this.right = new Line(this.bottomRight, this.topRight);
   }
   
   public void setPos(Point bottomLeft, Point topRight) {
      setPos(bottomLeft.getX(), bottomLeft.getY(), topRight.getX()-bottomLeft.getX(), topRight.getY()-bottomLeft.getY());
   }
   
   public void setPos(Line bottom, int height) {
      setPos(bottom.getX1(), bottom.getY1(), bottom.getX2()-bottom.getX1(), height);
   }
   
   public void setPos(Line left, Line bottom) {
      setPos(bottom, left.getY2()-bottom.getY1());
   }
   
   public void setPos(Line diagonal) {
      if (diagonal.getSlope() <= 0)
         throw new IllegalArgumentException("Invallid slope!");
      Point [] points = diagonal.toArray();
      setPos(points[0], points[1]);
   }
   
   //others
   public Point [] toArray() {
      Point [] points = new Point [4];
      points[0] = this.getTopLeft();
      points[1] = this.getTopRight();
      points[2] = this.getBottomRight();
      points[3] = this.getBottomLeft();
      return points;
   }
    
   public String toString() {
      return "Rectangle[x="+this.getX()+", y="+this.getY()+", width="+this.getWidth()+", height="+this.getHeight()+"]";
   }
}