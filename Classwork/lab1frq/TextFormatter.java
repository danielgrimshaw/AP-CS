public class TextFormatter {
   private String line;
   
   public TextFormatter (String lineToFormat) {
      line = lineToFormat;
   }
   
   public int findString(String str, int start) {
      int index = line.indexOf(str,start);
      while (index != -1) {
         if (line.length() == index+1 || !(line.substring(index,index+2).equals(str+str)))
            break;
         if (line.substring(index,index+2).equals(str+str))
            index = line.indexOf(str, index+2);
         else
            index = line.indexOf(str, index+1);
      }
      return index;
   }
   
   public int countStrings(String str) {
      int count = 0;
      int start = 0;
      while (findString(str, start) != -1) {
         count++;
         start = findString(str, start)+1;
      }
      return count;
   }
      
   public String convertItalics() {
      if (countStrings("_")%2 == 1 || countStrings("_") == 0)
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