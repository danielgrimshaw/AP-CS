// A class to represent Lawyer that extends Employee class

// Add class header below
public class Lawyer extends Employee{
   public Lawyer() {
      super();
      super.setVacationForm("pink");
      super.setVacationDays(super.getVacationDays()+5);
      
   }
   
   public Lawyer(String name) {
      super(name);
      super.setVacationForm("pink");
      super.setVacationDays(super.getVacationDays()+5);
   }
   // Add method sue() that prints "I'll see you in court!"
   public void sue() {
      System.out.println("I\'ll see you in court!");
   }

}
