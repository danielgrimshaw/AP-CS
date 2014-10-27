public class Temp {
   public static void main(String[] args) {
      String s = "If at first you don't succeed, try, try again.";
      String t = new String ("If at first you don't succeed, try, try again");
System.out.println(s.equals(t));
System.out.print(s == t);
}
}