public class TextFormatter {
   private String line;
   
   public TextFormatter (String lineToFormat) {
      line = lineToFormat;
   }
   
   private int findString(String str, int start) {
      int index = line.indexOf(str,start);
      while (index != -1) {
         if (!(line.substring(index+1,index+2).equals(str)))
            break;
         index = line.indexOf(str, index+1);
      }
      return index;
   }
   
   private int countStrings(String str) {
      int count = 0;
      int start = 0;
      while (findString(str, start) != -1) {
         count++;
         start = findString(str, start)+1;
      }
      return count;
   }
      
   public String convertItalics() {
      if (countStrings("_")%2 == 1)
         return line;
      String newLine = "";
      int start = 0;
      int count = 0;
      while (findString("_", start) != -1) {
         newLine += line.substring(start, findString("_", start));
         if (count % 2 == 0)
            newLine += "<I>";
         else
            newLine += "</I>";
         count++;
         start = findString("_", start)+1;
      }
      return newLine;
   }
}