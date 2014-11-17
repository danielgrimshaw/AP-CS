public class GrimshawSum {
   public static void main() {
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
   
   public static int [] generateIntArray(String number) {
      return generateIntArray(number, 10);
   }
   
   public static int [] generateIntArray(String number, int radix)  {
      int cursor = 0, numDigits;
      final int len = number.length();
      if (radix <  Character.MIN_RADIX || radix  > Character.MAX_RADIX)
          throw new NumberFormatException("Radix out of range");
      if (len == 0)
          throw new NumberFormatException("Zero length string");
      // Skip leading zeros and compute number of digits in magnitude
      while (cursor <  len && Character.digit(number.substring(cursor,cursor+1), radix) == 0)
          cursor++;
      if (cursor == len) {
          signum = 0;
          mag = ZERO.mag;
          return;
      }
      numDigits = len - cursor;
      signum = sign;
      // Pre-allocate array of expected size. May be too large but can
      // never be too small. Typically exact.
      int numBits = (int)(((numDigits * bitsPerDigit[radix])  > > > 10) + 1);
      int numWords = (numBits + 31)  > > > 5;
      int[] magnitude = new int[numWords];
      // Process first (potentially short) digit group
      int firstGroupLen = numDigits % digitsPerInt[radix];
      if (firstGroupLen == 0)
          firstGroupLen = digitsPerInt[radix];
      String group = number.substring(cursor, cursor += firstGroupLen);
      magnitude[numWords - 1] = Integer.parseInt(group, radix);
      if (magnitude[numWords - 1] <  0)
          throw new NumberFormatException("Illegal digit");
      // Process remaining digit groups
      int superRadix = intRadix[radix];
      int groupVal = 0;
      while (cursor <  len) {
          group = number.substring(cursor, cursor += digitsPerInt[radix]);
          groupVal = Integer.parseInt(group, radix);
          if (groupVal <  0)
              throw new NumberFormatException("Illegal digit");
          destructiveMulAdd(magnitude, superRadix, groupVal);
      }
      // Required for cases where the array was overallocated.
      mag = trustedStripLeadingZeroInts(magnitude);
   }
}
      