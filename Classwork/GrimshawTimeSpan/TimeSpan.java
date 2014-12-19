public class TimeSpan {
   private int hours;
   private int minutes;

   public TimeSpan(int hours1, int minutes1) {
      hours = 0;
      minutes = 0;
      add(hours1, minutes1);
   }

   public void add(int hours1, int minutes1) {
      hours += hours1;
      minutes += minutes1;
      while (minutes >= 60) {
         minutes -= 60;   // convert 60 min --> 1 hour
         hours++;
      }
   }

   public void add(TimeSpan time) {
      add(time.hours, time.minutes);
   }

   public double getTotalHours() {
      return hours + minutes / 60.0;
   }

   public int getTotalMins() {
      return hours*60 + minutes;
   }

   public boolean equals(Object o) {
      if (o instanceof TimeSpan) {
         TimeSpan other = (TimeSpan) o;
         return (this.getTotalMins() == other.getTotalMins());
      } else {
         return false;
      }
   }

   public String toString() {
      return hours + "h" + minutes + "m";
   }
}
