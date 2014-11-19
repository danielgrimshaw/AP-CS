public class GrimshawSum {
   public static final int ARRAY_SIZE = 25;
   
   public static void main(String[] args) {
      String nums[] = {"82384 ", 
                       "204 435 ",
                       "22 31 12 ",
                       "999 483 ", 
                       "28350 28345 39823 95689 234856 3482 55328 934803 ",
                       "7849323789 22398496 8940 32489 859320 ",
                       "729348690234239 542890432323 534322343298 ",
                       "3948692348692348693486235 5834938349234856234863423 ",
                       "999999999999999999999999 432432 58903 34 ",
                       "82934 49802390432 8554389 4789432789 0 48372934287 ",
                       "0 ",
                       "0 0 0 ",
                       "7482343 0 4879023 0 8943242 ",
                       "3333333333 4723 3333333333 6642 3333333333 "};
      processStrings(nums);
   }
   
   public static void processStrings(String[] nums) {
      for (String s : nums) {
         int words = getInstancesOf(" ", s);
         String [] strings = new String[words];
         getStrings(strings, s);
         int [][] numbers = new int [words][ARRAY_SIZE];
         for (int i = 0; i < strings.length; i++)
            numbers[i] = generateIntArray(strings[i]);
         for (int i =0; i < numbers.length; i++) {
            for (int j : numbers[i]) {
               System.out.print(i);
            }
            if (i < numbers.length-1)
               System.out.print(" + ");
         }
         System.out.println(" = "+toString(add(numbers)));
      }
   }
   
   public static int [] add(int [][] numbers){
      return numbers[0];
   }
   
   public static String toString(int [] number) {
      String str = new String;
      
   
   public static void getStrings(String [] strings, String s) {
      for (int i = 0; i < strings.length; i++) {
         strings[i] = s.substring(0, s.indexOf(" "));
         s = s.substring(s.indexOf(" "));
      }
   }
   
   public static int getInstancesOf(String pattern, String source) {
      int ans = 0;
      while (!source.equals(" ")) {
         source = source.substring(source.indexOf(pattern));
         ans++;
      }
      return ans;
   }
   
   public static int [] generateIntArray(String number)  {
      int num = Integer.parseInt(number);
      int [] ans = new int [number.length()];
      int i = 0;
      while (num != 0) {
         ans[ans.length-i-1] = num % 10;
         num /= 10;
         i++;
      }
      return addBuffer(ans);
   }
   
   public static int [] addBuffer(int [] number) {
      int [] ans = new int[ARRAY_SIZE];
      for (int i = 0; i < number.length; i++)
         ans[ARRAY_SIZE-i-1] = number[number.length-i-1];
      return ans;
   }
}
