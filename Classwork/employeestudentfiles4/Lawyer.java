// A class to represent Lawyer that extends Employee class

// Add class header below
public class Lawyer extends Employee{
    // Add method that overrides getVacationForm from Employee class
	 // for pink form
    public String getVacationForm() {
      return "pink";
    }
     
    // Add method that overrides getVacationDays from Employee class
    // for 3 weeks of vacation 
    public int getVacationDays() {
      return 15;
    }
		
		
	 // Add method sue() that prints "I'll see you in court!"
    public void sue() {
      System.out.println("I\'ll see you in court!");
    }

}
