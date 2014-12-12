import java.awt.*;   // for Point

public class RandomWalkerMain
{
   public static void main(String[] args)
   { 
      DrawingPanel p = new DrawingPanel(1000, 800);
      p.setBackground(Color.BLACK);
      Graphics g = p.getGraphics();
      g.setColor(Color.MAGENTA);
      g.drawString("Random Walker", 500, 50);
      RandomWalker henry = new RandomWalker(500, 400);
      for (int i = 0; i < 5000000; i++)
      {
         henry.move();
         int x = henry.getX();
         int y = henry.getY();
         g.fill3DRect(x,y,100,100, (int)(Math.random()*2) == 0 ? true : false);
         p.sleep(0);
         if (henry.getSteps() % 10 == 0)
            g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
      }
      System.out.println("Total Steps = " + henry.getSteps() + ".");
      System.out.println(henry);
   }
}