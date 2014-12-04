public class Rectangle {
   private int x,y; //deprecated
   private int width, height;
   
   //the following are additional
   private Point topRight, topLeft, bottomLeft, bottomRight;
   private Line top, bottom, left, right;
   
   //class constants
   private static int defaultX = 0, defaultY = 0, defaultWidth = 10, defaultHeight = 10;
   
   //constructors
   public Rectangle() {
      this(defaultX, defaultY, defaultWidth, defaultHeight);
   }
   
   public Rectangle(int x) {
      //this actually makes a square
      this(x, defaultY, defaultWidth, defaultHeight);
   }
   
   public Rectangle(int x, int y) {
      this(x, y, defaultWidth, defaultHeight);
   }
   
   public Rectangle(int x, int y, int sides) {
      this(x, y, sides, sides);
   }
   
   public Rectangle(int x, int y, int width, int height) {
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
   
   public Rectangle(Point bottomLeft, int sides) {
      this(bottomLeft.toArray()[0], bottomLeft.toArray()[1], sides, sides);
   }
   
   public Rectangle(Point bottomLeft, Point topRight) {
      this.x = bottomLeft.getX();
      this.y = bottomLeft.getY();
      this.width = topRight.getX();
      this.height = topRight.getY();
      
      this.topRight = new Point(topRight);
      this.topLeft = new Point(bottomLeft.getX(), topRight.getY());
      this.bottomLeft = new Point(bottomLeft);
      this.bottomRight = new Point(topRight.getX(), bottomLeft.getY());
      
      this.top = new Line(this.topLeft, this.topRight);
      this.bottom = new Line(this.bottomLeft, this.bottomRight);
      this.left = new Line(this.bottomLeft, this.topLeft);
      this.right = new Line(this.bottomRight, this.topRight);
   }
   
   public Rectangle(Line bottom, int height) {
      this(bottom.getP1().getX(), bottom.getP1().getY(), bottom.getP2().getX(), bottom.getP1().getY()+height);
   }
   
   public int getHeight() {
      if (this.height != this.topRight.getY() || this.height != this.top.getP1().getY())
         throw new Exception("Error! Rectangle has multiple heights!");
      return this.height;
   }
   
   
}