// Draws the Sierpinski Carpet fractal image. 
import java.awt.*; 
import java.util.*; 
public class SCarpet { 
   public static final int SIZE = 1080; //243
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
   // Draws a Sierpinski carpet to the given level inside the given area. 
   public static void drawFigure(Graphics g, int level, int x, int y, int size) {
      
      if (level > 0) {
         for (int i = 1; i <= Math.pow(3, level-1); i++)
            for (int j = 1; j <= Math.pow(3, level-1); j++) {
               double pixel = size/Math.pow(3, level);
               int xPos = (int)(Math.round(pixel*(j-1)*3 + pixel));
               int yPos = (int)(Math.round(pixel*(i-1)*3 + pixel));
               g.fillRect(xPos, yPos, (int)pixel, (int)pixel);
            }
         drawFigure(g, level-1, x, y, size);
      }
   }
}
