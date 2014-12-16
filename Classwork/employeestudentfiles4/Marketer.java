// A class to represent marketers.

// Add class header below
public class Marketer extends Employee{
   public Marketer() {
      super();
   }
   
   public Marketer(String name) {
      super(name);
   }
		// Add method advertise() that prints "Act now while supplies last!"
   public void advertise() {
      System.out.println("Act now while supplies last!");
   }
		// Add method that overrides getSalary from Employee class
		// for salary of $50000.00 per year
   public double getSalary() {
      return super.getSalary() + 10000;
   }
}
