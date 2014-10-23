/**
 * 1)
 * a.	“2 + 2” + 3 + 4 = 2 + 234
 * b.	2 + “ 2 + 3 “ + 4 = 2 2 + 3 4
 * c.	3 + 4 + “ 2 + 2” = 7 2 + 2
 * d.	“(2 + 2) + “ + (3 + 4)  = (2 + 2) + 7
 * e.	“hello 34 “ + 2 * 4 = hello 34 8
 * f.	2 + “(int) 2.0” + 2 * 2 + 2 = 2(int) 2.042
 * g.	4 + 1 + 9 + “.” + (-3 + 10) + 11 / 3 = 14.73
 * h.	“1” + 2 + 3 + “4” + 5 + 6 + “7” + (8 + 9) = 123456717
 *
 * 2)
 * 46
 * 36
 * 23
 * 13
 *
 * GrimshawStringsVars is a number comparing class.
 * Currently it is only able to find the lcm (lowest
 * common multiple) of any two numbers. This does not
 * work with negatives.
 *
 * @author "Daniel Grimshaw"
 * @version "0.0.1"
 */

import java.io.*;

public class GrimshawStringsVars {
   private int num1, num2;
   
   public static int readInt() throws IOException {
      try {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Number: ");
         int i = Integer.parseInt(br.readLine());
         return i;
      } catch (IOException e) {
         System.out.println("Error: Input Output Error!\nAbort.");
         System.exit(1);
      }//error handling
      return 1;
   }//readInt
   
   public GrimshawStringsVars() throws IOException{
      this(readInt(), readInt());
   }
   
   public GrimshawStringsVars(int num1) {
      this(num1, 0);
   }
   
   public GrimshawStringsVars(int num1, int num2) {
      this.num1 = num1;
      this.num2 = num2;
   }
   
   private void disp(Object ans) {
      System.out.println(ans);
   }
   
   public void newLine() {
      disp();
   }
   
   private void disp() {
      System.out.println();
   }
   
   public void echo(Object ans) {
      disp(ans);
   }

   public int lcm() {
      return lowestCommonMultiple();
   }
   
   public int lcm(int num1) {
      return num1;
   }
   
   public int lcm(int num1, int num2) {
      GrimshawStringsVars tmp = new GrimshawStringsVars(num1, num2);
      return tmp.lcm();
   }
   
   private int lowestCommonMultiple() {
      int c = 0,d = 1,e = 1,f = 1;
      if ((this.num1 <= 0 ^ this.num2 <= 0) && (this.num1 != 0 || this.num2 != 0)) { 
         disp("No real answer!");
         return 1;
      }
      
      if (this.num1 < 0  && this.num2 < 0) {
         disp("Negatives are NOT supported!");
         return 1;
      }
      
      if (this.num1 == 0 || this.num2 == 0) {
         disp();
         disp("num1 "+this.num1);
         disp("num2 "+this.num2);
         disp("c 0");
         return 0;
      }
      
      if (this.num1 >= this.num2) {
         if (this.num2 == 1)
            c = d = this.num1;
            
         while (c != d) {
            c = this.num1 * e;
            for (f = 1; true; f++) {
               d = f * this.num2;
               if (c <= d)
                  break;
            }
            e += 1;
            f = 1;
         }
      } else {
         if (this.num1 == 1)
            c = d = this.num2;
         
         while (c != d) {
            d = this.num2 * f;
            for (e = 1; true; e++) {
               c = e*this.num1;
               if (c >= d)
                  break;
            }
            f += 1;
            e = 1;
         }
      }
      disp();
      disp("num1 "+this.num1);
      disp("num2 "+this.num2);
      disp("c "+c);
      return c;
   }//lcm
   
   public static void main(String[] args) throws IOException{
      int num1 = readInt();
      int num2 = readInt();
      GrimshawStringsVars numCmp = new GrimshawStringsVars(num1, num2);
      numCmp.newLine();
      numCmp.lcm();
      numCmp.newLine();
      numCmp.lcm(readInt(), readInt());
      numCmp.newLine();
      new GrimshawStringsVars().lcm();
   }
}//GrimshawStringsVars Class