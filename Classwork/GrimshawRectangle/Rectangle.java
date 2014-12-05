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
      if (this.height != this.topRight.getY() || this.height != this.top.getY1())
         throw new Exception("Error! Rectangle has multiple heights!");
      return this.topRight.getY();
   }
   
   public int getWidth() {
      if (this.width != this.topRight.getX() || this.width != this.top.getX1())
         throw new Exception("Error! Rectangle has multiple widths!");
      return this.topRight.getX();
   }
   
   
   public int getX() {
      //returns the x coordinate of the bottom left corner
      if (this.x != this.bottomLeft.getX() || this.x != this.bottom.getX1())
         throw new Exception("Error! Rectangle has multiple bottom left corner x positions!");
      return this.bottomLeft.getX();
   }
   
   public int getY() {
      //returns the y coordinate of the bottom left corner
      if (this.y != this.bottomLeft.getY() || this.y != this.bottom.getY1())
         throw new Exception("Error! Rectangle has multiple bottom left corner y positions!");
      return this.bottomLeft.getY();
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
      setPos(bottomLeft.getX(), bottomLeft.getY(), topRight.getX(), topRight.getY());
   }
   
   public void setPos(Line bottom, int height) {
      setPos(bottom.getX1(), bottom.getY1(), bottom.getX2(), height);
   }
   
   public void setPos(Line left, Line bottom) {
      setPos(bottom, left.getY2());
   }
   
   public void setPos(Point bottomLeft, Point topRight) {
      setPos(bottomLeft.getX(), bottomLeft.getY(), topRight.getX(), topRight.getY());
   }
   
   public void setPos(Line diagonal) {
      if (posSlopeDiagonal.getSlope() >= 0)
         throw new IlleagalArgumentException("Invallid slope!");
      Point [] points = posSlopeDiagonal.toArray();
      setPos(points[0], points[1]);
   }
   
   public String toString() {
      return "Rectangle[x="+this.getX()+", y="+this.getY()+", width="+this.getWidth()+", height="+this.getHeight()+"]";
}