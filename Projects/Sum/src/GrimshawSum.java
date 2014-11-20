//GrimshawSum.java --> Daniel Grimshaw's adding oversized integers project

//should work for all sizes of integers
public class GrimshawSum {
   public static final int ARRAY_SIZE = 25; //the maximum size of the array (change if necessary)
   
   public static void main(String[] args) { //very basic essence of how the program runs
      String [] nums = {"82384 ", 
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
                        "3333333333 4723 3333333333 6642 3333333333 "
                       };//all of the input for the whole program
      processStrings(nums); //run the program
   }
   
   public static void processStrings(String[] nums) {
      //The low-level main code
      //This is essentially what the main would look like if this was C
      int lineCount = 0; //keeps track of how many strings (output lines) have been processed
      
      for (String s : nums) { //process each command string from the array
         int words = getInstancesOf(" ", s); //counts how many numbers we are adding
         //^^^ really just counts how many spaces there are in the string
         String [] strings = new String[words]; //an array to temporarily hold all of the numbers
                                                //(now separated) before we convert them all to ints
         getStrings(strings, s); //fills the aforementioned array
         int [][] numbers = new int [words][ARRAY_SIZE]; //a 2D array to hold all of the integers represented
                                                         //in String s. Each row is one of the integer arrays 
                                                         //with all of the buffering zeros
         for (int i = 0; i < strings.length; i++) //fill the previously mentioned array
            numbers[i] = generateIntArray(strings[i]); //make an integer array out of the number String
         for (int i = 0; i < numbers.length; i++) { //output to the user what is being added
            System.out.print(toString(numbers[i]));
            if (i < numbers.length-1){ //are we not at the last number in the list?
               System.out.print(" + ");
            }
         }
         System.out.println(" = "+toString(add(numbers))); //add and print the numbers
         lineCount++; //increment the number of strings that have been processed.
      }
      System.out.println("Total lines = "+lineCount); //print calculation statistics
   }
   
   public static int [] add(int [][] numbers) {//The addition algorithm:
                                               //should work no matter how large the integer is.
                                               //(has been partially tested with two million digit integers!)
                                               //^^^(the above test failed; all three computers trying to process
                                               //    these numbers (running simultaneously) crashed after about
                                               //    two minutes)
      int [] ans = new int[ARRAY_SIZE]; //the overall sum
      int carry = 0; //the carry of the addition, it along with
                     //all other variables in this program could be a byte
                     //(even the oversized integers could be byte arrays)
                     //but I wasn't sure if this would be allowed in with
                     //the style requirements
      for (int i = ARRAY_SIZE-1; i >= 0; i--) { //this is the for loop that actually adds all of the numbers
         int sum = 0; //the total sum for all of the arrays in position i
                      //this is the only variable in the whole program that actually needs to be an int
         for (int [] array : numbers)
            sum += array[i];//add each numbers ith element to sum
         sum += carry; //add the previous iteration's carry
         ans[i] = sum %10; //we only want the first digit of sum
         carry = sum/10;//the rest is the carry
      }
      return ans; //return the answer
   }
   
   public static String toString(int [] number) {//sets up a raw integer array to a string of the integer
      String str = new String(); //this is going to be the final result
      int i = 0; //need a toString scope variable to serve as an index
      while (i < ARRAY_SIZE-1 && number[i] == 0) //skip all of the zeros by adding one to i for each one
         i++;                                    //(should leave at least one element left to read)
      for (i = i; i < number.length; i++) //begin reading the remaining elements
           //^^^ I don't like how java requires you to assign i to itself here, there should be a shortcut
           //    for when you have a predefined index var, such as for (i; i < number.length; i++){}
         str += number[i]; //add the significant number to the final answer
      return str; //return the final answer
   }
   
   public static void getStrings(String [] strings, String s) { //reads each token from the String s
                                                                //and adds it to the token array, strings
      for (int i = 0; i < strings.length; i++) { //traverse through the strings array (size is defined in processStrings)
         strings[i] = s.substring(0, s.indexOf(" ")); //reads up to the first space
         s = s.substring(s.indexOf(" ")+1);//delete what has been read and the space from the input String
      }
   }
   
   public static int getInstancesOf(String pattern, String source) { //counts how many times pattern occurs in source
      int ans = 0; //count
      while (!source.equals("")) {//while source hasn't been fully truncated
         source = source.substring(source.indexOf(pattern)+1); //delete up to and including the first occurance of pattern
         ans++; //unfortunately, implementing this in this way forces ans to be at least one
                //however, if we have a String with no arguements, the code should not work.
      }
      return ans; //returns the count
   }
   
   public static int [] generateIntArray(String number) { //creates an array of digits from a String
      int [] ans = new int [number.length()]; //the array of digits (notice it has no buffering)
      for (int i = 0; i < number.length(); i++) //traverse through the String looking at each digit
         ans[i] = number.charAt(i)-'0'; //by subtracting '0' we get an integer value 0-9 ('0' evaluates
                                        //to the UTF-8 code for character '0' (47 I think))
      return addBuffer(ans); //returns the digit array, after giving it a buffer to ARRAY_SIZE elements
   }
   
   public static int [] addBuffer(int [] number) {//gives the digit array a buffer of ARRAY_SIZE
      int [] ans = new int[ARRAY_SIZE]; //the new digit array
      for (int i = 0; i < number.length; i++) //add the original number to the new array
         ans[ARRAY_SIZE-i-1] = number[number.length-i-1]; //the array is automatically all zeros,
                                                          //so we add the other digits to the very end
      return ans; //return the now buffered array
   }
}
