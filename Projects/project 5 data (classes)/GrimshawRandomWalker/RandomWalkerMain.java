import java.awt.*;   // for Point

public class RandomWalkerMain
{
   public static void main(String[] args)
   { 
      DrawingPanel p = new DrawingPanel(1000, 800);
      p.setBackground(Color.BLACK);
      Graphics g = p.getGraphics();
      g.setColor(Color.RED);
      g.drawString("Random Walker", 500, 50);
      RandomWalker henry = new RandomWalker(500, 400);
      for (int i = 0; i < 150; i++)//150000
      {
         henry.move();
         int x = henry.getX();
         int y = henry.getY();
         g.fillRect(x,y,1,1);
         p.sleep(1);
      }
      System.out.println("Total Steps = " + henry.getSteps() + ".");
      System.out.println(henry);
   }
}