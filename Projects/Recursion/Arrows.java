import java.awt.*; 
import java.util.*; 

public class Arrows { 
   public static final int SIZE = 243; 
   public static void main(String[] args) { 
     // prompt for level 
      Scanner console = new Scanner(System.in); 
      System.out.print("What level do you want? "); 
      int level = console.nextInt(); 
     // initialize drawing panel 
      DrawingPanel p = new DrawingPanel(SIZE, SIZE); 
      Graphics g = p.getGraphics(); 
      drawFigure(g, level, 0, 0, SIZE); 
   } 
   
   public static void drawFigure(Graphics g, int level, int x, int y, int size) {
      if (level > 0) {
         for (int i = 1; i <= Math.pow(3, level-1); i++)
            for (int j = 1; j <= Math.pow(3, level-1); j++) {
               int center = (int)(size/Math.pow(3, level));
               int rectSize = (int)(size/Math.pow(3, level));
               int xPos = (int)(x+(center*j*level));
               int yPos = (int)(y+(i*center*level));
               g.fillRect(xPos, yPos, rectSize, rectSize);
            }
         drawFigure(g, level-1, x, y, size);
      }               
   }
}