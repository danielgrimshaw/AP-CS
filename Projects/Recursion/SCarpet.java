// Draws the Sierpinski Carpet fractal image.
import java.awt.*;
import java.util.*;

public class SCarpet {
   public static final int SIZE = 243*9; //243
   public static final int pixelSize = 7; // SIZE is of the form 3^n, pixelSize is n

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
         if (level <= pixelSize) {
            double pixel = size/Math.pow(3, level);
            for (int i = 0; i < Math.pow(3, level-1); i++)
               for (int j = 0; j < Math.pow(3, level-1); j++) {
                  int xPos = (int)(Math.round(pixel*(j)*3 + pixel))+x;
                  int yPos = (int)(Math.round(pixel*(i)*3 + pixel))+y;
                  g.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
                  g.fillRect(xPos, yPos, (int)(Math.round(pixel)), (int)(Math.round(pixel)));
               }
         }
         drawFigure(g, level-1, x, y, size);
      }
   }
}
