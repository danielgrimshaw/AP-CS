import java.util.*;

public class ClockTime implements Comparable<ClockTime> {
   private int hours, minutes;
   private boolean am;
   
   public ClockTime(int hours, int minutes, String amPm) {
      this.setTime(hours, minutes, amPm.equalsIgnoreCase("am"));
   }
   
   public void setTime(int hours, int minutes, String amPm) {
      this.setTime(hours, minutes, amPm.equalsIgnoreCase("am"));
   }
   
   private void setTime(int hours, int minutes, boolean am) {
      if (this.isValidTime(hours, minutes)) {
         this.hours = hours;
         this.minutes = minutes;
         this.am = am;
      } else {
         Object [] newTime = this.correctTime(hours, minutes, am);
         this.setTime((int)newTime[0], (int)newTime[1], (boolean)newTime[2]);
      }
   }
   
   private boolean isValidTime(int hours, int minutes) {
      return hours<=12 && minutes<60;
   }
   
   private Object[] correctTime(int oldHours, int oldMinutes, boolean oldAm) {
      Object [] newTime = new Object [3];
      oldHours += oldMinutes/60;
      oldMinutes %= 60;
      while (oldHours > 12) {
         oldHours -= 12;
         oldAm = !oldAm;
      }
      
      newTime[0] = (Object)oldHours;
      newTime[1] = (Object)oldMinutes;  
      newTime[2] = (Object)oldAm;
      return newTime;
   }
   
   public int getHours() {
      return this.hours;
   }
   
   public int getMinutes() {
      return this.minutes;
   }
   
   public String getAmPm() {
      return this.am ? "am" : "pm";
   }
   
   public String toString() {
      return this.hours + ":" + this.minutes + " " + this.getAmPm();
   }
   
   public int compareTo(ClockTime other) {
      int otherTotal = 0;
      int total = 0;
      if (!other.am)
         otherTotal += 12*60;
      if (!this.am)
         total += 12*60;
      otherTotal += other.hours*60 + other.minutes;
      total += this.hours*60 + this.minutes;
      return total-otherTotal;
   }
}