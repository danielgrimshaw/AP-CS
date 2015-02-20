import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
   ///////////////////// constructors //////////////////////////////////
   
   /**
    * Constructor that takes no arguments 
    */
   public Picture ()
   {
      /* not needed but use it to show students the implicit call to super()
       * child constructors always call a parent constructor 
       */
      super();  
   }
   
   /**
    * Constructor that takes a file name and creates the picture 
    * @param fileName the name of the file to create the picture from
    */
   public Picture(String fileName)
   {
      // let the parent class handle this fileName
      super(fileName);
   }
   
   /**
    * Constructor that takes the width and height
    * @param height the height of the desired picture
    * @param width the width of the desired picture
    */
   public Picture(int height, int width)
   {
      // let the parent class handle this width and height
      super(width,height);
   }
   
   /**
    * Constructor that takes a picture and creates a 
    * copy of that picture
    * @param copyPicture the picture to copy
    */
   public Picture(Picture copyPicture)
   {
      // let the parent class do the copy
      super(copyPicture);
   }
   
   /**
    * Constructor that takes a buffered image
    * @param image the buffered image to use
    */
   public Picture(BufferedImage image)
   {
      super(image);
   }
   
   ////////////////////// methods ///////////////////////////////////////
   
   /**
    * Method to return a string with information about this picture.
    * @return a string with information about the picture such as fileName,
    * height and width.
    */
   public String toString()
   {
      String output = "Picture, filename " + getFileName() + 
         " height " + getHeight() 
         + " width " + getWidth();
      return output;
      
   }
   
   /** Method to set the blue to 0 */
   public void zeroBlue()
   {
      Pixel[][] pixels = this.getPixels2D();
      for (Pixel[] rowArray : pixels)
      {
         for (Pixel pixelObj : rowArray)
         {
            pixelObj.setBlue(0);
         }
      }
   }
   
   /** Method that mirrors the picture around a 
     * vertical mirror in the center of the picture
     * from left to right */
   public void mirrorVertical()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int width = pixels[0].length;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; col < width / 2; col++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][width - 1 - col];
            rightPixel.setColor(leftPixel.getColor());
         }
      } 
   }
   
   /** Mirror just part of a picture of a temple */
   public void mirrorTemple()
   {
      int mirrorPoint = 276;
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int count = 0;
      Pixel[][] pixels = this.getPixels2D();
      
      // loop through the rows
      for (int row = 27; row < 97; row++)
      {
         // loop from 13 to just before the mirror point
         for (int col = 13; col < mirrorPoint; col++)
         {
            
            leftPixel = pixels[row][col];      
            rightPixel = pixels[row]                       
                             [mirrorPoint - col + mirrorPoint];
            rightPixel.setColor(leftPixel.getColor());
            count++;
         }
         System.out.println(count);
      }
   }
   
   /** copy from the passed fromPic to the
     * specified startRow and startCol in the
     * current picture
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
   public void copy(Picture fromPic, 
                  int startRow, int startCol)
   {
      Pixel fromPixel = null;
      Pixel toPixel = null;
      Pixel[][] toPixels = this.getPixels2D();
      Pixel[][] fromPixels = fromPic.getPixels2D();
      for (int fromRow = 0, toRow = startRow; 
            fromRow < fromPixels.length &&
            toRow < toPixels.length; 
            fromRow++, toRow++)
      {
         for (int fromCol = 0, toCol = startCol; 
               fromCol < fromPixels[0].length &&
               toCol < toPixels[0].length;  
               fromCol++, toCol++)
         {
            fromPixel = fromPixels[fromRow][fromCol];
            toPixel = toPixels[toRow][toCol];
            toPixel.setColor(fromPixel.getColor());
         }
      }   
   }

   /** Method to create a collage of several pictures */
   public void createCollage()
   {
      Picture flower1 = new Picture("flower1.jpg");
      Picture flower2 = new Picture("flower2.jpg");
      this.copy(flower1,0,0);
      this.copy(flower2,100,0);
      this.copy(flower1,200,0);
      Picture flowerNoBlue = new Picture(flower2);
      flowerNoBlue.zeroBlue();
      this.copy(flowerNoBlue,300,0);
      this.copy(flower1,400,0);
      this.copy(flower2,500,0);
      this.mirrorVertical();
      this.write("collage.jpg");
   }
   
   
   /** Method to show large changes in color 
     * @param edgeDist the distance for finding edges
     */
   public void edgeDetection(int edgeDist)
   {
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      Pixel[][] pixels = this.getPixels2D();
      Color rightColor = null;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; 
               col < pixels[0].length-1; col++)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][col+1];
            rightColor = rightPixel.getColor();
            if (leftPixel.colorDistance(rightColor) > 
                 edgeDist)
               leftPixel.setColor(Color.BLACK);
            else
               leftPixel.setColor(Color.WHITE);
         }
      }
   }
   
   public void keepOnlyBlue() {
      Pixel [][] pict = this.getPixels2D();
      for (Pixel [] row : pict)
         for (Pixel pixel : row) {
            pixel.setGreen(0);
            pixel.setRed(0);
         }
   }
   
   public void negate() {
      Pixel [][] pict = this.getPixels2D();
      for (Pixel [] row : pict)
         for (Pixel pixel : row) {
            pixel.setRed(255-pixel.getRed());
            pixel.setGreen(255-pixel.getGreen());
            pixel.setBlue(255-pixel.getBlue());
         }
   }
   
   public void grayscale() {
      Pixel [][] pict = this.getPixels2D();
      for (Pixel [] row : pict)
         for (Pixel pixel : row) {
            int avg = 0;
            avg += pixel.getRed();
            avg += pixel.getGreen();
            avg += pixel.getBlue();
            avg /= 3;
            pixel.setColor(new Color(avg,avg,avg));
         }
   }
   
   public void fixUnderwater() {
      // Highlights all of the fish in red.
      // There are five fish.
      // The data is a bit noisy, but I am still
      // trying to work out a good filter.
      Pixel [][] pict = this.getPixels2D();
      
      for (Pixel [] row : pict) {
         for (int i = 0; i < row.length; i++) {
            Pixel pixel = row[i];
            if (pixel.getRed() <= 30 && pixel.getBlue() >= 155) {
               int tmp = pixel.getRed();
               pixel.setRed(pixel.getBlue());
               pixel.setBlue(tmp);
               pixel.setGreen(0);
            }
         }
      }
   }
   
   public void mirrorVerticalRightToLeft()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      int width = pixels[0].length;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = width-1; col > width / 2; col--)
         {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][width - 1 - col];
            rightPixel.setColor(leftPixel.getColor());
         }
      } 
   }
   
   public void mirrorHorizontal()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      for (int row = 0; row < height/2; row++)
      {
         for (int col = 0; col < pixels[0].length; col++)
         {
            topPixel = pixels[row][col];
            bottomPixel = pixels[height - 1 - row][col];
            bottomPixel.setColor(topPixel.getColor());
         }
      } 
   }
   
   public void mirrorHorizontalBotToTop()
   {
      Pixel[][] pixels = this.getPixels2D();
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      int height = pixels.length;
      for (int row = 0; row < height/2; row++)
      {
         for (int col = 0; col < pixels[0].length; col++)
         {
            topPixel = pixels[row][col];
            bottomPixel = pixels[height - 1 - row][col];
            topPixel.setColor(bottomPixel.getColor());
         }
      } 
   }
   
   public void mirrorDiagonal()
   {
      Pixel [][] pixels = this.getPixels2D();
      Pixel leftPixel = null;
      Pixel rightPixel = null;
      for (int row = 0; row < pixels.length; row++)
      {
         for (int col = 0; col < row; col++) {
            leftPixel = pixels[row][col];
            rightPixel = pixels[col][row];
            rightPixel.setColor(leftPixel.getColor());
         }
      }
   }

   public void mirrorArms()
   {
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      Pixel[][] pixels = this.getPixels2D();
      
      for (int row = 158; row < 191; row++)
      {
         for (int col = 105; col < 170; col++)
         {
            
            topPixel = pixels [row][col];      
            bottomPixel = pixels [191 - row + 191][col];
            bottomPixel.setColor(topPixel.getColor());
         }
      }
      for (int row = 172; row < 196; row++)
      {
         for (int col = 239; col < 294; col++)
         {
            
            topPixel = pixels [row][col];      
            bottomPixel = pixels [196 - row + 196][col];
            bottomPixel.setColor(topPixel.getColor());
         }
      }
   }
   
   public void mirrorGull()
   {
      Pixel topPixel = null;
      Pixel bottomPixel = null;
      Pixel[][] pixels = this.getPixels2D();
      
      for (int row = 234; row < 323; row++)
      {
         for (int col = 238; col < 344; col++)
         {
            
            topPixel = pixels [row][col];      
            bottomPixel = pixels [row][344 - col + 344];
            bottomPixel.setColor(topPixel.getColor());
         }
      }
   }
   
   public void copy(Picture fromPic, int fromStartRow, int fromStartCol,
                  int fromEndRow, int fromEndCol,
                  int startRow, int startCol)
   {
      Pixel fromPixel = null;
      Pixel toPixel = null;
      Pixel[][] toPixels = this.getPixels2D();
      Pixel[][] fromPixels = fromPic.getPixels2D();
      for (int fromRow = fromStartRow, toRow = startRow; 
            fromRow < fromEndRow &&
            toRow < toPixels.length; 
            fromRow++, toRow++)
      {
         for (int fromCol = fromStartCol, toCol = startCol; 
               fromCol < fromEndCol &&
               toCol < toPixels[0].length;  
               fromCol++, toCol++)
         {
            fromPixel = fromPixels[fromRow][fromCol];
            toPixel = toPixels[toRow][toCol];
            toPixel.setColor(fromPixel.getColor());
         }
      }   
   }
   
   public void myCollage() {
      Picture one = new Picture("snowman.jpg");
      Picture two = new Picture("water.jpg");
      Picture three = new Picture("swan.jpg");
      
      two.fixUnderwater();
      one.mirrorArms();
      three.grayscale();
      
      this.copy(one, 150, 100, 230, 300, 0, 0);
      this.copy(two, 0, 160, 150, 465, 0, 840);
      this.copy(three, 65, 85, 310, 395, 265, 140);
      this.write("myCollage.jpg");
   }
      
      
   /* Main method for testing - each class in Java can have a main 
    * method 
    */
   public static void main(String[] args) 
   {
      Picture [] pics = new Picture [4];
      pics [0] = new Picture("snowman.jpg");
      pics [1] = new Picture("water.jpg");
      pics [2] = new Picture("swan.jpg");
      pics [3] = new Picture("myPicture.jpg");
      
      for (Picture p : pics)
         p.explore();
      //beach.copy();
      //beach.explore();
   }
   
} // this } is the end of class Picture, put all new methods before this
