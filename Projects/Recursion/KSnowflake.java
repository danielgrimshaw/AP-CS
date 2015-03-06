// This program draws the Koch snowflake fractal.

import java.awt.*;
import java.util.*;

public class KSnowflake {
   public static final int SIZE = 256;
   public static final double m = Math.sqrt(3.0) / 6.0;

   public static void main(String[] args) {
     // prompt for level
      Scanner console = new Scanner(System.in);
      System.out.print("What level do you want? ");
      int level = console.nextInt();
   
     // initialize drawing panel
      int deltaY = (int) Math.round(SIZE * Math.sqrt(3.0) / 2.0);
      int height = (int) (deltaY + m * SIZE);
      DrawingPanel p = new DrawingPanel(SIZE, height);
      p.setBackground(Color.CYAN);
      Graphics g = p.getGraphics();
   
      Point p1 = new Point(0, deltaY);
      Point p2 = new Point(SIZE / 2, 0);
      Point p3 = new Point(SIZE, deltaY);
      drawEdge(level, g, p1, p2);
      drawEdge(level, g, p2, p3);
      drawEdge(level, g, p3, p1);
   }

	// drawEdge recursive method
   public static void drawEdge(int level, Graphics g, Point p1, Point p2) {
   }
}