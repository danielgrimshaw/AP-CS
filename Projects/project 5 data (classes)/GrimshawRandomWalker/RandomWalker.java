public class RandomWalker {
   private int x, y, steps;
   private Point location;
   
   //constructors
   public RandomWalker(){
      this(0,0);
   }
   
   public RandomWalker(int x) {
      this(x, 0);
   }
   
   public RandomWalker(int x, int y) {
      setPos(x,y);
   }
   
   public RandomWalker(Point p) {
      setPos(p);
   }
   
   //getters
   public int getX() {
      return this.x;
   }
   
   public int getY() {
      return this.y;
   }
   
   public Point getPos() {
      return new Point(this.location);
   }
   
   public int getSteps() {
      return this.steps;
   };
   
   //setters
   public void setPos(int x, int y) {
      this.x = x;
      this.y = y;
      this.location = new Point(x, y);
   }
   
   public void setPos(Point p) {
      this.x = p.getX();
      this.y = p.getY();
      this.location = new Point(p);
   }
   
   public void move() {
      double direction = Math.random()*4;
      
      if (direction < 1)
         moveUp();
      else if (direction < 2)
         moveLeft();
      else if (direction < 3)
         moveRight();
      else
         moveDown();
      this.steps++;
   }
   
   private void moveUp() {
      setPos(this.getX(), this.getY()+1);
   }
   
   private void moveDown() {
      setPos(this.getX(), this.getY()-1);
   }
   
   private void moveLeft() {
      setPos(this.getX()-1, this.getY());
   }
   
   private void moveRight() {
      setPos(this.getX()+1, this.getY());
   }
   
   public String toString() {
      return "RandomWalker(at:"+this.location.toString()+" steps:"+this.getSteps();
   }
}