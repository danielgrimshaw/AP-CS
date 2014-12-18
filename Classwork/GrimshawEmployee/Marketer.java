// A class to represent marketers.

// Add class header below
public class Marketer extends Employee{
   public Marketer() {
      super();
      super.setSalary(super.getSalary()+10000);
   }
   
   public Marketer(String name) {
      super(name);
      super.setSalary(super.getSalary()+10000);
   }
   
   // Add method advertise() that prints "Act now while supplies last!"
   public void advertise() {
      System.out.println("Act now while supplies last!");
   }
}
