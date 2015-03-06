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
//(n,xa,xb,ya,yb)
         double xa, xb, xc, xd, xe, ya, yb, yc, yd, ye, beta, gamma, delta, length
/*
                         E
                         /\
                        /  \
                       /    \
                A_____/      \_____B
                      C       D
*/
                length = Math.sqrt((xa-xb)**2+(ya-yb)**2)
                xc = xa+(xb-xa)/3
                yc = ya+(yb-ya)/3
                xd = xa+2*(xb-xa)/3
                yd = ya+2*(yb-ya)/3
                gamma = -xc+(yd**2+xd**2-xc**2-yc**2)/(2*(xd-xc))
                beta = (yd-yc)/(xd-xc)
                delta = (gamma*beta+yc)**2-(yc**2+gamma**2-(length/3)**2)*(beta**2+1)

                if (xb.gt.xa)
                   ye = ((gamma*beta+yc)+Math.sqrt(delta))/(beta**2+1)
                else
                   ye = ((gamma*beta+yc)-Math.sqrt(delta))/(beta**2+1)

                xe = (gamma+xc)-beta*ye
                if (n.eq.0)
                        write (1,*) xa
                        write (1,*) xb
                        write (2,*) ya
                        write (2,*) yb
                else
                        call flocon(n-1,xa,xc,ya,yc)
                        call flocon(n-1,xc,xe,yc,ye)
                        call flocon(n-1,xe,xd,ye,yd)
                        call flocon(n-1,xd,xb,yd,yb)
      }
   }