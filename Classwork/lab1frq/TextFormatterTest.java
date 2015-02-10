public class TextFormatterTest {
   public static void main(String[] args) {
      String line = "aabaccb";
      TextFormatter myText = new TextFormatter(line);
      // To run these tests, need to change findString to public
      System.out.println(myText.findString("a", 0)); // Result should be 3
      System.out.println(myText.findString("b", 4)); // Result should be 6
      System.out.println(myText.findString("c", 0)); // Result should be -1
      System.out.println();
      
      // To run these tests, need to change countStrings to public
      System.out.println(myText.countStrings("a")); // Result should be 1
      System.out.println(myText.countStrings("b")); // Result should be 2
      System.out.println(myText.countStrings("c")); // Result should be 0
      System.out.println();
      
      // Output is: This is <I>very</I> good.
      String line1 = "This is _very_ good.";
      TextFormatter myText1 = new TextFormatter(line1);
      System.out.println(myText1.convertItalics());
      
      // Output is: <I>This</I> is <I>very</I> <I>good</I>.
      String line2 = "_This_ is _very_ _good_.";
      TextFormatter myText2 = new TextFormatter(line2);
      System.out.println(myText2.convertItalics());
      
      // Output is: This is _very good.
      String line3 = "This is _very good.";
      TextFormatter myText3 = new TextFormatter(line3);
      System.out.println(myText3.convertItalics());
      
      // Output is: This is __very good.
      String line4 = "This is __very good.";
      TextFormatter myText4 = new TextFormatter(line4);
      System.out.println(myText4.convertItalics());
   }
}

