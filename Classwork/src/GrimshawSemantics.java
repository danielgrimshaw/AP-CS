import java.util.*;

public class GrimshawSemantics {
   public static void main(String[] args) {
      // value semantics - behavior where values are copied when
      // assigned, passed as parameters, or returned
      
      // all primitive types in Java are value semantics
      
      // When one variable is assigned to another, its value
      // is copied
      
      // Modifying the value of one variable does not affect
      // others. Each has a unique memory address.
      
      // Pass by value
      
      // Example:
      int x = 8;
      int y = x;
      y = 17;
      System.out.println("x = "+x+", y = "+y+": "+x+" "+y);


      
      // reference semantics - behavior where variables
      // actually store the ADDRESS of an object in memory.
      
      // When one variable is assigned to another, 
      // the object is NOT copied.
      // Both variables refer to the same object.
      
      // Modifying the value of one variable will affect
      // others.
      
      // Pass by value, too - but value is a reference 
      // for objects, so some say pass by reference
      
      // AP says all are pass by value, with objects
      // is a reference to the data (is a memory address)
      
      // Arrays are objects
      // In memory, there is the variable that stores a 
      // reference to the array and there is the object
      // Array elements can be objects or primitives.
      // but must be the same type for a given array
      
      // Example:
      int [] a1 = {4,15,8};
      int [] a2 = a1;
      a2[0] = 7;
      System.out.println("a1 is: "+Arrays.toString(a1));
      System.out.println("a2 is: "+Arrays.toString(a2));

      
      /* Arrays and objects use reference semantics 
         because ......
         efficiency - copying large objects slows down
         a program
         sharing - useful to share object's data 
         among methods
      */
      
      /* When a primitive is passed as a parameter, the
         primitive is copied. The parameter is a
         copy of the value in the passed primitive. 
         If the parameter is modified, it will NOT
         affect the original primitive.
      */
      // Example:
      int a = 10;
      double b = 5.5;
      boolean t = true;
      System.out.println("a, b, t is "+a+" "+b+" "+t);
      changePrimitives(a,b,t);
      System.out.println("a, b, t is "+a+" "+b+" "+t);
      
      
      /* When an object is passed as a parameter, the 
         object is NOT copied. The parameter REFERS
         to the same object. If the parameter is
         modified, it will affect the original object.
      */
      // Example: Array of Strings
      String [] firstNames = {"Sam", "Mary","Jim","Nancy"};
      System.out.println("before: "+Arrays.toString(firstNames));
      swapNames(firstNames, 0, 2);
      System.out.println("after: "+Arrays.toString(firstNames));
      
      // Example: Array of ints and int
      int [] nums = {2,6,10,15};
      System.out.println("numbers[0] is: "+nums[0]);
      incrementVal(nums[0]);
      System.out.println("numbers[0] is: "+nums[0]);
      
      //Example: String is immutable
      String word = "Good Morning";
      System.out.println(word);
      reverseLetters(word);
      System.out.println(word);
      
      // Example: Arrays of Strings and String
      String [] words = {"Hi", "Hello", "Bye"};
      System.out.println(words[1]);
      reverseLetters(words[1]);
      System.out.println(words[1]);
      
      // null - Java keyword signifying no object
      
      // declare variable s1 of type String
      // do not create an object or assign anything to s
      // detfault assigment is null
      String s1; 
      // declare variable s2 of type String
      // explicity assign null to variable s
      String s2  = null; 
      // declare variable s3 of type String
      // create and assign the object "" to s3
      String s3 = "";
      
      // What happens when the following statements execute?
      // Uncomment and try each, one at a time
      //int num1 = s1.compareTo("");
      //System.out.println(num1);
      //int num2 = s2.compareTo("");
      //System.out.println(num2);
      int num3 = s3.compareTo("");
      System.out.println(num3);
     
   }
   public static void changePrimitives(int m, double n, boolean f) {m = 20; n = 15.2; f = !f;System.out.println("m, n, f is "+m+" "+n+" "+f);}
   
   public static void swapNames(String [] a, int index1, int index2) {
      String tmp = a[index2];
      a[index2] = a[index1];
      a[index1] = tmp;
   }
   public static void incrementVal(int n){
      ++n;
      System.out.println("n is: "+n);
   }
   public static void reverseLetters(String str) {
      String newStr = new String();
      for (int i = str.length()-1; i >= 0; i--) 
         newStr += str.substring(i,i+1);
      str = newStr;
      System.out.println("Reverse Letters: "+str);
   }
}

      
