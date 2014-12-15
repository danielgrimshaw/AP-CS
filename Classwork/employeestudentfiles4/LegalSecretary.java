// A class to represent legal secretaries.

// Add class header below
public class LegalSecretary extends Secretary {
  
  		// Add method fileLegalBriefs that prints "I could file all day!"
      public void fileLegalBriefs() {
         System.out.println("I could file all day!");
      }

		// Add method that overrides getSalary from Employee class
      // for salary of 45000.0 per year
      public double getSalary() {
         return 45000.0;
      }
}